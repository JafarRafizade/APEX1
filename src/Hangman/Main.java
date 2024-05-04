package Hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"lion", "mouse", "tiger", "fly", "cat"};
        int maxTries = 6;

        System.out.println("Welcome to Hangman!");

        while (true) {
            Random random = new Random();
            String wordToGuess = words[random.nextInt(words.length)];
            char[] guessedWord = new char[wordToGuess.length()];


            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '_';
            }

            int tries = 0;
            boolean wordGuessed = false;

            while (!wordGuessed && tries < maxTries) {
                System.out.println("\nWord to guess: " + new String(guessedWord));
                System.out.print("Enter a letter: ");
                char guess = scanner.next().toLowerCase().charAt(0);





                boolean found = false;
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        guessedWord[i] = guess;
                        found = true;
                    }
                }

                if (!found) {
                    tries++;
                    drawHangman(tries);
                    System.out.println("Incorrect guess. " + (maxTries - tries) + " tries remaining.");
                }

                if (wordToGuess.equals(new String(guessedWord))) {
                    wordGuessed = true;
                }
            }

            if (wordGuessed) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
            } else {
                System.out.println("Sorry, you ran out of tries. The word was: " + wordToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }


    }

    private static void drawHangman(int tries) {
        switch (tries) {
            case 1:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__|_______");
                break;
            case 2:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |       |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__|_______");
                break;
            case 3:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      /|");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__|_______");
                break;
            case 4:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      /|\\");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("__|_______");
                break;
            case 5:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      /|\\");
                System.out.println(" |       |");
                System.out.println(" |");
                System.out.println("__|_______");
                break;
            case 6:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      /|\\");
                System.out.println(" |       |");
                System.out.println(" |      / ");
                System.out.println("__|_______");
                break;
            case 7:
                System.out.println("  _______");
                System.out.println(" |       |");
                System.out.println(" |       O");
                System.out.println(" |      /|\\");
                System.out.println(" |       |");
                System.out.println(" |      / \\");
                System.out.println("__|_______");
                break;
        }
    }



}
