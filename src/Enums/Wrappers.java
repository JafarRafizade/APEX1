package Enums;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        int number = 5;
        Integer num = number * 2;
        System.out.println(num);
        int a = 2;
        Integer b = 2;
        int c = b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        String age = scanner.next();
        Integer years = 18 - Integer.parseInt(age);
        if (years <= 0) {
            System.out.println("You've already passed 18");
        }
        else System.out.println("There are "+ years + " years until you turn 18");

    }


}
