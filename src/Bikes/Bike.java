package Bikes;

public class Bike {
    String name;
    String color;
    int numberOfWheels;
    static int count = 0;

    public Bike(String name, String color) {
        this.name = name;
        this.color = color;
        numberOfWheels = 2;
        count++;
    }

    public Bike(String name, String color, int numberOfWheels) {
        this.name = name;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        count++;

    }
    public static void printTotalBikesProduced () {
        System.out.println("The number of bikes produced is:" + Bike.count );
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
