import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		//Zahl einlesen
		Scanner s = new Scanner(System.in);
		System.out.print("Zahl: ");
		int n = s.nextInt();
		s.close();
		System.out.println(istPalindrom(n));
	}

	public static boolean istPalindrom(int n) {
		//Eine neue Zahl und original zum Vergleich
		int zahl = 0;
		int original = n;
		//Schreibe n rückwärts
		while (n != 0) {
			zahl = zahl * 10 + (n % 10);
			n = n / 10;
		}
		//Prüfe, ob gleich
		if (original == zahl) {
			return true;
		} else {
			return false;
		}

	}

}
