import java.io.*;
import java.util.Random;
/*
Ideas:

Need to do first:
- Increase economy so that bank is a viable option
- update array reset method in player
- make it so the training center doesnt allow you to train maxed out items
- finish bank withdraw method
- code pet / pet shop class
- figure out how to make the buildings/locations align in the print out statement in cities

Other ideas:
- map allows you to see information about locations you've traveled to
    - building names
- add bosses ( gain armour and weapon experience from fighting bosses
- add storyline
- mini mission
    - might include a wumpus type map (maze)
- Add compounding interest as a bank plan

Fix:
*/

/* Copy and Paste Code
- NumberFormatException (stops errors caused by inputing strings for #
			while (v < 1){
				try {
					v = Integer.valueOf(readLine(""));
				}
				catch (NumberFormatException ex) {}
			}
 */

public class starylMain {

    // initiating maps
    static StarylMap map = new StarylMap();
    static SpawnItem spawn = new SpawnItem();
    static CityInfo org = new CityInfo();
    static Player p = new Player();
    static ViewableMaps seemaps = new ViewableMaps();
    static TrainingCenter training = new TrainingCenter();
    static MonsterOrganization monster = new MonsterOrganization();

    static int nDistance;
    static int gameDiff;

    //pick map
    static int chooseMap;
    static int turn = 0;

    static int Cityndx;

    //loops
    static String reEdit;
    static boolean city;
    private static boolean replayFull;

    public static int currentRoomIndex = 1;

    // special i/o method required because Eclipse does not provide a Console object
    static String readLine(String prompt) {
        String line = null;
        Console c = System.console();
        if (c != null) {
            line = c.readLine(prompt);
        } else {
            System.out.print(prompt);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                //Ignore
            }
        }
        return line;
    }

    public static StarylLocation currentRoom() {
        return map.getRoom(currentRoomIndex);
    }

    public static int randomInt(int min, int max) { //generates a random integer between the two parameters
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    static void initiateObj(int e, int s) { // method for initiating objects including enemies and Room Elements
//        map.addElement(new MerchantElement());
    }

    static void End() {
        // Console asks if player wants to play again
        String replay = readLine("Play again? (yes) or (no)");
        replay = replay.toLowerCase();
        if (replay.equals("no")) {
            replayFull = false;
        }
    }


    public static void main (String[] args) {

        replayFull = true; // play again boolean
        do {
            turn = 0; // for armour experience
            spawn.nRTT = 0; //for item spawn
            int gamemodeTitle = 0;
            while (gamemodeTitle < 1) {
                try {
                    gamemodeTitle = Integer.valueOf(readLine("STARYL\n<1> Play\n<2> Instructions\n<3> Leave\n"));
                } catch (NumberFormatException ex) {
                }
            }
            if (gamemodeTitle == 1) {
                while (gameDiff < 1) {
                    try {
                        gameDiff = Integer.valueOf(readLine("Select a difficulty\n<1> Easy (1 life / 50 health) \n<2> Medium (3 lives / 100 health)\n<3> Hard (5 Lives / 200 health)\n"));
                    } catch (NumberFormatException ex) {
                    }
                }
                currentRoomIndex = map.randomCity();

                do {
                    // armour exp, coins, pebbles and lives for locations traveled
                    spawn.giveCoins();
                    spawn.givePebbles();
                    monster.spawnMonster(0, monster.monsterHealth, monster.MONSTER_NAMES, 10, 30);

                    // prints info
                    map.getRoom(currentRoomIndex).printInfo();

                    String userInput = readLine(">");
                    userInput = userInput.toLowerCase();
                    if (userInput.equals("s") || userInput.equals("stats") || userInput.equals("gear info")) {
                        p.Stats();
                    } else if (userInput.equals("m") || userInput.equals("map")) {
                        seemaps.fullMap();
                    } else if (userInput.equals("b") || userInput.equals("backpack") || userInput.equals("inventory")) {
                        p.Inventory();
                    } else if (userInput.equals("l") || userInput.equals("leave")) {
                        map.getRoom(currentRoomIndex).printTravel();
                        String travel = readLine("\nWhere would you like to travel to? (Enter: (explore) or (e) to stay in current location)");
                        travel = travel.toLowerCase();
                        int direction = 0;
                        if (travel.equals("explore" ) || travel.equals("e")) {}
                        else if ((direction = StarylMap.directionNumber(travel)) != 0) {
                            nDistance += 1;
                            Cityndx = StarylMap.directionNumber(travel);
                            StarylLocation nowRoom = map.getRoom(currentRoomIndex);
                            StarylLocation targetRoom = nowRoom.roomInDirection(direction);
                            if (targetRoom != null) {
                                currentRoomIndex = targetRoom.getIndex();
                                targetRoom.handleElement();
                            } else {
                                System.out.println("You can't move in that direction.");
                            }
                        } else if (travel.equals("bye")) {
                            Player.playerLives[gameDiff] = 0;
                        } else {
                            System.out.println("Command not understood");
                        }
                    } else if (userInput.equals("e") || userInput.equals("explore")) {
                        org.cityOrganization(currentRoomIndex);
                    } else if (userInput.equals("bye")) {
                        Player.playerLives[gameDiff] = 0;
                    } else {
                        System.out.println("Command not understood.");
                    }
                } while (Player.playerLives[gameDiff] > 0);
                End();
                p.arrayReset();

            } else if (gamemodeTitle == 2) {
                TitleScreen.Instructions();
            } else if (gamemodeTitle == 3) {
                TitleScreen.seeMap();
            }

        } while (replayFull);


    }
}


