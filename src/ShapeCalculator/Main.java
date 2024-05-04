package ShapeCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        shapeCalculator shapeCalculator = new shapeCalculator();
        int points = 0;
        String[] Questions = new String[]{
                "Find the area of rectangle with 4 cm width and 5 cm length",
                "Find the area of right triangle with base 5 cm and height 6 cm",
                "Find the area of circle with radius 4 cm"
        };
        int[] correctAnswers = {shapeCalculator.areaRec(4, 5),
                shapeCalculator.areaTri(5, 6),
                shapeCalculator.areaCircle(4)};

        for (int i = 0; i < Questions.length; i++) {
            System.out.println(Questions[i]);
            int answer = scanner.nextInt();

            // Check the validity of the user's answer
            mthd(i, answer, correctAnswers, points);

            }
        System.out.println("Your points:" + points);
        }


        public static void mthd(int i, int answer, int[] correctAnswers, int points){
            if (shapeCalculator.checkAnswer(answer, correctAnswers[i])) {
                if (i == 0) {
                    points += 2;
                    System.out.println("Your point is:" + points);
                }
                if (i == 1) {
                    points += 4;
                    System.out.println("Your point is:" + points);
                }
                if (i == 2) {
                    points += 5;
                    System.out.println("Your point is:" + points);
                    System.out.println("Correct!\n");
                }
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers[i] + "\n");
            }
        }

    }

