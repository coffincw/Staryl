/**
 * Created by coffincw on 11/26/16.
 */
public class City_Sansk {

    static HealCenter hotel = new HealCenter();

    private final String SANSK_BUILDING_NAMES[] = {"Sansk Ice Museum" ,"The Frozen Bear Lodge", "Leave Sansk Interior"};
    private final String SANSK_BUILDING_SHORT_NAMES[] = {"museum", "pond", "leave"};

    void sanskCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("[]Sansk[]\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= SANSK_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + SANSK_BUILDING_SHORT_NAMES[i] + ")\t" + SANSK_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(SANSK_BUILDING_SHORT_NAMES[0])) {
                museumInfo();
            } else if (userInput.equals(SANSK_BUILDING_SHORT_NAMES[1])) {
                hotel.healcenterInfo(SANSK_BUILDING_NAMES[1]);
            } else if (userInput.equals(SANSK_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {}
        }

    }
    void museumInfo() {

    }
}
