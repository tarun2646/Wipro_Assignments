import { Component } from '@angular/core';
import { NgFor, NgClass } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';

interface Song {
  name: string;
  artist: string;
  album: string;
  duration: string;
  rating: number;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    NgFor,
    NgClass,
    FormsModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatIconModule,
    MatButtonModule
  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Music-Playlist-App';
  songs: Song[] = [
    { name: 'Butta Bomma', artist: 'Armaan Malik', album: 'Ala Vaikuntapooram lo', duration: '3:18', rating: 4 },
    { name: 'Ye Tune Kya Kiya', artist: 'Pritam', album: 'Once Upon a time in Mumbai', duration: '5:14', rating: 5 },
    { name: 'Srivalli', artist: 'Sid Sriram', album: 'Pushpa', duration: '3:36', rating: 3 }
  ];

  filterArtist = '';
  filterAlbum = '';

  filteredSongs() {
    return this.songs.filter(song =>
      (this.filterArtist ? song.artist.toLowerCase().includes(this.filterArtist.toLowerCase()) : true) &&
      (this.filterAlbum ? song.album.toLowerCase().includes(this.filterAlbum.toLowerCase()) : true)
    );
  }
}