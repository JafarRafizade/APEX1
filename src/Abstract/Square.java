package Abstract;

import java.util.Scanner;

public class Square extends Shape{
    @Override
    int calculateArea() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = scanner.nextInt();
        System.out.println("Enter the width");
        int width = scanner.nextInt();

        return length * width;
    }
}
