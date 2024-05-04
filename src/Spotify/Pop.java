package Spotify;

public class Pop implements Music {
    String title;
    String artist;

    public Pop(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getDetails() {
        return title + ", " + artist;
    }
}
