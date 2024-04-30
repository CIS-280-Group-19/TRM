package trm.leadership;

import java.util.ArrayList;
import java.util.List;

public class Donbot {
    public List<String> plots;
    public List<String> members;

    public Donbot() {
        plots = new ArrayList<String>();
        members = new ArrayList<String>();
    }

    public void createPlot(String plot) {
        System.out.println("Donbot has plotted to " + plot + ".");
        plots.add(plot);
    }

    public void addMember(String name) {
        System.out.println("Donbot has added " + name + " to TRM.");
        members.add(name);
    }

    public void replaceMember(String name) {
        System.out.println("Donbot has 'replaced' " + name + ".");
        members.remove(name);
    }

    public static int getProfitPercentValue() {
		return 45;
	}
}
