/**
 * Created by coffincw on 11/25/16.
 */
public class CityInfo {

    static City_Capital capital = new City_Capital(); //train , bank
    static City_Jex jex = new City_Jex(); //training center
    static City_Lana lana = new City_Lana(); // store
    static City_Eska eska = new City_Eska(); // heal center
    static City_Sansk sansk = new City_Sansk(); // heal center
    static City_Ketl ketl = new City_Ketl(); // train
    static City_Lzar lzar = new City_Lzar(); // store
    static City_Sung sung = new City_Sung(); // training center
    static City_Quet quet = new City_Quet(); // bank
    static City_Carl carl = new City_Carl();
    static City_Zar zar = new City_Zar(); // heal center
    static City_Marl marl = new City_Marl(); // train
    static City_Seths seths = new City_Seths(); // store
    static City_Teal teal = new City_Teal(); //training center

    final static String PEOPLE_NAMES[][] = {{"", "Chef", "Mr.", "Mrs.", "Ms."}, {"Kit", "Brown", "Pan", "Spikes", "Pic", "Garrett", "Gaf", "Aem", "May", "Johnson", "Jackson", "Lig", "Marino"}};

    void cityOrganization(int ndx) {
        switch (ndx) {
            case 7:
                capital.capitalCentral();
                break;
            case 8:
                jex.jexCentral();
                break;
            case 9:
                lana.lanaCentral();
                break;
            case 10:
                eska.eskaCentral();
                break;
            case 11:
                sansk.sanskCentral();
                break;
            case 12:
                ketl.ketlCentral();
                break;
            case 13:
                lzar.lzarCentral();
                break;
            case 14:
                sung.sungCentral();
                break;
            case 15:
                quet.quetCentral();
                break;
            case 16:
                carl.carlCentral();
                break;
            case 17:
                zar.zarCentral();
                break;
            case 18:
                marl.marlCentral();
                break;
            case 19:
                seths.sethsCentral(); // done!
                break;
            case 20:
                teal.tealCentral();
                break;
        }

    }

}
