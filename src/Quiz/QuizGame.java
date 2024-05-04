package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class QuizGame {
    String[] Questions;
    String[] Variants;
    String[] correctVariant;


    int pointAnswer;

    public QuizGame(String[] questions, String[] variants, String[] correctVariant) {
        Questions = questions;
        Variants = variants;
        this.correctVariant = correctVariant;
    }
    public void checkAnswers(String[] correctVariant, String[] answers) {

        int points = 0;

        for (int i = 0; i < 3; i++) {
            if (answers[i].equalsIgnoreCase(correctVariant[i])) {
                points++;

            }
        }
        for (int i = 3; i < 5; i++) {
            if (answers[i].equalsIgnoreCase(correctVariant[i])) {
                points+=2;
            }

        }
        for (int i = 5; i < 7 ; i++) {
            if (answers[i].equalsIgnoreCase(correctVariant[i])) {
                points+=4;
            }

        }
        System.out.println("Your point is:" + points);

    }
    public void displayCorrect (String[] correctVariant) {
        Scanner scanner = new Scanner(System.in);
        String[] answers = new String[7];
        for (int i = 0; i < 7; i++) {
            if (answers[i].equalsIgnoreCase(correctVariant[i])){
                System.out.println("Correct!");
            }

        }
    }
    public void Game (String[] Questions, String[] Variants, String[] correctVariant) {
        Scanner scanner = new Scanner(System.in);
        String[] answers = new String[7];
        for (int i = 0; i < 7; i++) {
           if (i==0){
               System.out.println("Easy level");
               System.out.println("---------------------------------------------");
           }
           if (i==3) {
               System.out.println("Medium level");
               System.out.println("---------------------------------------------");
           }
           if (i==5) {
               System.out.println("Hard level");
               System.out.println("-----------------------------------------------");
           }
            System.out.println(Questions[i]);
            System.out.println(Variants[i]);
           answers[i] = scanner.next();
           if (answers[i].equalsIgnoreCase(correctVariant[i])) {
               System.out.println("Correct!");
           }



        }checkAnswers(correctVariant,answers);


    }

}




