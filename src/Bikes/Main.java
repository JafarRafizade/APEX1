package Bikes;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Honda","blue");
        Bike bike2 =  new Bike("Harley Davidson","black",3);
        System.out.println(bike1);
        Bike.printTotalBikesProduced();
    }
}
