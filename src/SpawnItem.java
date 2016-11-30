/**
 * Created by coffincw on 11/24/16.
 */
public class SpawnItem {

    int nRTT = 0;

    void giveCoins() {
        nRTT ++;
        if (nRTT >= starylMain.randomInt(2, 5)) {
            Player.items[2] ++;
            System.out.println("You found a staryl coin lying in the middle of the road\nYou now have " + Player.items[2] + " staryl coins");
            nRTT = 0;
        }
    }
    void givePebbles() {
        nRTT ++;
        if (nRTT >= starylMain.randomInt(3, 7)) {
            Player.items[1] += 5;
            System.out.println("You found 5 pebbles on the road\nYou now have " + Player.items[1] + " pebbles");
            nRTT = 0;
        }
    }
}
