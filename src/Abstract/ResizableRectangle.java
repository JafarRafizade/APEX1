package Abstract;

import java.util.Scanner;

public class ResizableRectangle implements Resizable{
    @Override
    public void resize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        int width = scanner.nextInt();
        System.out.println("Enter the length");
        int length = scanner.nextInt();
        System.out.println("Length is:" + length + ", width is:" + width );
    }
}
