package order;

import robossociates.Customer;
import robossociates.Robossociate;

public class Order {
    public String product;
    public double cost;
    public Robossociate seller;
    public Customer buyer;

    public Order(String product, double cost, Robossociate seller, Customer buyer) {
        this.product = product;
        this.cost = cost;
        this.seller = seller;
        this.buyer = buyer;
    }
}
