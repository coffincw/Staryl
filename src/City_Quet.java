/**
 * Created by coffincw on 11/26/16.
 */
public class City_Quet {

    static NationalBank bank = new NationalBank();

    private final String QUET_BUILDING_NAMES[] = {"National Bank" ,"Battle Colosseum", "Skyscraper Work Site", "Leave Sansk Interior"};
    private final String QUET_BUILDING_SHORT_NAMES[] = {"bank", "colosseum", "work", "leave"};

    void quetCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("|-|Quet City|-|\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= QUET_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + QUET_BUILDING_SHORT_NAMES[i] + ")\t" + QUET_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(QUET_BUILDING_SHORT_NAMES[0])) {
                bank.bankInfo("Quet");
            } else if (userInput.equals(QUET_BUILDING_SHORT_NAMES[1])) {
                collosseumInfo();
            } else if (userInput.equals(QUET_BUILDING_SHORT_NAMES[2])) {
                workInfo();
            } else if (userInput.equals(QUET_BUILDING_SHORT_NAMES[3])) {
                starylMain.city = false;
            } else {}
        }

    }
    void collosseumInfo() {

    }
    void workInfo() {

    }
}
