package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        try {


            int number = scanner.nextInt();
            Students[] students = new Students[number];
            System.out.println("Enter the scores of students");
            for (int i = 0; i < number; i++) {
                students[i] = new Students(scanner.nextInt());


            }
            int sum = 0;
            for (int i = 0; i < number; i++) {
                sum += students[i].score;


            }
            int averageScore = sum / number;
            System.out.println(averageScore);
        } catch (ArithmeticException e) {
            System.out.println("There is an error");;
        }catch (NumberFormatException e) {
            System.out.println("Correct the number");

        }
        catch (InputMismatchException e) {
            System.out.println("Enter the number");
        }


    }
}
