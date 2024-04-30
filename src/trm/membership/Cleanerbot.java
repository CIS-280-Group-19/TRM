package trm.membership;

public class Cleanerbot {
    public String name;

    public Cleanerbot(String name) {
        this.name = name;
        System.out.println("Cleanerbot's name is " + name + ".");
    }

    public void tamperEvidence(String evidence) {
        System.out.println("Cleanerbot " + this.name + "tampered with the " + evidence + ".");
    }
}
