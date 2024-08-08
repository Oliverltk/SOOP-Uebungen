import java.util.Scanner;
import java.lang.Math;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Eingabe der Zahlen
		System.out.println("Geben Sie a, b, c ein:");
		Double a = s.nextDouble();
		Double b = s.nextDouble();
		Double c = s.nextDouble();

		// Eingabe der Formel
		Double d 	= ((b * b) - 4 * a * c);
		Double n1 	= ((-b) + (Math.sqrt(d))) / (2 * a);
		Double n2 	= ((-b) - (Math.sqrt(d))) / (2 * a);

		// Falls Divisionsfaktor 0 ist
		if (a == 0 || c == 0) {
			System.out.println("Ungültige Eingabe.");
		

		// Bedingte Ausgabe und Berechnung
		if (d < 0) {
			System.out.println("Die Gleichung hat keine reellen Nullstellen.");
		}

		else if (d == 0) {
			System.out.println("Die Nullstelle ist " + n1);
		}

		else if (d > 0) {
			System.out.println("Die Nullstellen sind: " + n1 + " und " + n2);
		}

	}

	}
}