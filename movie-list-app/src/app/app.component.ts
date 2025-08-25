import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatSelectModule } from '@angular/material/select';
import { MatIconModule } from '@angular/material/icon';
import { NgFor, NgIf, NgClass } from '@angular/common';

interface Movie {
  title: string;
  posterUrl: string;
  genre: string;
  rating: number;
  description: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  standalone: true,
  imports: [
    MatCardModule,
    MatGridListModule,
    MatSelectModule,
    MatIconModule,
    NgFor,
    NgIf,
    NgClass
  ]
})
export class AppComponent {
  selectedGenre = '';
  genres = ['Action', 'Comedy', 'Drama', 'Sci-Fi'];

  movies: Movie[] = [
    {
      title: 'Bahubali',
      posterUrl: '/bahubali.jpg',
      genre: 'Action',
      rating: 5,
      description: 'A Epic Story For the kingdom'
    },
    {
      title: 'MAD',
      posterUrl: '/MAD .jpg',
      genre: 'Comedy',
      rating: 4,
      description: 'A hilarious adventure .'
    },
    // Add more movies as needed...
  ];

  get filteredMovies() {
    return this.selectedGenre
      ? this.movies.filter(m => m.genre === this.selectedGenre)
      : this.movies;
  }

  get averageRating() {
    return (
      this.movies.reduce((sum, m) => sum + m.rating, 0) / (this.movies.length || 1)
    ).toFixed(1);
  }
}