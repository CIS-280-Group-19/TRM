package government;

public class Politician {
    public String name;
    private int scareResistance;
    private boolean scared = false;

    public Politician(String name, int scareResistance) {
        this.name = name;
        this.scareResistance = scareResistance;
    }

    public boolean tryToScare(int scareFactor) {
        scared = scareFactor > scareResistance;
        if(scared) System.out.println("Politician " + this.name + " is scared.");
        else System.out.println("Politician " + this.name + " is not scared.");
        return scared;
    }

    public void vote(String vote) {
        System.out.println("Politician " + this.name + " votes for " + vote + ".");
    }

}
