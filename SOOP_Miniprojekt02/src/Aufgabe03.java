import java.util.Scanner;

public class Aufgabe03 {
	// Muster erstellen
	public static String[][] erzeugeSpielfeld(String[][] f) {
		for (int i = 0; i < f.length; i++) {

			for (int j = 0; j < f[0].length; j++) {
				if (i == 6) {
					f[i][j] = "-";
				} else if (j % 2 == 0) {
					f[i][j] = "|";
				} else {
					f[i][j] = " ";
				}

			}
		}

		return f;
	}

	// Muster ausgeben
	public static void druckeSpielfeld(String[][] f) {
		String ausgabe = "";
		for (int i = 0; i < f.length; i++) {

			for (int j = 0; j < f[0].length; j++) {
				ausgabe += f[i][j];
			}
			ausgabe += "\n";
		}
		System.out.print(ausgabe);
	}

	// Rote Scheibe in die unterste leere Reihe legen
	public static void legeRot(String[][] f) {
		Scanner s = new Scanner(System.in);
		System.out.print("Spieler Rot: Welche Spalte? [0-6]: ");

		int spalte = s.nextInt();

		spalte = (spalte * 2) + 1;

		for (int i = 5; i >= 0; i--) {
			if (f[i][spalte].equals(" ")) {
				f[i][spalte] = "R";
				break;
			}

		}

	}

	// Selbe wie zuvor nur mit "B"
	public static void legeBlau(String[][] f) {
		Scanner s = new Scanner(System.in);
		System.out.print("Spieler Blau: Welche Spalte? [0-6]: ");

		int spalte = s.nextInt();

		spalte = (spalte * 2) + 1;

		for (int i = 5; i >= 0; i--) {
			if (f[i][spalte].equals(" ")) {
				f[i][spalte] = "B";
				break;
			}

		}

	}

	public static String pruefeSieger(String[][] f) {
		//System.out.println("Länge i: " + f.length + " | Länge j: " + f[0].length);
		
		// check horizontal
		for (int i = 0; i < f.length - 1; i++) {

			for (int j = 0; j < f.length; j += 2) {
				if (f[i][j + 1] != " " && f[i][j + 3] != " " && f[i][j + 5] != " " && f[i][j + 7] != " "
						&& (f[i][j + 1] == f[i][j + 3] && f[i][j + 3] == f[i][j + 5] && f[i][j + 5] == f[i][j + 7])) {
					//System.out.println("1: i(" + i + ") j+1: (" + (j+1) + ") f[i][j+1]: " + f[i][j+1]);
					return f[i][j + 1];
				}
			}

		}
		// check vertikal
		for (int i = 1; i < 15; i += 2) {

			for (int j = 0; j < 3; j++) {

				if ((f[j][i] != " ") && (f[j + 1][i] != " ") && (f[j + 2][i] != " ") && (f[j + 3][i] != " ")
						&& ((f[j][i] == f[j + 1][i]) && (f[j + 1][i] == f[j + 2][i]) && (f[j + 2][i] == f[j + 3][i]))) {
					//System.out.println("2");
					return f[j][i];
				}
			}
		}
		// check diagonal links unten -> rechts oben
		for (int i = 0; i < 3; i++) {

			for (int j = 7; j < 15; j += 2) {
				if ((f[i][j] != " ") && (f[i + 1][j - 2] != " ") && (f[i + 2][j - 4] != " ") && (f[i + 3][j - 6] != " ")
						&& (f[i][j] == f[i + 1][j - 2]) && (f[i + 1][j - 2] == f[i + 2][j - 4])
						&& (f[i + 2][j - 4] == f[i + 3][j - 6])) {
					//System.out.println("3");
					return f[i][j];
				}
			}
		}
		// check diagonal links oben -> rechts unten
		for (int i = 0; i < 3; i++) {

			for (int j = 1; j < 9; j += 2) {
				if ((f[i][j] != " ") && (f[i + 1][j + 2] != " ") && (f[i + 2][j + 4] != " ") && (f[i + 3][j + 6] != " ")
						&& ((f[i][j] == f[i + 1][j + 2]) && (f[i + 1][j + 2] == f[i + 2][j + 4])
								&& (f[i + 2][j + 4] == f[i + 3][j + 6]))) {
					//System.out.println("4");
					return f[i][j];
				}
			}

		}

		return null;
	}

	// Methoden einsetzen
	public static void main(String[] args) {
		String[][] f = new String[7][15];

		String[][] spielfeld = erzeugeSpielfeld(f);
		druckeSpielfeld(spielfeld);
		while (pruefeSieger(f) == null) {
			legeRot(spielfeld);
			System.out.println();
			druckeSpielfeld(spielfeld);
			if (pruefeSieger(f) != null) {
				break;
			}
			legeBlau(spielfeld);
			System.out.println();
			druckeSpielfeld(spielfeld);

		}
		if (pruefeSieger(f) != null) {
			if (pruefeSieger(f) == "R") {
				System.out.println("Spieler Rot hat gewonnen!");
			} else if (pruefeSieger(f) == "B") {
				System.out.println("Spieler Blau hat gewonnen!");
			} else {
				System.out.println("Unentschieden!");
			}

		}

	}
}
