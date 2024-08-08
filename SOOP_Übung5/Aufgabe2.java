import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Zahl: ");
		int a = s.nextInt();
		System.out.print("Zahl: ");
		int b = s.nextInt();
		System.out.print("Boolean: ");
		boolean max = s.nextBoolean();
		s.close();

		System.out.print("Ergebnis: " + minmax(a, b, max));
	}

	public static int minmax(int a, int b, boolean max) {
		int ergebnis = 0;
		if (max) {
			if (a < b) {

				ergebnis = b;
			} else if (b < a) {

				ergebnis = a;
			} else {
				ergebnis = a;
			}
			
		} else {
			if (a < b) {

				ergebnis = a;
			} else if (b < a) {

				ergebnis = b;
			} else {
				ergebnis = a;
			}
		}

		return (ergebnis);
	}
}
