package trm.leadership;

import java.util.List;

public class Donbot {
    public List<String> plots;
    public List<String> members;

    public Donbot() {

    }

    public void createPlot(String plot) {
        System.out.println("Donbot has plotted to " + plot + ".");
    }

    public void addMember(String name) {
        System.out.println("Donbot has added " + name + " to TRM.");
    }

    public void replaceMember(String name) {
        System.out.println("Donbot has 'replaced' " + name + ".");
    }
}
