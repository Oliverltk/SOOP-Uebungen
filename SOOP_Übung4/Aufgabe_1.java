import java.util.Scanner;

public class Aufgabe_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Zahl: ");
		int grenze = s.nextInt();
		s.close();

		int zaehler = 1;

		int summe = 0;

		while (zaehler <= grenze) {
			summe = summe + zaehler;
			zaehler = zaehler + 1;

		}

		System.out.print("Summe 1 .. " + grenze + " = " + summe);
	}

}
