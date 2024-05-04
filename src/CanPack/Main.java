package CanPack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of big counts");
        int bigCount = scanner.nextInt();
        System.out.println("Enter the number of small counts");
        int smallCount = scanner.nextInt();
        System.out.println("Enter the goal");
        int goal = scanner.nextInt();
        canPack canpack = new canPack(bigCount, smallCount, goal);
        if ((5 * bigCount + smallCount > goal) && smallCount!=0){
            canpack.possible= true;
        } else if (5 * bigCount + smallCount == goal) {
            canpack.possible = true;

        } else if (5 * bigCount + smallCount < goal){
            canpack.possible = false;}
        else if ((5 * bigCount + smallCount > goal) && smallCount==0) {
            canpack.possible = false;

        }
        System.out.println(canpack);

    }

}
