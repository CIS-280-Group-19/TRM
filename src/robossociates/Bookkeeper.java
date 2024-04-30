package robossociates;

public class Bookkeeper {
    public String name;

    public Bookkeeper(String name) {
        System.out.println("The bookkeeper's name is " + name + ".");
    }

    public void runNumbers() {
        System.out.println("The bookkeeper has run the numbers.");
    }

    public static int getProfitPercentValue() {
		return 5;
	}
}
