package robossociates;

import java.util.ArrayList;
import java.util.List;

import order.Order;

public class Robossociate {
    public String name;
    public List<Order> orders;

    public Robossociate(String name) {
        this.name = name;
        this.orders = new ArrayList<Order>();
        System.out.println("The robossociate's name is " + name + ".");
    }

    public void racketeer(String business) {
        System.out.println("Robossociate " + this.name + " is racketeering " + business + ".");
    }

    public void extort(String name) {
        System.out.println("Robossociate " + this.name + " is extorting " + name + ".");
    }

    public void tamperEvidence(String evidence) {
        System.out.println("Robossociate " + this.name + " is tampering with the " + evidence + ".");
    }

    public void bribePolice(String name, double money) {
        System.out.println("Robossociate " + this.name + " is bribing " + name + " with $" + money + ".");
    }

    public void lobbyPolitician(String name) {
        System.out.println("Robossociate " + this.name + " is lobbying " + name + ".");
    }

    public void sellOrders() {
        while(orders.size() > 0) {
            Order order = orders.remove(0);
            if(!order.buyer.trusted) {
                System.out.println("Customer " + order.buyer.name + " is not trusted and cannot be sold product!");
            } else {
                System.out.println("Robossociate " + order.seller.name + " sold " + order.product + " to Customer " + order.buyer.name + " for $" + order.cost + ".");
            }
        }
    }

    public static int getProfitPercentValue() {
		return 10;
	}
}
