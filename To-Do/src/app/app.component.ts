import { Component, signal, computed } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

interface Todo {
  id: string;
  title: string;
  completed: boolean;
  createdAt: number;
}
type View = 'all' | 'active' | 'completed';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  newTitle = '';
  view = signal<View>('all');
  todos = signal<Todo[]>(this.load());

  editingId: string | null = null;
  editTitle = '';

  // ✅ Computed values
  filtered = computed(() => {
    const list = this.todos();
    switch (this.view()) {
      case 'active': return list.filter(t => !t.completed);
      case 'completed': return list.filter(t => t.completed);
      default: return list;
    }
  });
  remaining = computed(() => this.todos().filter(t => !t.completed).length);
  completedCount = computed(() => this.todos().filter(t => t.completed).length);

  // ✅ Methods
  add() {
    if (!this.newTitle.trim()) return;
    const t: Todo = {
      id: crypto.randomUUID(),
      title: this.newTitle.trim(),
      completed: false,
      createdAt: Date.now(),
    };
    this.todos.update(list => [t, ...list]);
    this.persist();
    this.newTitle = '';
  }

  toggle(id: string) {
    this.todos.update(list =>
      list.map(t => (t.id === id ? { ...t, completed: !t.completed } : t))
    );
    this.persist();
  }

  remove(id: string) {
    this.todos.update(list => list.filter(t => t.id !== id));
    this.persist();
  }

  clearCompleted() {
    this.todos.update(list => list.filter(t => !t.completed));
    this.persist();
  }

  setView(v: View) { this.view.set(v); }

  startEdit(t: Todo) {
    this.editingId = t.id;
    this.editTitle = t.title;
  }
  cancelEdit() { this.editingId = null; this.editTitle = ''; }
  commitEdit() {
    if (this.editingId && this.editTitle.trim()) {
      this.todos.update(list =>
        list.map(t => (t.id === this.editingId ? { ...t, title: this.editTitle.trim() } : t))
      );
      this.persist();
    }
    this.cancelEdit();
  }

  private persist() {
    localStorage.setItem('todos:v1', JSON.stringify(this.todos()));
  }
  private load(): Todo[] {
    try {
      const raw = localStorage.getItem('todos:v1');
      return raw ? JSON.parse(raw) as Todo[] : [];
    } catch {
      return [];
    }
  }
}