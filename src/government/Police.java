package government;

public class Police {
    public String name;

    public Police(String name) {
        this.name = name;
        System.out.println("The police officer's name is " + name + ".");
    }

    public void helpWithTask(String task) {
        System.out.println("Police officer " + this.name + " helps with " + task + ".");
    }
}
