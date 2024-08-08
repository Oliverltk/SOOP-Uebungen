import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Zahl: ");
		int x = s.nextInt();
		int zahl = zahlRueckwaerts(x);
		s.close();
		System.out.print("Ergebnis: " + zahl);

	}

	public static int zahlRueckwaerts(int x) {
		int zahl = 0;
		while (x != 0) {

			zahl = zahl * 10 + (x % 10);
			x = x / 10;
		}
		return (zahl);
	}

}
