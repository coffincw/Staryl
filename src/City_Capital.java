/**
 * Created by coffincw on 11/25/16.
 */
public class City_Capital {

    static Staryl_Express train = new Staryl_Express();
    static NationalBank bank = new NationalBank();

    private final String BUILDING_NAMES[] = {"Office Building" ,"Clefs Apartment Complex", "Government Building", "Capital Station", "Capital Street Bank", "Leave Capital Interior"};
    private final String BUILDING_SHORT_NAMES[] = {"office", "apartment", "gov", "station", "bank", "leave"};


    void capitalCentral () {
        starylMain.city = true;
        while (starylMain.city) {
            System.out.println("****CAPITAL*****\nThere are many different locations in the capital which one would you like to enter?\nInput:");
            for (int i = 0; i <= BUILDING_NAMES.length - 1; i++) {
                System.out.println("(" + BUILDING_SHORT_NAMES[i] + ")\t" + BUILDING_NAMES[i]);
            }
            String userInput = starylMain.readLine(">");
            userInput = userInput.toLowerCase().replaceAll(" ", "");
            if (userInput.equals(BUILDING_SHORT_NAMES[0])) {
                officeInfo();
            } else if (userInput.equals(BUILDING_SHORT_NAMES[1])) {
                apartmentInfo();
            } else if (userInput.equals(BUILDING_SHORT_NAMES[2])) {
                governmentInfo();
            } else if (userInput.equals(BUILDING_SHORT_NAMES[3])) {
                train.Station("capital");
            } else if (userInput.equals(BUILDING_SHORT_NAMES[4])) {
                bank.bankInfo(BUILDING_NAMES[4]);
            } else if (userInput.equals(BUILDING_SHORT_NAMES[5])) {
                starylMain.city = false;
            } else {}
        }

    }
    void officeInfo() {
        System.out.println("Welcome to the Capital's main office building!  I hope you find what you need here!\nWould you like to talk to:\n");
        for (int i = 0 ; i <= CityInfo.PEOPLE_NAMES.length ; i++) {

        }
        String officeTalk = starylMain.readLine(">");
        officeTalk = officeTalk.toLowerCase();
    }
    void apartmentInfo() {
        System.out.println("Welcome to Clef's Apartment Building!  I hope you find what you need here!\nWould you like to talk to:\n");
        for (int i = 0 ; i <= CityInfo.PEOPLE_NAMES.length ; i++) {

        }
        String apTalk = starylMain.readLine(">");
        apTalk = apTalk.toLowerCase();
    }
    void governmentInfo() {
        System.out.println("Welcome to the Capital Government Center!  I hope you find what you need here!\nWould you like to talk to:\n");
        for (int i = 0 ; i <= CityInfo.PEOPLE_NAMES.length ; i++) {

        }
        String govTalk = starylMain.readLine(">");
        govTalk = govTalk.toLowerCase();
    }
}
