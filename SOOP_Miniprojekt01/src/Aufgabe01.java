import java.util.Scanner;

public class Aufgabe01 {

	public static void main(String[] args) {
		// Höhe des Dreiecks einlesen
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie die Höhe des Dreiecks an: ");
		int hoehedreieck = s.nextInt();
		s.close();

		// Gauss-Formel
		int maxWert = (hoehedreieck * (hoehedreieck + 1) / 2);

		int zaehler = 1;
		int platz = hoehedreieck-1;
		// jede Zeile 1 mal durchlaufen
		for (int i = 0; i < hoehedreieck; i++) {
			for(int j = 0;j<platz;j++) {
				if(maxWert<100) {
					System.out.print("  ");
				}
				else {
					System.out.print("   ");
				}
			}
			platz--;
			for (int k = 1; k <= (i + 1); k++) {
				if (maxWert >= 100) {
					if (zaehler < 10) {
						System.out.print("+++" + zaehler + "**");
					} else if (zaehler < 100) {
						System.out.print("++" + zaehler + "**");
					} else if (zaehler < 1000) {
						System.out.print("++" + zaehler + "*");
					}
				} else {
					if (zaehler < 10) {
						System.out.print("++" + zaehler + "*");
					} else {
						System.out.print("+" + zaehler + "*");
					}
				}
				zaehler++;
			}

			System.out.println();

		}

	}
}
