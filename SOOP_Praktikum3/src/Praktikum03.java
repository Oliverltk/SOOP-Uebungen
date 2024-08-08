import java.util.Scanner;

public class Praktikum03 {

	public static void main(String[] args) {
		/*
		 * int[][][] gameboard = { { {}, { 0 }, {}, {}, {}, {} }, { {}, {}, { 2 }, { 5
		 * }, {}, {} }, { { 1 }, {}, {}, {}, {}, {} }, { {}, {}, {}, {}, { 4 }, {} }, {
		 * {}, {}, {}, {}, {}, { 6 } }, { {}, {}, {}, { 4 }, {}, {} }, { { 1 }, { 0 }, {
		 * 0 }, { 0 }, { 0 }, { 2 } } };
		 * 
		 */
		int[][][] gameboard = { { {}, { 0 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 1 }, {}, {}, {} },
				{ {}, {}, { 2 }, { 1 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
				{ { 1 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, {}, { 4 }, {}, { 4 }, {}, {}, { 5 }, { 3 }, {}, {}, {}, {}, {} },
				{ {}, {}, {}, {}, {}, { 6 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, { 4 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, {}, {}, {}, {}, { 6 }, {}, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, {}, {}, {}, {}, {}, { 1 }, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, { 5 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, { 0 }, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 2 }, {}, {}, {}, {} },
				{ {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {} },
				{ {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 6 }, {}, {} },
				{ {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 0 }, {} },
				{ {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 4 } },
				{ {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, { 6 }, {}, {}, {}, {} }, { { 1 }, { 0 }, { 0 }, { 0 },
						{ 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 0 }, { 2 }, { 0 }, { 0 }, { 0 }, { 0 } } };

		int n = 3;
		int currentState = 1;

		gameloop(gameboard, n, currentState);

	}

	public static int eingabe;
	public static boolean hatSchwert = false;
	public static boolean ichBrenne = false;
	public static boolean hatSchlüssel = false;
	public static int hatSchatz = 0;
	static Scanner s = new Scanner(System.in);

	public static void gameloop(int gameboard[][][], int n, int currentState) {

		// Solange keine 2 Schätze gefunden wurden
		while (hatSchatz <= 2) {

			// Spielfeld drucken
			System.out.println(Praktikum2.createTable(gameboard, n, currentState));

			// Durchlaufen des Arrays
			for (int i = 0; i < gameboard[currentState - 1].length; i++) {

				// In jeder Zeile prüfen, ob etwas drinsteht
				if (gameboard[currentState - 1][i].length >= 1) {
					switch (gameboard[currentState - 1][i][0]) {

					// Drache
					case 0: {
						System.out.println("Du kannst auf einen Drachen treffen: " + (i + 1));
						break;
					}

					// Schwert
					case 1: {
						System.out.println("Du kannst ein Schwert bekommen: " + (i + 1));
						break;
					}

					// Fluss
					case 2: {
						System.out.println("Du kannst in einen Fluss springen: " + (i + 1));
						break;
					}

					// Torbogen
					case 3: {
						System.out.println("Du kannst auf einen Torbogen treffen: " + (i + 1));
						break;
					}

					// Tür
					case 4: {
						System.out.println("Du kannst einer Tür begegnen: " + (i + 1));
						break;
					}

					// Schlüssel
					case 5: {
						System.out.println("Du kannst einen Schlüssel bekommen: " + (i + 1));
						break;
					}

					// Schatz
					case 6: {
						System.out.println("Der Schatz ist nah: " + (i + 1));
						break;
					}

					}

				}
			}

			System.out.println("\nWählen sie einen Zug: ");
			eingabe = s.nextInt();

			// Wenn in meinem Zustand etwas drinsteht
			if (gameboard[currentState - 1][eingabe - 1].length >= 1) {

				// Wenn man brennt, spring in einen Fluss
				if ((ichBrenne == true && gameboard[currentState - 1][eingabe - 1][0] == 2) || ichBrenne == false) {

					switch (gameboard[currentState - 1][eingabe - 1][0]) {

					// Drache
					case 0: {
						if (hatSchwert == true) {
							System.out.println("Du hast ein Schwert und besiegst den Drachen!");
						} else {
							System.out.println("Der Drache verbrennt dich! Spring in einen Fluss!");
							ichBrenne = true;
						}
						currentState = eingabe;
						break;
					}

					// Schwert
					case 1: {
						System.out.println("Du hast ein Schwert eingesammelt. Der Drache kann kommen!");
						hatSchwert = true;
						currentState = eingabe;
						break;
					}

					// Fluss
					case 2: {
						System.out.println("Du bist in einen Fluss gesprungen!");
						currentState = eingabe;
						if (ichBrenne == true) {
							ichBrenne = false;
							System.out.println("Du hast dich gelöscht!");
						}
						break;
					}

					// Torbogen
					case 3: {
						System.out.println("Du passierst den Torbogen!");
						currentState = eingabe;
						break;
					}

					// Tür
					case 4: {
						if (hatSchlüssel = true) {
							System.out.println("Du öffnest die Tür mit deinem Schlüssel!");
							currentState = eingabe;
						} else {
							System.out.println("Du brauchst einen Schlüssel!");
						}
						break;
					}

					// Schlüssel
					case 5: {
						System.out.println("Du findest einen Schlüssel!");
						hatSchlüssel = true;
						currentState = eingabe;
						break;
					}

					// Schatz
					case 6: {
						System.out.println("Du hast einen Schatz gefunden!");
						hatSchatz++;
						currentState = eingabe;
						break;
					}
					/*
					 * // falsche Eingabe default: { System.out.println("Ungültige Eingabe!"); }
					 * break;
					 */
					}
				} else {
					System.out.println("Ungültige Eingabe!");
				}
			}
		}
		System.out.println("Du hast gewonnen!");

	}

}
