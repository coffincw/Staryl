/**
 * Created by coffincw on 11/26/16.
 */
public class City_Sung {

    static TrainingCenter training = new TrainingCenter();

    // for pub make a slight change to buyHealthPotions method

    private final String SUNG_BUILDING_NAMES[] = {"Sung Drunken Sailor Pub" ,"The Old Lighthouse", "Sung Cliff Training Center", "leave sung interior"};
    private final String SUNG_BUILDING_SHORT_NAMES[] = {"pub", "lighthouse", "train", "leave"};

    void sungCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("<U Sung U>\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= SUNG_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + SUNG_BUILDING_SHORT_NAMES[i] + ")\t" + SUNG_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(SUNG_BUILDING_SHORT_NAMES[0])) {
                pubInfo();
            } else if (userInput.equals(SUNG_BUILDING_SHORT_NAMES[1])) {
                lighthouseInfo();
            } else if (userInput.equals(SUNG_BUILDING_SHORT_NAMES[2])) {
                training.trainingInfo(SUNG_BUILDING_NAMES[2]);
            } else if (userInput.equals(SUNG_BUILDING_SHORT_NAMES[3])) {
                starylMain.city = false;
            } else {}
        }

    }
    void pubInfo() { // sell beer here (heals 10 hp)

    }
    void lighthouseInfo() {

    }
}
