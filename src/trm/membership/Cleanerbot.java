package trm.membership;

public class Cleanerbot {
    public String name;

    public Cleanerbot(String name) {
        System.out.println("Cleanerbot's name is " + name + ".");
    }

    public void tamperEvidence(String evidence) {
        System.out.println("Cleanerbot tampered with the " + evidence + ".");
    }
}
