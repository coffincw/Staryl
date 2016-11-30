/**
 * Created by coffincw on 11/27/16.
 */
public class City_Teal {

    static Pet pet = new Pet();
    static TrainingCenter train = new TrainingCenter();

    private final String TEAL_BUILDING_NAMES[] = {"Teal Training Building", "Teal Pet mart", "Leave Teal Interior"};
    private final String TEAL_BUILDING_SHORT_NAMES[] = {"train", "pet", "leave"};

    void tealCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("=Teal=\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= TEAL_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + TEAL_BUILDING_SHORT_NAMES[i] + ")\t" + TEAL_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(TEAL_BUILDING_SHORT_NAMES[0])) {
                train.trainingInfo("Teal");
            } else if (userInput.equals(TEAL_BUILDING_SHORT_NAMES[1])) {
                pet.shopInfo();
            } else if (userInput.equals(TEAL_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {}
        }

    }
}
