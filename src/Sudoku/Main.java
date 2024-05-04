package Sudoku;

import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[][] grid = new String[9][9];


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = String.valueOf(j + 1);

            }
        }
//        boolean isEqual = true;
//        do {
//        for (int i = 0; i < grid.length; i++) {
//
//            shuffle(grid[i]);
//        }

        while (checkColumns(grid)) {
            for (int i = 0; i < 9; i++) {
                shuffle(grid[i]);

            }
        }
//        for (int i = 0; i < 9; i++) {
//            shuffle(grid[i]);
//
//        }


//        while (checkColumns(grid));


        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j]);

            }

        }

    }

    public static void shuffle(String[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {

            int randomIndex = random.nextInt(i + 1);


            String temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;
        }
    }

    public static boolean checkColumns(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 1; k < array.length; k++) {
                    if (Objects.equals(array[i][j], array[i][k])) {
                        return true;
                    }

                }



            }
            
        }
        return false;

    }
}


