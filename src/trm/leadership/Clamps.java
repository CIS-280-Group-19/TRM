package trm.leadership;

public class Clamps extends Donbot {
    public Clamps() {

    }

    public void protectDonbot() {
        System.out.println("Clamps has protected Donbot.");
    }

    public void initiateMember(String name) {
        System.out.println("Clamps has initiated " + name + ".");
    }

    public void counselDonbot(String advice) {
        System.out.println("Clamps has advised Donbot to " + advice + ".");
    }

    public static int getProfitPercentValue() {
		return 15;
	}
}
