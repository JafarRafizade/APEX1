package Spotify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pop pop = new Pop("Billie Jean","Michael Jackson");
        Rock rock = new Rock("Stairway to Heaven","Led Zeppelin");
        Classical classical = new Classical("Four Seasons","Antonio Vivaldi");
        Podcast podcast = new Podcast("Sohbatgah");
        ArrayList<Music> songs = new ArrayList<>();
        ArrayList<Podcast> podcasts = new ArrayList<>();


        Playlist<Playable> playlist = new Playlist<>(songs,podcasts);
        playlist.addToList(pop);
        playlist.addToList(rock);
        playlist.addToList(classical);
        playlist.addToList(podcast);
        playlist.printDetails();

    }
}
