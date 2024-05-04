package Game;

import java.util.Arrays;

public class Card {
    public Card() {
    }

    String[] Green = new String[]{
            "green0", "green1", "green2", "green3", "green4", "green5", "green6", "green7", "green8", "green9"
    };
    String[] Red = new String[]{
            "red0", "red1", "red2", "red3", "red4", "red5", "red6", "red7", "red8", "red9"
    };
    String[] Blue = new String[]{
            "blue0", "blue1", "blue2", "blue3", "blue4", "blue5", "blue6", "blue7", "blue8", "blue9"
    };
    String[] Yellow = new String[]{
            "yellow0", "yellow1", "yellow2", "yellow3", "yellow4", "yellow5", "yellow6", "yellow7", "yellow8", "yellow9"
    };




    @Override
    public String toString() {
        return "Card{" +
                "Green=" + Arrays.toString(Green) +
                ", Red=" + Arrays.toString(Red) +
                ", Blue=" + Arrays.toString(Blue) +
                ", Yellow=" + Arrays.toString(Yellow) +
                '}';
    }
}


