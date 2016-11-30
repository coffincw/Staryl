/**
 * Created by coffincw on 11/25/16.
 */
public class City_Lana {

    private final String LANA_BUILDING_NAMES[] = {"Lana Market", "Sword Gas Station", "Leave Lana Interior"};
    private final String LANA_BUILDING_SHORT_NAMES[] = {"market", "gas", "leave"};

    static Market store = new Market();

    void lanaCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("||Lana||\nWhat location would you like to enter?\nInput:");
            for (int i = 0; i <= LANA_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + LANA_BUILDING_SHORT_NAMES[i] + ")\t" + LANA_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(LANA_BUILDING_SHORT_NAMES[0])) {
                store.marketInfo(LANA_BUILDING_NAMES[0]);
            } else if (userInput.equals(LANA_BUILDING_SHORT_NAMES[1])) {
                gasInfo();
            } else if (userInput.equals(LANA_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {
            }
        }

    }

    void gasInfo() {
        System.out.println("Welcome to Clef's Apartment Building!  I hope you find what you need here!\nWould you like to talk to:\n");
        for (int i = 0; i <= CityInfo.PEOPLE_NAMES.length; i++) {

        }
        String gasTalk = starylMain.readLine(">");
        gasTalk = gasTalk.toLowerCase();
    }
}

