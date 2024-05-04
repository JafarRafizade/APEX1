package Tasks;

public class Bike extends Vehicle{
    @Override
    public void start() {
        super.start();
        System.out.println("This is a bike ");
    }
}
