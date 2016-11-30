/**
 * Created by coffincw on 11/27/16.
 */
public class HealCenter {

    static Player p = new Player();

    void healcenterInfo(String centerName) {
        System.out.println("Welcome to " + centerName + " we hope you enjoy your stay!" +
                "\n While you rest up your health and lives will be regenerated to the initial value depending on the difficulty you picked (unless your health/lives are greater than your initial amounts");
        healtoStart();
    }

    void healtoStart() {
        System.out.println("We hope you slept well!");
        if (p.playerLives[starylMain.gameDiff] < p.healPLives[starylMain.gameDiff] || p.playerHealth[starylMain.gameDiff] < p.healPHealth[starylMain.gameDiff]) {
            if (p.playerLives[starylMain.gameDiff] < p.healPLives[starylMain.gameDiff]) {
                p.playerLives[starylMain.gameDiff] = p.healPLives[starylMain.gameDiff];
                System.out.println("You now have " + p.playerLives[starylMain.gameDiff] + " lives.");
            }
            if (p.playerHealth[starylMain.gameDiff] < p.healPHealth[starylMain.gameDiff]) {
            }

        } else {
            System.out.println("Your health is already above or equal to your starting health! Nice job!");
        }
    }
}

