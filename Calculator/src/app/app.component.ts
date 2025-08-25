

import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule], // ✅ Add FormsModule here
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
typedName: any;
showname() {
throw new Error('Method not implemented.');
}
  num1: number = 0;
  num2: number = 0;
  result: number = 0;

  increment(field: string) {
    if (field === 'num1') this.num1++;
    if (field === 'num2') this.num2++;
  }

  decrement(field: string) {
    if (field === 'num1') this.num1--;
    if (field === 'num2') this.num2--;
  }

  add() {
    this.result = this.num1 + this.num2;
  }
  subtract() {
    this.result = this.num1 - this.num2;
  }
  multiply() {
    this.result = this.num1 * this.num2;
  }
  divide() {
    this.result = this.num1 / this.num2;
  }
}


