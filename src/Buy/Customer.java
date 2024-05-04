package Buy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double budget;
    private List<Product> basket;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.basket = new ArrayList<>();
    }

    public void doShoppingIn(Supermarket store) {
        System.out.println(name + " is shopping...");
        for (Product p : store.products) {
            if (p.getPrice() <= budget) {
                basket.add(p);
                budget -= p.getPrice();
            }
        }
        System.out.println(name + " has spent all their money.");
    }

    public void displayBasket() {
        System.out.println("Customer " + name + "'s Basket:");
        for (Product p : basket) {
            System.out.println(p);
        }
    }
}
