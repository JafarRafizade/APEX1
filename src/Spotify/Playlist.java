package Spotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist<T extends Playable>  {
    ArrayList<Music> songs;
    ArrayList<Podcast> podcasts;

    public Playlist(ArrayList<Music> songs, ArrayList<Podcast> podcasts) {
        this.songs = songs;
        this.podcasts = podcasts;
    }

    public void addToList(T playable) {

        if (playable instanceof Music) {
            songs.add((Music) playable);
        } else if (playable instanceof Podcast) {
            podcasts.add((Podcast) playable);
        }
    }
    public void printDetails() {
        System.out.println("Songs:");
        for (Music song : songs) {
            System.out.println(song.getDetails());
        }

        System.out.println("Podcasts:");
        for (Podcast podcast : podcasts) {
            System.out.println(podcast.getDetails());
        }
    }



}
