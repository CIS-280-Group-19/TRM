import java.util.Random;

import government.Police;
import government.Politician;
import robossociates.BusinessOwner;
import robossociates.Robossociate;
import trm.leadership.Clamps;
import trm.leadership.Donbot;
import trm.membership.JoeyMousepad;
import trm.membership.Robocrook;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        Donbot donbot = new Donbot();
        Clamps clamps = new Clamps();
        JoeyMousepad joeyMousepad = new JoeyMousepad();
        BusinessOwner elzar = new BusinessOwner("Chef Elzar", "Elzar's FIne Cuisine");

        Robossociate roberto = new Robossociate("Roberto");

        // Blackmail operation
        // Flexo is added into TRM
        Robocrook flexo = new Robocrook("Flexo");
        clamps.counselDonbot("add " + flexo.name + " to TRM");
        donbot.addMember(flexo.name);
        clamps.initiateMember(flexo.name);

        // Flexo begins blackmailing politician
        Politician poopenmeyer = new Politician("C. Randall Poopenmeyer", 50);
        flexo.blackmail(poopenmeyer.name);

        // Joey Mousepad oversees the operation
        joeyMousepad.overseeOperation(flexo.name + " blackmailing " + poopenmeyer.name);

        // If the politician calls the police
        if(random.nextBoolean()) {
            // Police help with the task
            Police url = new Police("URL");
            url.helpWithTask("blackmailing " + poopenmeyer.name);
        }

        // Try to scare politician (scareFactor from 0 - 100)
        if(!poopenmeyer.tryToScare(random.nextInt(100))) {
            // Politician is not scared, ask for robossociate help
            roberto.lobbyPolitician(poopenmeyer.name);
            poopenmeyer.tryToScare(100);
        }

        // Politician votes for TRM's interests
        poopenmeyer.vote("TRM's interests");

        // Split profits
        double profits = 1000.0;
        double flexoCut = profits * 0.10;
        double otherCut = profits * 0.90;
        System.out.println(flexo.name + " receives 10% = $" + flexoCut + " of the profits.");
        System.out.println("The other 90% = $" + otherCut + " is split amongst TRM members.");
        elzar.distributeMoney(otherCut);
    }
}
