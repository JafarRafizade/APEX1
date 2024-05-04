package Buy;

public class Main {
    public static void main(String[] args) {
        Product pear = new Product(1, "Apple", 1.2);
        Product sausage = new Product(2, "Bread", 2.5);
        Product milk = new Product(3, "Milk", 3.0);


        Supermarket supermarket = new Supermarket();
        supermarket.addProduct(pear, sausage, milk);


        supermarket.displayProducts();


        Customer customer = new Customer("John", 10.0);


        customer.doShoppingIn(supermarket);


        customer.displayBasket();
    }
}
