/**
 * Created by coffincw on 11/30/16.
 */
public class MonsterOrganization {

    static EntityAttack attack = new EntityAttack();
    static Player p = new Player();
    static Gearset gear = new Gearset();
    boolean test;

    final static String BOSS_NAMES[] = {"Hadyiss", "Kalyth", "Gijhn", "Weril"};
    static int bossHealth[] = {200, 300, 400, 500};


    final static String MONSTER_NAMES[] = {"Giv", "Kar", "Perrkill"};
    static int monsterHealth[] = {40, 50, 30};
    final static int monsterExp[] = {10, 15, 5};

    // work on making player deal more damage with higher upgraded armour
    static int playerDamageLOW[] = {};
    static int playerDamageHIGH[] = {};

    void spawnMonster(int monsterIndex, int[] monsterhealthArray, String[] monsterNames, int possiblemonsterDMG_lowest, int possiblemonsterDMG_highest) {
        System.out.println("A " + monsterNames[monsterIndex] + " approaches...");
        while (monsterhealthArray[monsterIndex] > 0 && p.playerLives[starylMain.gameDiff] > 0) {
            attack.playerAttack(monsterNames[monsterIndex], monsterIndex, monsterhealthArray);
            if (monsterhealthArray[monsterIndex] > 0) {
                attack.monsterAttack(monsterNames[monsterIndex], starylMain.randomInt(possiblemonsterDMG_lowest, possiblemonsterDMG_highest), test);
            }
        }
        if (monsterhealthArray[0] <= 0) {
            System.out.println("You defeated the " + monsterNames[monsterIndex] + " with " + p.playerLives[starylMain.gameDiff] + " lives remaining!");
            expWon(monsterIndex);
        } else if (p.playerLives[starylMain.gameDiff] <= 0) {
            System.out.println("You were defeated by the " + monsterNames[monsterIndex] + " who had " + monsterhealthArray[monsterIndex] + " health remaining.");
        }
    }

    void expWon(int monsterIndex) {
        int random = starylMain.randomInt(0, 4);
        for (int i = 0; i <= gear.gear.length; i++) {
            if (random == i) {
                if (i == 4) {
                    gear.weaponExp[gear.weaponClass] += monsterExp[monsterIndex];
                    System.out.println(gear.gear[i] + " experience increased by " + monsterExp[monsterIndex]);
                    gear.weaponLevelUp();
                    gear.weaponClassUp();
                } else {
                    gear.armourExp[i] += monsterExp[monsterIndex];
                    System.out.println(gear.gear[i] + " experience increased by " + monsterExp[monsterIndex]);
                    gear.armourLevelUp();
                }

            }
        }

    }

}
