package Buy;


import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    List<Product> products;

    public Supermarket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product... product) {
        for (Product p : product) {
            products.add(p);
        }
    }

    public void removeProduct(int productId) {
        products.removeIf(p -> p.getId() == productId);
    }

    public void displayProducts() {
        System.out.println("Supermarket Catalog:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public boolean hasProduct(int productId) {
        for (Product p : products) {
            if (p.getId() == productId) {
                return true;
            }
        }
        return false;
    }

    public Product getProductById(int productId) {
        for (Product p : products) {
            if (p.getId() == productId) {
                return p;
            }
        }
        return null;
    }

}

