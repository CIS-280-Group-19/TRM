package robossociates;

import order.Order;

public class Customer {
    public String name;
    public boolean trusted = false;

    public Customer(String name, boolean trusted) {
        System.out.println("The customer's name is " + name + ".");
    }

    public void buyProduct(Order order) {
        order.seller.orders.add(order);
        System.out.println("Customer " + this.name + " has placed an order of " + order.product + " for $" + order.cost + " from " + order.seller.name + ".");
    }

    public void trustCustomer(Customer customer) {
        customer.trusted = true;
        System.out.println(this.name + " has trusted " + customer.name + ".");
    }
}
