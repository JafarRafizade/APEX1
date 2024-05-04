package Spotify;

public class Rock implements Music {
    String title;
    String artist;

    public Rock(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getDetails() {
        return title + ", " + artist;
    }
}
