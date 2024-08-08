import java.util.Scanner;

public class Aufgabe_6 {

	public static void main(String[] args) {

		// Werte einlesen
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
				
				if (x>1 && y>1 && y<breite && x<laenge) {
					System.out.print(" ");
				}
			}
			
			y++;
			System.out.println();
			
			
			
			x = 0;
		/*
		
		*/
		
		
		}

	}
}
