/**
 * Created by coffincw on 11/26/16.
 */
public class City_Ketl {

    static Staryl_Express train = new Staryl_Express();

    private final String KETL_BUILDING_NAMES[] = {"Ketl County Train Station" ,"Sarah's House", "Leave Ketl Interior"};
    private final String KETL_BUILDING_SHORT_NAMES[] = {"station", "house", "leave"};


    void ketlCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("{ Ketl }\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= KETL_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + KETL_BUILDING_SHORT_NAMES[i] + ")\t" + KETL_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(KETL_BUILDING_SHORT_NAMES[0])) {
                train.Station("ketl");
            } else if (userInput.equals(KETL_BUILDING_SHORT_NAMES[1])) {
                sarahsInfo();
            } else if (userInput.equals(KETL_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {
            }
        }
    }

    void sarahsInfo() {
    }
}

