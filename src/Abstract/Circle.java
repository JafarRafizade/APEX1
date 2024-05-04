package Abstract;

import java.util.Scanner;

public class Circle extends Shape{


    @Override
    int calculateArea() {
        System.out.println("Enter the radius");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        return (int) (Math.PI * radius* radius);
    }
}
