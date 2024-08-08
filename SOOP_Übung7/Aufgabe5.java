import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Anzahl der Studenten angeben
		System.out.print("Anzahl der Studenten: ");
		int anzahl = s.nextInt();

		// Punkte der Studenten angeben
		int punkte[] = new int[anzahl];
		System.out.print("Punktzahlen: ");
		for (int i = 0; i < anzahl; i++) {
			punkte[i] = s.nextInt();
		}
		s.close();
		//Ergebnisse ausgeben
		System.out.println("Bewertung: ");
		for (int j = 0; j < anzahl; j++) {
			System.out.println("Student " + (j + 1) + ": " + punkte[j] + " Punkte Note " + notenverteilung(punkte[j]));

		}
		//Durchschnittsnote berechnen
		double gesamt = 0;
		for (int k = 0; k < punkte.length; k++) {
			gesamt += notenverteilung(punkte[k]);
		}
		double durchschnitt = gesamt / anzahl;
		System.out.println("Durchschnittsnote: " + durchschnitt);
	}

	public static int notenverteilung(int punkte) {
		// Notenverteilung

		int note = 0;
		if (90 <= punkte) {
			note = 1;
		} else if (75 <= punkte) {
			note = 2;
		} else if (60 <= punkte) {
			note = 3;
		} else if (50 <= punkte) {
			note = 4;
		} else {
			note = 5;
		}

		return note;

	}

}
