package trm.membership;

import bender.Bender;

public class Henchbot {
    public String name;

    public Henchbot(String name) {
        this.name = name;
        System.out.println("Henchbot's name is " + name + ".");
    }

    public void robonap(String name) {
        System.out.println("Henchbot " + this.name + " put " + name + " to sleep.");
    }

    public void interrogate(String name) {
        System.out.println("Henchbot " + this.name + " interrogated " + name + ".");
    }

    public void breakParts(String name, String...parts) {
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Henchbot " + this.name + " broke " + parts[i] + " from " + name + ".");
        }
    }

    public void punish(Bender bender) {
        System.out.println("Henchbot punished " + bender.name + ".");
    }
}
