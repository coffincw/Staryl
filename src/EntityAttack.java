/**
 * Created by coffincw on 11/29/16.
 */
public class EntityAttack {

    boolean repeatAttack;
    int percentHit;
    int tempDamage;

    void playerAttack(String monsterName, int monsterHealth_ndx, int[] monsterHealth ) {
        final String attackMonster[] = {"neck", "eyes", "chest"};
        final int percentNeck[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        final int percentEyes[] = {0, 1, 2, 3, 4};
        final int percentChest[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18};
        percentHit = starylMain.randomInt(0, 10);
        tempDamage = 0;
        repeatAttack = true;
        while (repeatAttack) {
            System.out.println("Attack: ");
            for (int a = 0; a <= attackMonster.length - 1; a++) {
                System.out.println("(" + attackMonster[a] + ")");
            }
            String userAttack = starylMain.readLine(">");
            if (userAttack.equals(attackMonster[0])) {
                hitNeck(percentNeck);
            } else if (userAttack.equals(attackMonster[1])) {
                hitEyes(percentEyes);
            } else if (userAttack.equals(attackMonster[2])) {
                hitChest(percentChest);
            } else {
                System.out.println("Invalid Input");
            }
        }
        monsterHealth[monsterHealth_ndx] -= tempDamage;
        if (monsterHealth[monsterHealth_ndx] < 0) {
            monsterHealth[monsterHealth_ndx] = 0;
        }
        System.out.println("You dealt " + tempDamage + " to the " + monsterName + " the " + monsterName + " has " + monsterHealth[monsterHealth_ndx] + " health remaining.");
    }

    void monsterAttack(String monsterName, int monsterdmgValue, int health) {
        int temptempHealth;
        health -= monsterdmgValue;
        if (monsterdmgValue == 0) {
            System.out.println("The " + monsterName + "'s attack missed!");
        }
        if (health < 0) {
            temptempHealth = 0;
        } else {
            temptempHealth = health;
        }
        System.out.println("The " + monsterName + " dealt " + monsterdmgValue + " damage! You now have " + temptempHealth + " health.");
    }

    void hitNeck(int[] percentN) {
        for (int p = 0; p <= percentN.length - 1; p++) {
            if (percentHit == percentN[p]) { // 60% hit percentage
                tempDamage = starylMain.randomInt(20, 40);
            }
        }
        if (tempDamage == 0) {
            System.out.println("Your attack missed!");
        }
        repeatAttack = false;
    }

    void hitEyes(int[] percentE) {
        for (int p = 0; p <= percentE.length - 1; p++) {
            if (percentHit == percentE[p]) { // 20% hit percentage
                tempDamage = starylMain.randomInt(40, 60);
            }
        }
        if (tempDamage == 0) {
            System.out.println("Your attack missed!");
        }
        repeatAttack = false;
    }

    void hitChest(int[] percentC) {
        for (int p = 0; p <= percentC.length - 1; p++) {
            if (percentHit == percentC[p]) { // 90% hit percentage
                tempDamage = starylMain.randomInt(10, 20);
            }
        }
        if (tempDamage == 0) {
            System.out.println("Your attack missed!");
        }
        repeatAttack = false;
    }
}
