import java.util.Scanner;

public class RechteckAufgabe_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Eingabe von Zahl
		System.out.println("Bitte Zahl für Länge eingeben");
		int laenge = s.nextInt();
		System.out.println("Bitte Zahl für Breite eingeben");
		int breite = s.nextInt();

		// Berechnung
		int flaeche = (laenge * breite);
		System.out.println("Die Fläche beträgt :" + flaeche);
		int umfang = (2 * laenge + 2 * breite);

		// Ausgabe Breite
		System.out.println("Der Umfang beträgt :" + umfang);

	}
}
