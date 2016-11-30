/**
 * Created by coffincw on 11/27/16.
 */
public class City_Zar {

    static HealCenter hotel = new HealCenter();

    private final String ZAR_BUILDING_NAMES[] = {"Heath Suites", "Andy's House",  "Leave Zar Interior"};
    private final String ZAR_BUILDING_SHORT_NAMES[] = {"suite", "house", "leave"};

    void zarCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println(":-: Zar :-:\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= ZAR_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + ZAR_BUILDING_SHORT_NAMES[i] + ")\t" + ZAR_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(ZAR_BUILDING_SHORT_NAMES[0])) {
                hotel.healcenterInfo(ZAR_BUILDING_NAMES[0]);
            } else if (userInput.equals(ZAR_BUILDING_SHORT_NAMES[1])) {
                houseInfo();
            } else if (userInput.equals(ZAR_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {}
        }

    }

    void houseInfo() {

    }
}
