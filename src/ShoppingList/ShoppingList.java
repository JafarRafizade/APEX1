package ShoppingList;

import java.util.Arrays;

public class ShoppingList {
    Item[] items;
    double cost;

    public ShoppingList(int cost) {
        cost = totalCost();
        this.items = items;
    }

    public int totalCost () {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {

            sum += items[i].price;



        }return (int) sum;

    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "items=" + Arrays.toString(items) +
                ", cost=" + cost +
                '}';
    }
}
