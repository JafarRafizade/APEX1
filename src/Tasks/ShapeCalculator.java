package Tasks;

public class ShapeCalculator {
    public int areaRectangle(int  length, int width) {
        return length * width;
    }
    public double areaCircle ( double radius) {
        return Math.PI * radius * radius;
    }
    public int areaTriangle (int leg1, int leg2) {
        return (leg1 * leg2) / 2;
    }
}
