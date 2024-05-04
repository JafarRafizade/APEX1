package Spotify;

public class Classical implements Music{
    String title;
    String artist;

    public Classical(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getDetails() {
        return title + ", " + artist;
    }
}
