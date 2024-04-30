package robossociates;

public class BusinessOwner {
    public String name;
    public String businessName;

    public BusinessOwner(String name, String businessName) {
        System.out.println(name + " owns " + businessName + ".");
    }

    public void distributeMoney(double money) {
        System.out.println("$" + money + " has been distributed.");
    }

    public void launderMoney(double money) {
        System.out.println("$" + money + " has been laundered.");
    }
}
