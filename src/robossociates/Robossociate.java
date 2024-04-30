package robossociates;

import java.util.List;

import order.Order;

public class Robossociate {
    public String name;
    public List<Order> orders;

    public Robossociate(String name) {
        System.out.println("The robossociate's name is " + name + ".");
    }

    public void racketeer(String business) {
        System.out.println("Robossociate is racketeering " + business + ".");
    }

    public void extort(String name) {
        System.out.println("Robossociate is extorting " + name + ".");
    }

    public void tamperEvidence(String evidence) {
        System.out.println("Robossociate is tampering with the " + evidence + ".");
    }

    public void bribePolice(String name, double money) {
        System.out.println("Robossociate is bribing " + name + " with $" + money + ".");
    }

    public void lobbyPolitician(String name) {
        System.out.println("Robossociate is lobbying " + name + ".");
    }

    public void sellOrders() {
        System.out.println("Robossociate has sold the orders.");
    }
}
