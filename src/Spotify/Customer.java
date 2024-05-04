package Spotify;

import java.util.LinkedList;

public class Customer {
    String name;
    boolean isSending;

    LinkedList<String> senders = new LinkedList<>();
    LinkedList<String> receivers= new LinkedList<>();

    public Customer(String name, boolean isSending) {
        this.name = name;
        this.isSending = isSending;
    }
    public void addCustomer(String name, boolean isSending){
        if (isSending){
            senders.add(name);
        }
        else receivers.add(name);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Jafar",true);
        Customer customer1 = new Customer("Elvin",false);


        customer.addCustomer(customer.name, customer.isSending);
        customer1.addCustomer(customer1.name, customer1.isSending);
        System.out.println("Senders:" + customer.senders + " " +"Receivers:"+ customer.receivers);
        System.out.println("Senders:"+ customer1.senders + " " + "Receivers:" + customer1.receivers);
    }
}
