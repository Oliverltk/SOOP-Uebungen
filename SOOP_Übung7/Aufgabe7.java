import java.util.Scanner;

public class Aufgabe7 {

	public static void main(String[] args) {
		//Daten einlesen
		Scanner s = new Scanner(System.in);
		System.out.print("Anfangsinvestition: ");
		long k0 = s.nextLong();
		System.out.print("jährlicher Zins: ");
		double z = s.nextDouble();
		int t = 30;
		s.close();

		endKapital(k0, z, t);

	}

	public static double endKapital(long k0, double z, int t) {
		//Überschrift
		String jahre = "Jahre";
		String endkapital = "Endkapital";
		System.out.printf("%s %19s", jahre, endkapital);
		System.out.println();
		//Berechnung
		double entwert = 0;
		for (int j = 1; j <= t; j++) {
			entwert = k0 * Math.pow((1 + (z / 100)), j);
			System.out.printf("%5s %19.2f", j, entwert);
			System.out.println();
		}
		return entwert;

	}

}
