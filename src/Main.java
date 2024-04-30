import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import bender.Bender;
import government.Police;
import government.Politician;
import robossociates.BusinessOwner;
import robossociates.Robossociate;
import trm.leadership.Clamps;
import trm.leadership.Donbot;
import trm.membership.Henchbot;
import trm.membership.JoeyMousepad;
import trm.membership.Robocrook;

public class Main {
    public static void main(String[] args) throws Exception {
        // Set up variables
        Random random = new Random();
        List<Robossociate> associates = new ArrayList<Robossociate>();

        // Create the TRM organization
        Donbot donbot = new Donbot();
        Clamps clamps = new Clamps();
        JoeyMousepad joeyMousepad = new JoeyMousepad();
        Henchbot henchy = new Henchbot("Henchy");

        // Create other non-TRM members
        Robossociate jimmy = new Robossociate("Jimmy");
        associates.add(jimmy);
        Robossociate johnny = new Robossociate("Johnny");
        associates.add(johnny);
        Robossociate jamie = new Robossociate("Jamie");
        associates.add(jamie);
        BusinessOwner elzar = new BusinessOwner("Chef Elzar", "Elzar's Fine Cuisine");
        BusinessOwner flexie = new BusinessOwner("Flexie", "Flexie's Real Business");
        Bender bender = new Bender("Bender");



        // ----- Evidence tampering operation -----
        System.out.println("\n\n\nEvidence Tampering (Lab 5)");

        // Roberto is added to TRM
        Robocrook roberto = new Robocrook("Roberto");
        clamps.counselDonbot("add " + roberto.name + " to TRM");
        donbot.addMember(roberto.name);
        clamps.initiateMember(roberto.name);

        // Create task for Roberto
        donbot.createPlot("have " + roberto.name + " tamper with evidence");

        // Joey Mousepad oversees the operation
        joeyMousepad.overseeOperation(roberto.name + " tampering with evidence");

        // Roberto begins evidence tampering
        for(int i = 0; i < random.nextInt(3) + 1; i++) {
            // Order evidence tampering
            jimmy.tamperEvidence("TRM involvement");

            // Order jury tampering
            jimmy.extort("the jury");

            // Order punishment of Bender
            henchy.punish(bender);
        }



        // ----- Blackmail operation -----
        System.out.println("\n\n\nBlackmail operation (Lab 7)");

        // Flexo is added into TRM
        Robocrook flexo = new Robocrook("Flexo");
        clamps.counselDonbot("add " + flexo.name + " to TRM");
        donbot.addMember(flexo.name);
        clamps.initiateMember(flexo.name);

        // Create task for Flexo
        donbot.createPlot("have " + flexo.name + " blacmail a politician");

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
            johnny.lobbyPolitician(poopenmeyer.name);
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



        // ----- Flexo betrayal -----
        System.out.println("\n\n\nBetrayal operation (Lab 8 Task 1)");

        // Flexo is already a part of TRM
        // Give Flexo a new task
        donbot.createPlot(flexo.name + " have Flexo perform a task");

        // Flexo orders Robossociates to help
        for(int i = 0; i < random.nextInt(2) + 1; i++) {
            // Order racketeering
            jamie.racketeer(flexie.businessName);
        }

        // Flexo orders Police to help
        for(int i = 0; i < random.nextInt(1) + 1; i++) {
            // Order police help
            Police uri = new Police("URI");
            uri.helpWithTask(flexo.name + "'s task");
        }

        // Flexo betrays the donbot
        Bender ratFlexo = new Bender("Flexo");
        ratFlexo.betrayTRM();

        // Clamps protects Donbot
        clamps.protectDonbot();

        // Donbot orders punishment of Flexo
        donbot.createPlot("punish " + ratFlexo.name);
        henchy.punish(ratFlexo);
        donbot.replaceMember(flexo.name);



        // ----- Donbot checks for mutiny -----
        System.out.println("\n\n\nDonbot checks for mutiny operation (Lab 8 Task 2)");

        // Donbot plots to change profit distribution
        donbot.createPlot("change profit distribution");

        // Clamps counsels Donbot
        clamps.counselDonbot(" wait for him to check with Robossociates");

        // Clamps checks with each Robossociate
        double overall = 0.0;
        for(Robossociate associate : associates) {
            if(random.nextInt(100) < 80) {
                overall += 1.0;
                System.out.println("Robossociate " + associate.name + " agrees with the profit changes.");
            } else {
                System.out.println("Robossociate " + associate.name + " disagrees with the profit changes.");
            }
        }

        // Gather average opinion
        overall /= associates.size();

        // Make changes only if no mutiny is expected
        if(overall > 0.60) {
            clamps.counselDonbot("change profit distributions");
            System.out.println("Donbot has changed the profit distributions.");
        } else {
            clamps.counselDonbot("not change profit distributions");
            System.out.println("Donbot has not changed the profit distributions.");
        }
    }
}
