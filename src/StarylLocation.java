/* StarylLocation -- This class represents a single room on the map; a room corresponds to one vertex of a dodecahedron.
 * The class helps in navigating the map and handling encounters when the player moves. 
 */
public class StarylLocation {

		int myIndex;
		int[] neighbors;
		
		public RoomElement myElement;
		
		StarylLocation(int ndx, int c, int j, int l, int e, int s, int k, int lz, int su, int q, int car, int z, int m, int se, int t, int cOne, int cTwo, int cThree, int cFour, int cFive, int cSix) {
			myIndex = ndx;
			neighbors = new int [StarylMap.N_LOCATIONS + 1];
			neighbors[StarylMap.CAPITAL] = c;
			neighbors[StarylMap.JEX] = j;
			neighbors[StarylMap.LANA] = l;
			neighbors[StarylMap.ESKA] = e;
			neighbors[StarylMap.SANSK] = s;
			neighbors[StarylMap.KETL] = k;
			neighbors[StarylMap.LZAR] = lz;
			neighbors[StarylMap.SUNG] = su;
			neighbors[StarylMap.QUET] = q;
			neighbors[StarylMap.CARL] = car;
			neighbors[StarylMap.ZAR] = z;
			neighbors[StarylMap.MARL] = m;
			neighbors[StarylMap.SETHS] = se;
			neighbors[StarylMap.TEAL] = t;
			neighbors[StarylMap.CROSSONE] = cOne;
			neighbors[StarylMap.CROSSTWO] = cTwo;
			neighbors[StarylMap.CROSSTHREE] = cThree;
			neighbors[StarylMap.CROSSFOUR] = cFour;
			neighbors[StarylMap.CROSSFIVE] = cFive;
			neighbors[StarylMap.CROSSSIX] = cSix;

		}
		
		int getIndex() {
			return myIndex;
		}
		
		RoomElement getElement() {
			return myElement;
		}
		
		void setElement(RoomElement elem) {
			myElement = elem;
		}
		
		StarylLocation roomInDirection(int dir) {
			return starylMain.map.getRoom(neighbors[dir]);
		}


		void printInfo() {
			if (starylMain.nDistance > 0) {
				System.out.print("\nWelcome to " + StarylMap.CITY_NAMES[starylMain.Cityndx].toUpperCase() + ".");
			} else {
				System.out.print("\nWelcome to " + StarylMap.CITY_NAMES_RESHUFFLED[starylMain.currentRoomIndex].toUpperCase() + ".");
			}
			System.out.println(starylMain.nDistance == 0 ? starylMain.currentRoomIndex >= 7 ? "\nInput:" +
					"\n(g) Gear Info" +
					"\n(m)	Map" +
					"\n(b)	Backpack" +
					"\n(l)	Leave location" +
					"\n(e)	explore town"
					:
					"\nInput:" +
					"\n(g)	Gear Info" +
					"\n(m)	Map" +
					"\n(b)	Backpack" +
					"\n(l)	Leave location"
					: starylMain.Cityndx <= 14 ?
					"\nInput: " +
					"\n(g)	Gear Info" +
					"\n(m)	Map" +
					"\n(b)	Backpack" +
					"\n(l)	Leave location" +
					"\n(e)	Explore town"
					:
					"\nInput: " +
					"\n(g)	Gear Info" +
					"\n(m)	Map" +
					"\n(b)	Backpack" +
					"\n(l)	Leave location");
			System.out.println();
			for (int i = 1; i <= StarylMap.N_LOCATIONS; i++) {
				StarylLocation room = roomInDirection(i);
				if (room != null && room.myElement != null) {
					room.myElement.printSenses();					
				}
			}

			System.out.println();
		}

		void printTravel() {
			System.out.println("Travel to: ");
			for (int i = 1; i <= StarylMap.N_LOCATIONS; i++) {
				StarylLocation room = roomInDirection(i);
				if (room != null) {
					System.out.print(" " + StarylMap.locationName(i));
				}
			}
		}
		
		void handleElement() {
			if (myElement != null) {
				myElement.handle();
			}
		}
}
