import java.util.Scanner;

public class Aufgabe03 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Gib bitte ein");
		String empfehlung = s.next();
		System.out.println("Ausgabe: "+recommendation(empfehlung));
		s.close();
	}

	public static boolean isValidTransaction(double guthaben, double preis) {
		if (guthaben < preis) {
			return false;
		}
		return true;
	}

	public static String recommendation(String empfehlung) {
		switch (empfehlung) {
		case "Vegetarisch":
			return "Salatbar";

		case "Low Carb":
			return "Menü 2";

		case "Kleiner Hunger":
			return "Menü 1";

		case "Hunger":
			return "Grill";

		default:
			return "";

		}

	}

	public static double price(String menu) {
		switch (menu) {
		case "Salatbar":
			System.out.println("Vegetarisch");
			return 2.5;

		case "Menü 2":
			System.out.println("Low Carb");
			return 1.2;

		case "Menü 1":
			System.out.println("Kleiner Hunger");
			return 1.0;

		case "Grill":
			System.out.println("Hunger");
			return 3.8;

		default:
			return 0.0;
		}
	}
}
