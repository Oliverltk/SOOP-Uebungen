import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double zahl = 0;

		// Einlesen
		System.out.print("Zahl: ");

		// Deklarieren
		zahl = s.nextDouble();

		// double auf ganze Zahl rechnen
		zahl = zahl * 1000;

		// Double in int umwandeln (typecasting)
		int a = (int) zahl;
		//
		if (a % 10 == 1) {
			a = a - 1;
		}

		else if (a % 10 == 2) {
			a = a - 2;
		}

		else if (zahl % 10 == 3) {
			a = a - 3;
		}

		else if (a % 10 == 4) {
			a = a - 4;
		}

		else if (a % 10 == 5) {
			a = a + 5;
		}

		else if (a % 10 == 6) {
			a = a + 4;
		}

		else if (a % 10 == 7) {
			a = a + 3;
		}

		else if (a % 10 == 8) {
			a = a + 2;
		}

		else if (a % 10 == 9) {
			a = a + 1;
		}

		else {

		}
		s.close();

		double b = (double) a;
		b = b / 1000;
		System.out.println("gerundet: " + b);

	}

}