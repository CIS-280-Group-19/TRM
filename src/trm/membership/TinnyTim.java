package trm.membership;

public class TinnyTim extends JoeyMousepad {
    public boolean inJail = false;

    public TinnyTim() {

    }

    public void takeFall(String name, String crime) {
        System.out.println("Tinny Tim is taking the fall for " + name + " after he " + crime + ".");
    }

    public void attendFuneral(String name) {
        System.out.println("Tinny Tim is attending the funeral of " + name + ".");
    }
}
