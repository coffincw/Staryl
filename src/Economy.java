/**
 * Created by coffincw on 11/25/16.
 */
public class Economy {

    static Gearset gear = new Gearset();

    void buyItems() { // main page to buy items
        boolean items = true;
        while (items) {
            int itemChoice = 0;
            while (itemChoice < 1) {
                try {
                    itemChoice = Integer.valueOf(starylMain.readLine("What would you like to buy:" +
                            "\n<1> Health Potions (2 coins)" +
                            "\n<2> Pebbles (1 coin for 5 pebbles)" +
                            "\n<3> Purchase something else"));

                } catch (NumberFormatException ex) {
                }
            }
            switch (itemChoice) {
                case 1: // purchase health potions
                    buyHeathPotions();
                    break;
                case 2: // purchase pebbles
                    buyPebbles();
                    break;
                case 3:
                    items = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    void buyHeathPotions() { // purchase health potions with coins
        if (Player.items[2] >= 2) { // makes sure player has enough gold
            Player.items[0]++;
            System.out.println("Thank you for buying from us!" +
                    "\n1 Health Potion was added to your backpack" +
                    "\nHealth Potions: " + Player.items[0]);
            Player.items[2] -= 2; // charges players balance

        } else {
            System.out.println("You do not have enough coins to buy this");
        }
    }

    void buyPebbles() {  // purchase pebbles (slingshot amo) with coins
        if (Player.items[2] >= 1) {
            Player.items[1] += 5;
            System.out.println("Thank you for buying from us!" +
                    "\n5x Pebbles was added to your backpack" +
                    "\nPebbles: " + Player.items[1]);
            Player.items[2]--;

        } else {
            System.out.println("You do not have enough coins to buy this");
        }
    }

    void buyArmour() {  // Main store page to buy armour
        boolean armour = true;
        while (armour) {
            int armourChoice = 0;

            while (armourChoice < 1) {
                try {
                    armourChoice = Integer.valueOf(starylMain.readLine("What would you like to buy:" +
                            "\n<1> Helmet Experience (5 coins for 20 experience)" +
                            "\n<2> Shirt Experience (5 coins for 10 experience)" +
                            "\n<3> Pants Experience (5 coins for 10 experience) " +
                            "\n<4> Boots Experience (5 coins for 20 experience)" +
                            "\n<5> Purchase something else"));

                } catch (NumberFormatException ex) {
                }
            }
            switch (armourChoice) {
                case 1: // purchase helmet experience
                    buyHelmetEXP();
                    break;
                case 2: // purchase shirt
                    buyShirtEXP();
                    break;
                case 3:
                    buyPantsEXP();
                    break;
                case 4:
                    buyBootsEXP();
                    break;
                case 5:
                    armour = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    void buyHelmetEXP() { // buy experience for helmet
        if (Player.items[2] >= 5) { // makes sure player has enough gold
            gear.armourExp[0] += 20;
            System.out.println("Thank you for buying from us!" +
                    "\n20 experience was added to your " + gear.armourUpgrade[gear.armourUpValue[0]] + gear.armour[0]);
            gear.armourLevelUp();
            System.out.println("Helmet Experience: " + gear.armourExp[0]);
            Player.items[2] -= 5; // charges players balance

        } else {
            System.out.println("You do not have enough coins to buy this");
        }
    }

    void buyShirtEXP() { // buy experience for shirt
        if (Player.items[2] >= 5) {
            gear.armourExp[1] += 10;
            System.out.println("Thank you for buying from us!" +
                    "\n10 Experience was added to your " + gear.armourUpgrade[gear.armourUpValue[1]] + gear.armour[1]);
            gear.armourLevelUp();
            System.out.println("Shirt Experience: " + gear.armourExp[1]);
            Player.items[2] -= 5;

        } else {
            System.out.println("You do not have enough coins to buy this");
        }
    }

    void buyPantsEXP() { // buy experience for pants
        if (Player.items[2] >= 5) {
            gear.armourExp[2] += 10;
            System.out.println("Thank you for buying from us!" +
                    "\n10 Experience was added to your "  + gear.armourUpgrade[gear.armourUpValue[2]] + gear.armour[2]);
            gear.armourLevelUp();
            System.out.println("Shirt Experience: " + gear.armourExp[2]);
            Player.items[2] -= 5;

        } else {
            System.out.println("You do not have enough coins to buy this");
        }
    }

    void buyBootsEXP() { // buy experience for boots
        if (Player.items[2] >= 5) {
            gear.armourExp[3] += 20;
            System.out.println("Thank you for buying from us!" +
                    "\n20 Experience was added to your "  + gear.armourUpgrade[gear.armourUpValue[3]] + gear.armour[3]);
            gear.armourLevelUp();
            System.out.println("Shirt Experience: " + gear.armourExp[3]);
            Player.items[2] -= 5;

        } else {
            System.out.println("You do not have enough coins to buy this");
        }
    }

    void buyWeapons() { // main weapon experience store page
        boolean weapon = true;
        while (weapon) {
            int weaponChoice = 0;

            while (weaponChoice < 1) {
                try {
                    weaponChoice = Integer.valueOf(starylMain.readLine("What would you like to buy:" +
                            "\n<1> Weapon Experience (5 coins for 25 experience)" +
                            "\n<5> Purchase something else"));

                } catch (NumberFormatException ex) {
                }
            }
            switch (weaponChoice) {
                case 1: // purchase helmet experience
                    buyWeaponEXP();
                    break;
                case 2:
                    weapon = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    void buyWeaponEXP() { //method from store which allows the player to buy experience points for their weapons
        if (Player.items[2] >= 5) {
            for (int w = 0 ; w <= gear.weaponExp.length - 1 ; w++) {
                if (gear.weaponClass == w) {
                    gear.weaponExp[w] += 25;
                }
            }
            System.out.println("Thank you for buying from us!" +
                    "\n25 Experience was added to your: ");
            for (int w = 0 ; w <= gear.weaponExp.length - 1 ;  w++) {
                if (gear.weaponClass == w) {
                    if (gear.weaponClass == 0) {
                        System.out.println(gear.slingshotUpgrade[gear.weaponUpValue[w]] + gear.weapons[w]);
                    } else if (gear.weaponClass == 1) {
                        System.out.println(gear.macheteUpgrade[gear.weaponUpValue[w]] + gear.weapons[w]);
                    } else if (gear.weaponClass == 2) {
                        System.out.println(gear.rifleUpgrade[gear.weaponUpValue[w]] + gear.weapons[w]);
                    } else if (gear.weaponClass == 3) {
                        System.out.println(gear.saberUpgrade[gear.weaponUpValue[w]] + gear.weapons[w]);
                    }
                }
            }
            gear.weaponLevelUp();
            gear.weaponClassUp();
            System.out.println("Shirt Experience: " + gear.armourExp[3]);
            Player.items[2] -= 5;

        } else {
            System.out.println("You do not have enough coins to buy this");
        }
    }
}
