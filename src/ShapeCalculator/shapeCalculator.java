package ShapeCalculator;

import java.util.Scanner;

public class shapeCalculator {


    public int areaRec(int length, int width) {
        return length * width;

    }

    public int areaTri(int base, int height) {
        return (base * height) / 2;

    }

    public int areaCircle(int radius) {
        return (int) (Math.PI * radius * radius);

    } public static boolean checkAnswer(int answer, int correctAnswer) {
        // Case-insensitive comparison to check the validity of the answer
        return answer==correctAnswer;
    }


}

