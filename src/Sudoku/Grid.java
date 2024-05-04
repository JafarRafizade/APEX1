package Sudoku;

import java.util.Random;

public class Grid {
    public static void shuffle(String[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {

            int randomIndex = random.nextInt(i + 1);


            String temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
