/**
 * Created by coffincw on 11/27/16.
 */
public class City_Carl {

    private final String CARL_BUILDING_NAMES[] = {"MT. St.Carl", "Old Shack", "Leave Carl Interior"};
    private final String CARL_BUILDING_SHORT_NAMES[] = {"mt", "shack", "leave"};

    void carlCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("^Carl^\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= CARL_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + CARL_BUILDING_SHORT_NAMES[i] + ")\t" + CARL_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(CARL_BUILDING_SHORT_NAMES[0])) {
                volcanoInfo();
            } else if (userInput.equals(CARL_BUILDING_SHORT_NAMES[1])) {
                shackInfo();
            } else if (userInput.equals(CARL_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {}
        }

    }
    void volcanoInfo() {

    }
    void shackInfo() {

    }
}
