package Abstract;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.calculateArea());
        Circle circle = new Circle();
        System.out.println(circle.calculateArea());


        ResizableRectangle resizableRectangle = new ResizableRectangle();
        resizableRectangle.resize();
    }

}
