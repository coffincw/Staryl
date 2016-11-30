/**
 * Created by coffincw on 11/26/16.
 */
public class Market {

    static Economy eco = new Economy();

    void marketInfo(String storeName) {
        boolean store = true;
        int storeTalk = Integer.valueOf(starylMain.readLine("Welcome to the " + storeName + "! I hope you find what you need here!\nYou have " + Player.items[2] + " Staryl coins\nWhat would you like to buy?\n<1> Items\n<2> Armour Experience\n<3> Weapon Experience\n<4> Exit " + storeName));
        while (store) {
            switch (storeTalk) {
                case 1:
                    eco.buyItems();
                    break;
                case 2:
                    eco.buyArmour();
                    break;
                case 3:
                    eco.buyWeapons();
                    break;
                case 4:
                    store = false;
                    break;
            }
        }
    }
}
