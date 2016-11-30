/**
 * Created by coffincw on 11/26/16.
 */
public class City_Lzar {

    static Market store = new Market();

    private final String LZAR_BUILDING_NAMES[] = {"Post Office" ,"Lzar Mall", "Leave Lzar Interior"};
    private final String LZAR_BUILDING_SHORT_NAMES[] = {"post", "mall", "leave" };


    void lzarCentral() {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("+Lzar+\nWhich location would you like to enter?\nInput:");
            for (int i = 0; i <= LZAR_BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + LZAR_BUILDING_SHORT_NAMES[i] + ")\t" + LZAR_BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(LZAR_BUILDING_SHORT_NAMES[0])) {
                postofficeInfo();
            } else if (userInput.equals(LZAR_BUILDING_SHORT_NAMES[1])) {
                store.marketInfo(LZAR_BUILDING_NAMES[1]);
            } else if (userInput.equals(LZAR_BUILDING_SHORT_NAMES[2])) {
                starylMain.city = false;
            } else {
            }
        }
    }

    void postofficeInfo() {
    }
}
