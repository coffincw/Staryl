/**
 * Created by coffincw on 11/27/16.
 */
public class City_Marl {

    static Staryl_Express train = new Staryl_Express();

    private final String MARL_BUILDING_NAMES[] = {"Beach Station", "Wrecked Ship",  "Leave Marl Interior"};
    private final String MARL_BUILDING_SHORT_NAMES[] = {"station", "ship", "leave"};

    void marlCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("(T)marl(T)\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= MARL_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + MARL_BUILDING_SHORT_NAMES[i] + ")\t" + MARL_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(MARL_BUILDING_SHORT_NAMES[0])) {
                train.Station("marl");
            } else if (userInput.equals(MARL_BUILDING_SHORT_NAMES[1])) {
                shipInfo();
            } else if (userInput.equals(MARL_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {}
        }

    }
    void shipInfo() {

    }

}
