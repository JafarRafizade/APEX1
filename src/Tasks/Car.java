package Tasks;

public class Car extends Vehicle{
    @Override
    public void start() {
        super.start();
        System.out.println("This is a car");
    }
}
