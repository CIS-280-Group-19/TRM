package robossociates;

import order.Order;

public class Customer {
    public String name;
    public boolean trusted = true;

    public Customer(String name, boolean trusted) {
        System.out.println(name + " is " + trusted + ".");
    }

    public void buyProduct(Order order) {
        System.out.println(order + " has been complete.");
    }

    public void trustCustomer(Customer customer) {
        System.out.println(customer + " is trusted.");
    }
}
