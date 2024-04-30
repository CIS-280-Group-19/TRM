package trm.membership;

public class Robocrook {
    public String name;

    public Robocrook(String name) {
        this.name = name;
        System.out.println("The robocrook's name is " + name + ".");
    }

    public void traffick(String part) {
        System.out.println("Robocrook " + this.name + " is trafficking " + part + ".");
    }

    public void runScheme(String language) {
        System.out.println("Robocrook " + this.name + " is running " + language + ".");
    }

    public void blackmail(String name) {
        System.out.println("Robocrook " + this.name + " is blackmailing " + name + ".");
    }

    public void arson(String place) {
        System.out.println("Robocrook " + this.name + " set fire to " + place + ".");
    }

    public void steal(String object) {
        System.out.println("Robocrook " + this.name + " stole a " + object + ".");
    }
}
