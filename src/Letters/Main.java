package Letters;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        HashMap<Character, Integer> letters = new HashMap<>();
        String text = "In 2010, the planetary defence team at NASA had identified and logged 90 per cent of the asteroids near Earth measuring 1km wide. These 'near-Earth objects', or NEOs, are the size of mountains and include anything within 50 million kilometres of Earth's orbit. With an estimated 50 left to log, NASA says none of the 887 it knows about are a significant danger to the planet.";

        for (int i = 0; i < text.length(); i++) {
            char chars = text.charAt(i);

            letters.put(chars, letters.getOrDefault(chars, 0) + 1);

        }
        for (Map.Entry<Character,Integer> e : letters.entrySet()){
            System.out.println(e);
        }






    }

}
