package methodTask1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] Squares = new double[5];
        double[] length = new double[5];
        double[] width = new double[5];
        for (int i = 0; i < Squares.length; i++) {
            length[i] = (int) (Math.random() * 10) + 1;
            width[i] = (int) (Math.random()* 10) + 1;
            System.out.println(length[i]);
            System.out.println();



        }

    }
}
