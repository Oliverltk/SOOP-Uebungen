import java.util.Scanner;

public class Aufgabe_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Werte einlesen
		System.out.print("Länge: ");
		int laenge = s.nextInt();

		System.out.print("Breite: ");
		int breite = s.nextInt();
		s.close();
		// Startwerte setzen
		int x = 0;
		int y = 0;

		// Schleifenabfrage

		while (y < breite) {

			while (x < laenge) {
				System.out.print("*");
				x++;
			}
			y++;
			System.out.println();
			x = 0;

		}
	}

}
