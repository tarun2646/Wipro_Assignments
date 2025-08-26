package assignment;
import java.util.concurrent.LinkedBlockingQueue;

class Task {
    int id;
    String description;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public String toString() {
        return "Task{id=" + id + ", description='" + description + "'}";
    }
}

public class stage_task_runner {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        // Add tasks to stage 1
        for (int i = 1; i <= 5; i++) {
            stage1.put(new Task(i, "Task " + i));
        }

        // Process Stage 1 -> Stage 2 (if even ID)
        while (!stage1.isEmpty()) {
            Task task = stage1.take();
            System.out.println("Processing in Stage 1: " + task);
            if (task.id % 2 == 0) {
                stage2.put(task);
            }
        }

        // Process Stage 2
        while (!stage2.isEmpty()) {
            Task task = stage2.take();
            System.out.println("Processing in Stage 2: " + task);
        }
    }
}

