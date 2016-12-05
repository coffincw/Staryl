/**
 * Created by coffincw on 11/29/16.
 */
public class PlayerAttack {

    private boolean repeatAttack;
    private int percentHit;
    private int tempDamage;
    int attack;
    private int poison;

    private static Player p = new Player();
    private static MonsterOrganization monster = new MonsterOrganization();
    private static Gearset gear = new Gearset();

    final String attackMonster[] = {"neck", "eyes", "chest"};

    private final int percentNeck[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private final int percentEyes[] = {0, 1, 2, 3, 4};
    private final int percentChest[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18};

    void playerAttack(String monsterName, int monsterIndex, int[] monsterHealth, boolean train) {
        percentHit = starylMain.randomInt(0, 10);
        tempDamage = 0;
        repeatAttack = true;
        while (repeatAttack) {
            System.out.println("Attack: ");
            for (int a = 0; a <= attackMonster.length - 1; a++) {
                System.out.println("(" + attackMonster[a] + ")");
            }
            if (train) {
                trainingPositionOfAttack();
            } else {
                PositionOfAttack(monsterIndex);
            }
        }
        monsterHealth[monsterIndex] -= tempDamage;
        if (monsterHealth[monsterIndex] < 0) {
            monsterHealth[monsterIndex] = 0;
        }
        System.out.println("You dealt " + tempDamage + " to the " + monsterName + "! the " + monsterName + " has " + monsterHealth[monsterIndex] + " health remaining.");

        System.out.println(poison);
        System.out.println(attack);
        if (poison != 0) {
            System.out.println("The " + monsterName + " was hurt by your machete's poison blade");
        }
    }

    private void hitNeck(int[] percentN, int playerDamage) {
        for (int p = 0; p <= percentN.length - 1; p++) {
            if (percentHit == percentN[p]) { // 60% hit percentage
                tempDamage = playerDamage; // change this for nontraining battle
            }
        }
        if (tempDamage == 0) {
            attack += 0;
            System.out.println("Your attack missed!");
        }
        attack += 1;
        repeatAttack = false;
    }

    private void hitEyes(int[] percentE, int playerDamage) {
        for (int p = 0; p <= percentE.length - 1; p++) {
            if (percentHit == percentE[p]) { // 20% hit percentage
                tempDamage = playerDamage; // change this for nontraining battle
            }
        }
        if (tempDamage == 0) {
            attack += 0;
            System.out.println("Your attack missed!");
        }
        attack += 1;
        repeatAttack = false;
    }

    private void hitChest(int[] percentC, int playerDamage) {

        for (int p = 0; p <= percentC.length - 1; p++) {
            if (percentHit == percentC[p]) { // 90% hit percentage
                tempDamage = playerDamage; // change this for nontraining battle
            }
        }
        if (tempDamage == 0) {
            attack += 0;
            System.out.println("Your attack missed!");
        }
        attack += 1;
        System.out.println(poison);
        repeatAttack = false;
    }

    private void trainingPositionOfAttack() {
        String userAttack = starylMain.readLine(">");
        if (userAttack.equals(attackMonster[0])) {
            hitNeck(percentNeck, starylMain.randomInt(20, 40));
        } else if (userAttack.equals(attackMonster[1])) {
            hitEyes(percentEyes, starylMain.randomInt(40, 60));
        } else if (userAttack.equals(attackMonster[2])) {
            hitChest(percentChest, starylMain.randomInt(10, 20));
        } else {
            System.out.println("Invalid Input");
        }
    }

    private void PositionOfAttack(int monsterIndex) {
        String userAttack = starylMain.readLine(">");
        if (userAttack.equals(attackMonster[0])) {
            hitNeck(percentNeck, attackAddition(monsterIndex, starylMain.randomInt(20, 40)));
        } else if (userAttack.equals(attackMonster[1])) {
            hitEyes(percentEyes, attackAddition(monsterIndex, starylMain.randomInt(40, 60)));
        } else if (userAttack.equals(attackMonster[2])) {
            hitChest(percentChest, attackAddition(monsterIndex, starylMain.randomInt(10, 20)));
        } else {
            System.out.println("Invalid Input");
        }
    }

    private int attackAddition(int monsterIndex, int damageRange) {
        int damage = 0;
        damage = damageRange;
        for (int a = 0; a <= p.additionalDamage.length - 1; a++) {
            damage += p.additionalDamage[a];
        }
        poison = machetePoison();
        damage += poison;
        damage -= monster.monsterDefense[monsterIndex];
        return damage;
    }

    int machetePoison() {
        int poison = 0;
        gear.weaponClass = 1;
        if (gear.weaponClass == 1 && attack != 0) {
            int change = starylMain.randomInt(1, 5);
            if (change == 1) {
                poison = starylMain.randomInt(5, 10);
            }
        }
        return poison;
    }


}
