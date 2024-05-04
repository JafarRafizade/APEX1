package methodTask1;

public class Square {
    double length;
    double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea(double length, double width) {
        return (length * width);
    }
    public String toString() {
        return ("area of square is:" + calculateArea(length,width));
    }
}
