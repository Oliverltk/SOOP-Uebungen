import java.util.Scanner;

public class Praktikum03old {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][][] gameboard = { { {}, { 0 }, {}, {}, {}, {} }, { {}, {}, { 2 }, { 5 }, {}, {} },
				{ { 1 }, {}, {}, {}, {}, {} }, { {}, {}, {}, {}, { 4 }, {} }, { {}, {}, {}, {}, {}, { 6 } },
				{ {}, {}, {}, { 4 }, {}, {} }, { { 1 }, { 0 }, { 0 }, { 0 }, { 0 }, { 2 } } };
		int n = 3;
		int currentState = 1;

		// Praktikum03
		
		Praktikum2.createTable(gameboard, n , currentState);
		//Array für Spielerposition, boolean für Schwert und Schlüssel
		int x = 0;
		int y = 0;
		int position[] = { x, y };
		boolean hatSchwert = false;
		boolean hatSchlüssel = false;
		
		//bewege den Spieler
		String bewege = s.nextLine();

		switch (bewege) {
		case "links":
			position[1] = position[1] - 1;
		case "rechts":
			position[1] = position[1] + 1;
		case "oben":
			position[0] = position[0] - 1;
		case "unten":
			position[0] = position[0] + 1;
		}
		
		String object = "";
		
		//left,right,up,down
		System.out.println("Wenn ich nach links schaue, treffe ich auf "+object);
		System.out.println("Wenn ich nach rechts schaue, treffe ich auf "+object);
		System.out.println("Wenn ich nach oben schaue, treffe ich auf "+object);
		System.out.println("Wenn ich nach unten schaue, treffe ich auf "+object);
		
		System.out.println(createTable(gameboard, n, currentState));
		System.out.println(gameboard.length);
		System.out.println(gameboard[0].length);
		System.out.println(gameboard[0][0].length);
	}

	// normale Feldbausteine
	public static String[] empty() {

		String[] empty = new String[6];
		empty[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		empty[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		empty[2] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		empty[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		empty[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		empty[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (empty);
	}

	public static String[] dragon() {

		String[] dragon = new String[6];
		dragon[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		dragon[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		dragon[2] = " " + "d" + "r" + "a" + "g" + "o" + "n" + " " + "|";
		dragon[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		dragon[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		dragon[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (dragon);
	}

	public static String[] sword() {

		String[] sword = new String[6];
		sword[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		sword[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		sword[2] = " " + "s" + "w" + "o" + "r" + "d" + " " + " " + "|";
		sword[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		sword[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		sword[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (sword);
	}

	public static String[] river() {

		String[] river = new String[6];
		river[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		river[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		river[2] = " " + "r" + "i" + "v" + "e" + "r" + " " + " " + "|";
		river[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		river[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		river[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (river);
	}

	public static String[] arch() {

		String[] arch = new String[6];
		arch[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		arch[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		arch[2] = " " + "a" + "r" + "c" + "h" + " " + " " + " " + "|";
		arch[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		arch[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		arch[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (arch);
	}

	public static String[] door() {

		String[] door = new String[6];
		door[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		door[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		door[2] = " " + "d" + "o" + "o" + "r" + " " + " " + " " + "|";
		door[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		door[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		door[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (door);
	}

	public static String[] key() {

		String[] key = new String[6];
		key[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		key[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		key[2] = " " + "k" + "e" + "y" + " " + " " + " " + " " + "|";
		key[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		key[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		key[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (key);
	}

	public static String[] treasure() {

		String[] treasure = new String[6];
		treasure[0] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		treasure[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		treasure[2] = "t" + "r" + "e" + "a" + "s" + "u" + "r" + "e" + "|";
		treasure[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		treasure[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		treasure[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (treasure);
	}

	// falls sich der Spieler in einem Feld befindet
	public static String[] dragon(int x) {

		String[] dragon = new String[6];
		dragon[0] = "" + "p" + "l" + "a" + "y" + "e" + "r" + " " + "|";
		dragon[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		dragon[2] = " " + "d" + "r" + "a" + "g" + "o" + "n" + " " + "|";
		dragon[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		dragon[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		dragon[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (dragon);
	}
	
	public static String[] sword(int x) {

		String[] sword = new String[6];
		sword[0] = " " + "p" + "l" + "a" + "y" + "e" + "r" + " " + "|";
		sword[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		sword[2] = " " + "s" + "w" + "o" + "r" + "d" + " " + " " + "|";
		sword[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		sword[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		sword[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (sword);
	}
	
	public static String[] river(int x) {

		String[] river = new String[6];
		river[0] = " " + "p" + "l" + "a" + "y" + "e" + "r" + " " + "|";
		river[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		river[2] = " " + "r" + "i" + "v" + "e" + "r" + " " + " " + "|";
		river[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		river[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		river[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (river);
	}

	public static String[] arch(int x) {

		String[] arch = new String[6];
		arch[0] = " " + "p" + "l" + "a" + "y" + "e" + "r" + " " + "|";
		arch[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		arch[2] = " " + "a" + "r" + "c" + "h" + " " + " " + " " + "|";
		arch[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		arch[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		arch[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (arch);
	}
	
	public static String[] door(int x) {

		String[] door = new String[6];
		door[0] = " " + "p" + "l" + "a" + "y" + "e" + "r" + " " + "|";
		door[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		door[2] = " " + "d" + "o" + "o" + "r" + " " + " " + " " + "|";
		door[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		door[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		door[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (door);
	}

	public static String[] key(int x) {

		String[] key = new String[6];
		key[0] = " " + "p" + "l" + "a" + "y" + "e" + "r" + " " + "|";
		key[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		key[2] = " " + "k" + "e" + "y" + " " + " " + " " + " " + "|";
		key[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		key[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		key[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (key);
	}


	public static String[] treasure(int x) {

		String[] treasure = new String[6];
		treasure[0] = " " + "p" + "l" + "a" + "y" + "e" + "r" + " " + "|";
		treasure[1] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		treasure[2] = "t" + "r" + "e" + "a" + "s" + "u" + "r" + "e" + "|";
		treasure[3] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		treasure[4] = " " + " " + " " + " " + " " + " " + " " + " " + "|";
		treasure[5] = "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*";
		return (treasure);
	}

	public static String createTable(int[][][] gameboard, int n, int currentState) {
		String createTable = "      |";
		String temp = "";

		for (int i = 1; i <= gameboard[0].length; i++) {
			createTable = createTable + "       " + i + "|";
		}
		createTable = createTable + "\n";
		createTable = createTable + "*******";
		for (int i = 1; i <= gameboard[0].length; i++) {
			createTable = createTable + "*********";
		}

		createTable = createTable + "\n";
		for (int p = 1; p < gameboard.length; p++) {
			for (int q = 0; q < 6; q++) {
				if (q == 2) {
					if (currentState == p) {
						createTable = createTable + "--> " + (p) + " |";
					} else {
						createTable = createTable + "    " + (p) + " |";
					}
				} else if (q == 5) {
					createTable = createTable + "*******";
				} else {
					createTable = createTable + "      |";
				}
				for (int s = 0; s < gameboard[p - 1].length; s++) {
					if (gameboard[p - 1][s].length > 0) {
						switch (gameboard[p - 1][s][0]) {
						case 0:
							temp = dragon()[q];
							break;
						case 1:
							temp = sword()[q];
							break;
						case 2:
							temp = river()[q];
							break;
						case 3:
							temp = arch()[q];
							break;
						case 4:
							temp = door()[q];
							break;
						case 5:
							temp = key()[q];
							break;
						case 6:
							temp = treasure()[q];
							break;
						}
					} else {
						temp = empty()[q];
					}
					createTable += temp;
				}
				createTable += "\n";
			}
		}
		createTable += "      |";
		for (int i = 0; i < gameboard[gameboard.length - 1].length; i++) {
			createTable += "      " + (gameboard[gameboard.length - 1][i][0]) + " |";
		}
		return createTable;

	}

}
