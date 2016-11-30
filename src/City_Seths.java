/**
 * Created by coffincw on 11/27/16.
 */
public class City_Seths {

    static Market store = new Market();

    private final String SETHS_BUILDING_NAMES[] = {"Seths' Flea Market", "Leave Seths Interior"};
    private final String SETHS_BUILDING_SHORT_NAMES[] = {"market", "leave"};

    void sethsCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("Seths\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= SETHS_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + SETHS_BUILDING_SHORT_NAMES[i] + ")\t" + SETHS_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(SETHS_BUILDING_SHORT_NAMES[0])) {
                store.marketInfo(SETHS_BUILDING_NAMES[0]);
            } else if (userInput.equals(SETHS_BUILDING_SHORT_NAMES[1])) {
                starylMain.city = false;
            } else {}
        }

    }
}
