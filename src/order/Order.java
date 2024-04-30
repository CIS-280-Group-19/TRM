package order;

import robossociates.Customer;
import robossociates.Robossociate;

public class Order {
    public String product;
    public double cost;
    public Robossociate seller;
    public Customer buyer;

    public Order(String product, double cost, Robossociate seller, Customer buyer) {
        System.out.println(seller + " has sold a " + product + " for $" + cost + " to " + buyer + ".");
    }
}
