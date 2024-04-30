package robossociates;

import trm.leadership.Clamps;
import trm.leadership.Donbot;
import trm.membership.JoeyMousepad;

public class BusinessOwner {
    public String name;
    public String businessName;

    public BusinessOwner(String name, String businessName) {
        this.name = name;
        this.businessName = businessName;
        System.out.println(name + " owns " + businessName + ".");
    }

    public void distributeMoney(double money) {
        System.out.println("$" + money + " has been distributed as follows:");
        System.out.println("Donbot has received " + Donbot.getProfitPercentValue() + "% = $" + money * Donbot.getProfitPercentValue() / 100.0);
        System.out.println("Clamps has received " + Clamps.getProfitPercentValue() + "% = $" + money * Clamps.getProfitPercentValue() / 100.0);
        System.out.println("Joey Mousepad has received " + JoeyMousepad.getProfitPercentValue() + "% = $" + money * JoeyMousepad.getProfitPercentValue() / 100.0);
        System.out.println("The Robossociates have received " + Robossociate.getProfitPercentValue() + "% = $" + money * Robossociate.getProfitPercentValue() / 100.0);
        System.out.println("The bookkeeper has received " + Bookkeeper.getProfitPercentValue() + "% = $" + money * Bookkeeper.getProfitPercentValue() / 100.0);
        System.out.println("The police on payroll have received 15% = $" + money * 0.15);
    }

    public void launderMoney(double money) {
        System.out.println("$" + money + " has been laundered through " + this.businessName + ".");
    }
}
