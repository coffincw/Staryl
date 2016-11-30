/**
 * Created by coffincw on 11/26/16.
 */
public class City_Eska {

    static HealCenter hotel = new HealCenter();

    private final String ESKA_BUILDING_NAMES[] = {"Eska Bridge" ,"Quality Bed and Breakfast", "Leave Eska Interior"};
    private final String ESKA_BUILDING_SHORT_NAMES[] = {"bridge", "bnb", "leave"};

    void eskaCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("-_-Eska-_-\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= ESKA_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + ESKA_BUILDING_SHORT_NAMES[i] + ")\t" + ESKA_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(ESKA_BUILDING_SHORT_NAMES[0])) {
                bridgeInfo();
            } else if (userInput.equals(ESKA_BUILDING_SHORT_NAMES[1])) {
                hotel.healcenterInfo(ESKA_BUILDING_NAMES[1]);
            } else if (userInput.equals(ESKA_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {}
        }

    }
    void bridgeInfo() {

    }

}
