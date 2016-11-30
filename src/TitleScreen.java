/**
 * Created by C on 11/15/2016.
 */

/*
Class which have all the information available on the title screen.  It allows the player the see the game instructions, score explained, maps and to just start the game.
 */
public class TitleScreen extends starylMain {

    static Player p = new Player();

    static void Instructions() {
        boolean instruct = true;
        while (instruct) {
            instruct = true;
            int instructionsOption = 0;
            while (instructionsOption < 1) {
                try {
                    instructionsOption = Integer.valueOf(readLine("Which would you like to learn about: \n<1> Game Instructions\n<2> Score Explained\n<3> Return to Title\n"));
                } catch (NumberFormatException ex) {
                }
            }
            if (instructionsOption == 1) {
                TitleScreen.gameInstruct();
            } else if (instructionsOption == 2) {
                TitleScreen.ScoreExp();
            } else if (instructionsOption == 3) {
                instruct = false;
            }
        }
    }

    static void seeMap() {
        boolean mapStuff = true;
        while (mapStuff) {
            int mapInfo = 0;
            while (mapInfo < 1) {
                try {
                    mapInfo = Integer.valueOf(readLine("Pick a map:\n<1> Squareception\n<2> Windmill\n"));
                } catch (NumberFormatException ex) {
                }
            }
            if (mapInfo == 1) {
                chooseMap = 2;
                seemaps.fullMap();
                chooseMap = 0;
            } else if (mapInfo == 2) {
                chooseMap = 3;
                seemaps.fullMap();
                chooseMap = 0;
            }
            reEdit = readLine("Do you want to see another map? (yes) or (no)");
            reEdit = reEdit.toLowerCase();
            if (reEdit.equals("no")) {
                mapStuff = false;
            }

        }

    }

    static void gameInstruct() {
        System.out.println("PLEASE NOTE: THESE ARE INSTRUCTIONS FOR THE DEFAULT PLAYSET, VALUES GIVEN IN THESE INSTRUCTIONS MAY NOT APPLY TO OTHER PLAY SETS\n" +
                "------------\n" +
                "YOU ARE A FAMOUS HUNTER DESCENDING DOWN INTO THE CAVES OF DARKNESS,\n" +
                "LAIR OF THE INFAMOUS MAN-EATING WUMPUS.  YOU ARE EQUIPPED WITH FIVE\n" +
                "BENT ARROWS, AND ALL YOUR SENSES.  THERE ARE TWENTY CAVES CONNECTED\n" +
                "BY TUNNELS, AND THERE ARE TWO OTHER KINDS OF HAZARDS:\n" +
                "\n" +
                "        A) PITS, WHICH ARE BOTTOMLESS, AND USUALLY FATAL TO FALL\n" +
                "        INTO.  THERE ARE THREE SUCH PITS IN THE NETWORK.\n" +
                "\n" +
                "        B) SUPER-BATS, WHICH IF YOU STUMBLE INTO THEIR ROOM WILL\n" +
                "        PICK YOU UP AND DROP YOU IN SOME RANDOM ROOM IN THE NETWORK.\n" +
                "        YOU MAY SHOOT SUPER-BATS, THERE IS ONE IN THE NETWORK.\n" +
                "		 THE SUPER-BATS GENERALLY STAY IN THEIR OWN ROOMS, EXCEPT\n" +
                "		 WHEN DISPOSING OF INTRUDERS OR SCAVENGING FOR FOOD IN THE PITS.\n" +
                "\n" +
                "THERE ARE ALSO SPECIAL ROOMS AND ITEMS WHICH HOLD ITEMS YOU CAN COLLECT AND USE\n" +
                "ON YOUR HUNT:\n" +
                "\n" +
                "		 A) FOUNTAIN OF HEALING CHAMBER, WHICH HOLD A FOUNTAIN WHICH\n" +
                "			INCREASES YOUR LIVES BY ONE\n" +
                "\n" +
                "		 B) ARMORY'S, WHICH HOLD FIVE BRAND NEW BENT ARROWS FOR YOUR\n" +
                "			DISPOSAL\n" +
                "\n" +
                "		 C) CLIMBING GEAR, WHICH GRANTS AN ESCAPE FROM ONE BOTTOMLESS PIT\n" +
                "\n" +
                "IF YOU BLUNDER INTO THE SAME ROOM AS THE WUMPUS, YOU LOSE....\n" +
                "THE NORMALLY SLEEPING WUMPUS DOES NOT MOVE (HAVING GORGED HIMSELF UPON\n" +
                "A PREVIOUS HUNTER).  HOWEVER SEVERAL THINGS CAN WAKE HIM UP:\n" +
                "\n" +
                "        1) WALKING INTO HIS ROOM,\n" +
                "        2) SHOOTING AN ARROW ANYWHERE IN THE NETWORK,\n" +
                "        3) TRIPPING OVER DEBRIS (CLUMSINESS),\n" +
                "\n" +
                "IF HE WAKES UP THERE'S A POSSIBILITY HE WILL MOVE, HOWEVER, HE'S TOO\n" +
                "LAZY TO MOVE MORE THAN ONE ROOM BETWEEN SNOOZES.  THE WUMPUS IS TOO\n" +
                "BIG TO BE PICKED UP BY SUPER-BATS AND HAS SUCKER FEET, SO HE DOESN'T\n" +
                "FALL INTO THE PITS.\n" +
                "\n" +
                "YOU CAN SMELL THE WUMPUS FROM ONE OR TWO ROOMS AWAY.  YOU WILL\n" +
                "TREMBLE WITH FEAR WHEN HE MOVES ABOUT.  YOU CAN HEAR SUPER-BATS FROM\n" +
                "ONE ROOM AWAY, AND FEEL DRAFTS (FROM BOTTOMLESS PITS) FROM ONE ROOM\n" +
                "AWAY (AND TASTE THE FEAR...).\n" +
                "\n" +
                "TO SHOOT AN ARROW TYPE \"SHOOT\" INSTEAD OF A MOVE, AND THEN\n" +
                "SPECIFY WHICH ROOMS THE ARROW SHOULD PASS THROUGH.  YOU ARE STRONG\n" +
                "ENOUGH TO SHOOT IT THROUGH AS MANY AS FIVE ROOMS.  BENT ARROWS HAVE\n" +
                "NO PROBLEM ROUNDING CORNERS OF LESS THAN 98.6 DEGREES.  IF YOU\n" +
                "SPECIFY AN IMPOSSIBLE PATH THE ARROW WILL RICOCHET OFF THE WALLS OF\n" +
                "THE ROOM, LOSING SPEED, AND WILL EVENTUALLY COME TO REST IN ONE OF\n" +
                "THE ADJOINING ROOMS.\n" +
                "\n" +
                "EACH ROOM IS CONNECTED TO THREE OTHER ROOMS BY THREE TUNNELS A, B\n" +
                "AND C.  YOU MUST ALWAYS MOVE BETWEEN ROOMS BY SPECIFYING WHICH\n" +
                "TUNNEL YOU WISH TO EXPLORE.  YOU CAN ALWAYS RETRACE YOUR FOOT STEPS\n" +
                "BY MOVING BACK USING THE SAME TUNNEL DESIGNATOR.\n" +
                "\n" +
                "                GOOD LUCK HUNTING!!\n" +
                "\nSource: http://www.pdp8.net/games/wumpus.shtml\n");
    }

    static void ScoreExp() {
        System.out.println("Score Explained:\n" +
                "Score in this version of Hunt a Wumpus is based off of many different aspects:\n" +
                "		 1)	Amount of lives left once you slay the wumpus is multiplied by 10\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 2)	A room bonus assigned according to how many locations you traveled through\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 3) Amount of Wumpus present in the network multiplied by 10\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 4) Amount of Super-Bats present in the network multiplied by 2\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 5) Amount of Pits present in the network multipled by 5\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 6) Amount of Arrows brought into the network by the player multiplied by 3\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 7) A special room/item bonus according to the amount of special locations you travel\n" +
                "			through or items you collected multiplied by 2\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 8)	A bonus for slaying the wumpus (100 points)\n" +
                "			+ Added to total\n" +
                "\n" +
                "		 9) A point value assigned to each difficulty level\n" +
                "			- Subtracted from total\n");
    }
}
