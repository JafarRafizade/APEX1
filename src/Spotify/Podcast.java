package Spotify;

public class Podcast implements Playable {
    String title;

    public Podcast(String title) {
        this.title = title;
    }

    @Override
    public String getDetails() {
        return title ;
    }
}
