/**
 * Created by coffincw on 11/27/16.
 */
public class TrainingCenter {

    static Gearset gear = new Gearset();
    static EntityAttack attack = new EntityAttack();

    private final String trainGear[] = {"helmet", "shirt", "pants", "boots", "weapon"}; // trainable gear
    private final String Monster[] = {"Findlewumper", "Gorp", "Calark"}; // monster names
    private final int trainingMH[] = {70, 120, 100};
    private int tempHealth = 100;
    private int nRounds;
    private int nRounds_Final;



    void trainingInfo(String centerName) {
        boolean trainrepeat = true;
        while (trainrepeat) {
            System.out.println("Welcome to " + centerName + ".  The training center is a place where you have an opportunity to train in order to level up your armour." +
                    "\nBe aware, the training center only allows you to work on a piece of armour every 30 miles you travel, so choose wisely." +
                    "\nWhat piece of equipment would you like to work on?");
            gear.gearInfo(0);
            System.out.println("\nInput:");
            for (int t = 0; t <= trainGear.length - 1; t++) {
                System.out.println(trainGear[t]);
            }
            String train = starylMain.readLine(">");
            train = train.toLowerCase();
            for (int ti = 0; ti <= trainGear.length - 1; ti++) {
                if (train.equals(trainGear[ti])) {
                    initiateTraining(trainGear[ti], ti);
                    trainrepeat = false;
                }
            }

        }
    }

    void initiateTraining(String trainObject, int TGndx) {
        nRounds = 0;
        System.out.println("Welcome to training! You will go through 4 fighting simulators inorder to level up your gear");
        while (nRounds <= 3) {
            nRounds++;
            if (nRounds == 1) {
                spawnFindlewumper();
            } else if (nRounds == 2) {
                spawnGorp();
            } else if (nRounds == 3) {
                spawnCalark();
            }
        }
        if (tempHealth > 0) {
            if (nRounds == 4) {
                nRounds = 3;
            }
            nRounds_Final = nRounds;
        }
        int experienceEarned;
        if (trainObject.equals(trainGear[4])) {
            gear.weaponExp[gear.weaponClass] += experienceEarned = (nRounds_Final * 25);
        } else {
            gear.armourExp[TGndx] += experienceEarned = (nRounds_Final * 25);
        }

        System.out.println("You completed " + nRounds_Final + " rounds congrats!\nYou earned " + experienceEarned + " for your " + trainObject);
        gear.armourLevelUp();
        gear.weaponLevelUp();
        gear.weaponClassUp();
    }

    void spawnFindlewumper() {
        System.out.println("A Findlewumper approaches...");
        while (trainingMH[0] > 0 && tempHealth > 0) {
            attack.playerAttack(Monster[0], 0, trainingMH);
            if (trainingMH[0] > 0) {
                attack.monsterAttack(Monster[0],  starylMain.randomInt(0, 10), tempHealth);
            }
        }
        if (trainingMH[0] <= 0) {
            System.out.println("You defeated the " + Monster[0] + " with " + tempHealth + " health remaining!");
            tempHealth = 100;
        } else if (tempHealth <= 0) {
            System.out.println("You were defeated by the " + Monster[0] + " who had " + trainingMH[0] + " health remaining.");
            nRounds_Final = nRounds - 1;
            nRounds = 4;

        }
    }

    void spawnGorp() {
        System.out.println("A Gorp approaches...");
        while (trainingMH[1] > 0 && tempHealth > 0) {
            attack.playerAttack(Monster[1], 1, trainingMH);
            if (trainingMH[1] > 0) {
                attack.monsterAttack(Monster[1], starylMain.randomInt(10, 20), tempHealth);
            }
        }
        if (trainingMH[1] <= 0) {
            System.out.println("You defeated the " + Monster[1] + " with " + tempHealth + " health remaining!");
            tempHealth = 100;
        } else if (tempHealth <= 0) {
            System.out.println("You were defeated by the " + Monster[1] + " who had " + trainingMH[1] + " health remaining.");
            nRounds_Final = nRounds - 1;
            nRounds = 4;

        }
    }

    void spawnCalark() {
        System.out.println("A Calark approaches...");
        while (trainingMH[2] > 0 && tempHealth > 0) {
            attack.playerAttack(Monster[2], 2, trainingMH);
            if (trainingMH[2] > 0) {
                attack.monsterAttack(Monster[2], starylMain.randomInt(20, 30), tempHealth);
            }
        }
        if (trainingMH[2] <= 0) {
            System.out.println("You defeated the " + Monster[2] + " with " + tempHealth + " health remaining!");
            tempHealth = 100;
        } else if (tempHealth <= 0) {
            System.out.println("You were defeated by the " + Monster[2] + " who had " + trainingMH[2] + " health remaining.");
            nRounds_Final = nRounds - 1;
            nRounds = 4;

        }
    }
}
