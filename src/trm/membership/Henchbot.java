package trm.membership;

import java.util.List;

import bender.Bender;

public class Henchbot {
    public String name;

    public Henchbot(String name) {
        System.out.println("Henchbot's name is " + name + ".");
    }

    public void robonap(String name) {
        System.out.println("Henchbot put " + name + " to sleep.");
    }

    public void interrogate(String name) {
        System.out.println("Henchbot interrogated " + name + ".");
    }

    public void breakParts(String name, List<String> parts) {
        System.out.println("Henchbot broke " + parts + " from " + name + ".");
    }

    public void punish(Bender bender) {
        System.out.println("Henchbot punished " + bender + ".");
    }
}
