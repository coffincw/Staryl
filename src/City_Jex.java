/**
 * Created by coffincw on 11/25/16.
 */
public class City_Jex {

    static TrainingCenter training = new TrainingCenter();

    private final String JEX_BUILDING_NAMES[] = {"Jasmines Bakery", "The University", "Jex Training Center", "Leave Jex Interior"};
    private final String JEX_BUILDING_SHORT_NAMES[] = {"bakery", "uni", "train", "leave"};

    void jexCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("<<Jex>>\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= JEX_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + JEX_BUILDING_SHORT_NAMES[i] + ")\t" + JEX_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(JEX_BUILDING_SHORT_NAMES[0])) {
                bakeryInfo();
            } else if (userInput.equals(JEX_BUILDING_SHORT_NAMES[1])) {
                universityInfo();
            } else if (userInput.equals(JEX_BUILDING_SHORT_NAMES[2])) {
                training.trainingInfo(JEX_BUILDING_NAMES[2]);
            } else if (userInput.equals(JEX_BUILDING_SHORT_NAMES[3])) {
                starylMain.city = false;
            } else {}
        }

    }
    void bakeryInfo() {

    }
    void universityInfo() {

    }
}
