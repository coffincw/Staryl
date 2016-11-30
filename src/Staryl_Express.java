/**
 * Created by coffincw on 11/26/16.
 */
public class Staryl_Express {

    static StarylMap map = new StarylMap();

    String destination;

    final private String ALL_TRAIN_DESTINATIONS[] = {"ketl","capital","marl"};
    private String POSSIBLE_TRAIN_DESTINATIONS[] = {"", ""};

    void Station (String cityStart) {
        System.out.println("Welcome to the " + cityStart + " Station\nWhere would you like to travel to?");
        for (int ad = 0 ; ad <= ALL_TRAIN_DESTINATIONS.length - 1 ; ad++) {
            if (ALL_TRAIN_DESTINATIONS[ad] != cityStart) {
                System.out.println(ALL_TRAIN_DESTINATIONS[ad]);
                if (POSSIBLE_TRAIN_DESTINATIONS[0].equals("")) {
                    POSSIBLE_TRAIN_DESTINATIONS[0] = ALL_TRAIN_DESTINATIONS[ad];
                } else {
                    POSSIBLE_TRAIN_DESTINATIONS[1] = ALL_TRAIN_DESTINATIONS[ad];
                }
            }
        }
        locamotiveTravel();
    }

    void locamotiveTravel () {
        destination = starylMain.readLine(">");
        destination = destination.toLowerCase();
        if (destination.equals(POSSIBLE_TRAIN_DESTINATIONS[0]) || destination.equals(POSSIBLE_TRAIN_DESTINATIONS[1])) {
            movePlayer();
        } else {
            System.out.println("Invalid Input");
        }
        for (int d = 0 ; d <= POSSIBLE_TRAIN_DESTINATIONS.length - 1 ; d++) {
            POSSIBLE_TRAIN_DESTINATIONS[d] = "";
        }
    }

    void movePlayer() { // currently broken
        int direction = 0;
        for (int i = 0 ; i <= map.EXPLORABLE_DESTINATIONS.length - 1 ; i++) {
            if (destination.equals(map.EXPLORABLE_DESTINATIONS[i])) {
                direction = StarylMap.directionNumber(destination);
                starylMain.currentRoomIndex = direction + 6;
                starylMain.Cityndx = i;
                starylMain.city = false;
            }
        }
    }
}
