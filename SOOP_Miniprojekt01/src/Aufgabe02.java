import java.util.Scanner;

public class Aufgabe02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Zahl: ");
		int n = s.nextInt();
		s.close();
		summe(n);
		int ergebnis = summe(n);
		System.out.print("Summe: "+ergebnis);

	}

	public static int summe(int n) {
		int quersumme = 0;
		int letzte = n % 10;
		int letzteraus = (n - letzte)/10;
		
		while (letzteraus > 10) {
			quersumme = quersumme + (letzteraus % 10);
			letzteraus = letzteraus / 10;
		}
		return (quersumme);
	}

}
