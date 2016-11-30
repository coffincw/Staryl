
/* StarylMap -- This class represents the entire game map.  The vertices of a dodecahedron are the locations and the edges
 * are the connections between locations.
 */

public class StarylMap {

	static final int N_LOCATIONS = 20;
	static final int CAPITAL = 1;
	static final int JEX = 2;
	static final int LANA = 3;
	static final int ESKA = 4;
	static final int SANSK = 5;
	static final int KETL = 6;
	static final int LZAR = 7;
	static final int SUNG = 8;
	static final int QUET = 9;
	static final int CARL = 10;
	static final int ZAR = 11;
	static final int MARL = 12;
	static final int SETHS = 13;
	static final int TEAL = 14;
	static final int CROSSONE = 15;
	static final int CROSSTWO = 16;
	static final int CROSSTHREE = 17;
	static final int CROSSFOUR = 18;
	static final int CROSSFIVE = 19;
	static final int CROSSSIX = 20;


	final static String[] CITY_NAMES = {"", "capital", "jex", "lana", "eska", "sansk", "ketl", "lzar", "sung", "quet", "carl", "zar", "marl", "seths", "teal", "crossroad 1", "crossroad 2", "crossroad 3", "crossroad 4", "crossroad 5", "crossroad 6"};
	final static String[] EXPLORABLE_DESTINATIONS = {"", "capital", "jex", "lana", "eska", "sansk", "ketl", "lzar", "sung", "quet", "carl", "zar", "marl", "seths", "teal"};
	final static String[] CITY_SHORT_NAMES = {"", "cap", "j", "la", "es", "sa", "ke", "lz", "su", "q", "car", "z", "m", "se", "t", "c1", "c2", "c3", "c4", "c5", "c6"};
	final static String[] CITY_NAMES_RESHUFFLED = {"", "crossroad 1", "crossroad 2", "crossroad 3", "crossroad 4", "crossroad 5", "crossroad 6", "capital", "jex", "lana", "eska", "sansk", "ketl", "lzar", "sung", "quet", "carl", "zar", "marl", "seths", "teal", "crossroad 1", "crossroad 2", "crossroad 3", "crossroad 4", "crossroad 5", "crossroad 6"};


	static StarylLocation[] locations;
	
	StarylMap() {
		locations = new StarylLocation[N_LOCATIONS + 1];
		locations[1] =  new StarylLocation(1, 7, 0, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0); // v Crossroad ## v
		locations[2] =  new StarylLocation(2, 0, 0, 9, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		locations[3] =  new StarylLocation(3, 0, 0, 9, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0);
		locations[4] =  new StarylLocation(4, 0, 0, 0, 0, 0, 12, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0);
		locations[5] =  new StarylLocation(5, 0, 0, 0, 0, 0, 0, 0, 0, 15, 16, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		locations[6] =  new StarylLocation(6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 20, 0, 0, 0, 0, 0, 0);
		locations[7] = new StarylLocation(7, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 17, 0, 0, 20, 1, 0, 0, 0, 0, 0); // Capital
		locations[8] = new StarylLocation(8, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0); // Jex
		locations[9] = new StarylLocation(9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0); // Lana
		locations[10] = new StarylLocation(10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 1, 0, 0, 0, 0, 0); // Eska
		locations[11] = new StarylLocation(11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 0, 0); // Sansk
		locations[12] =  new StarylLocation(12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0); // Ketl
		locations[13] =  new StarylLocation(13, 0, 0, 0, 0, 0, 0, 0, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0); // Lzar
		locations[14] =  new StarylLocation(14, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0); // Sung
		locations[15] =  new StarylLocation(15, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0); // Quet
		locations[16] =  new StarylLocation(16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0, 5, 0); // Carl
		locations[17] =  new StarylLocation(17, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0); // Zar
		locations[18] =  new StarylLocation(18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0); // Marl
		locations[19] =  new StarylLocation(19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0,6); // Seths
		locations[20] =  new StarylLocation(20, 7, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6); // Teal

	}

	
	static String locationName(int dir) {
// change this to add direction
		if (dir >= 1 && dir <= 20)
			return CITY_NAMES[dir];
		else
			return "ERROR";
	}
	
	static int directionNumber(String dir) {
		for (int i = 1; i <= N_LOCATIONS; i++) {
			if (CITY_NAMES[i].equals(dir) ||
				CITY_SHORT_NAMES[i].equals(dir)) {
				return i;
			} 
		}
		return 0;

	}
	
	StarylLocation getRoom(int ndx) {
		return locations[ndx];
	}

	int randomCity() {
		int r = 0;
		do {
			r = (int) (Math.random() * N_LOCATIONS + 1);
		}	
		while (locations[r].getElement() != null);
		return r;
	}
	
	void addElement(RoomElement elem) {getRoom(randomCity()).setElement(elem);}

	// remove and replace element in random position
	// locations[i].setElement(null);
	// addElement(new ---());

}
