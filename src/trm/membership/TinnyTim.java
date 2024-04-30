package trm.membership;

public class TinnyTim extends JoeyMousepad {
    public boolean inJail = false;

    public TinnyTim() {

    }

    public void takeFall(String name, String crime) {
        this.inJail = true;
        System.out.println("Tinny Tim is taking the fall for " + name + " for " + crime + ".");
    }

    public void attendFuneral(String name) {
        System.out.println("Tinny Tim is attending the funeral of " + name + ".");
    }
}
