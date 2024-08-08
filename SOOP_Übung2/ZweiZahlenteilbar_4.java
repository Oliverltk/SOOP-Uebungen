import java.util.Scanner;

public class ZweiZahlenteilbar_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Eingabe von Zahl
		System.out.println("erste Zahl:");
		int Zahl1 = s.nextInt();

		System.out.println("zweite Zahl:");
		int Zahl2 = s.nextInt();

		// Ausgabe von Zahl
		if (Zahl1 % Zahl2 == 0) {
			System.out.println(Zahl1 + " ist durch " + Zahl2 + " teilbar");
		}

		else {
			System.out.println(Zahl1 + " ist nicht durch " + Zahl2 + " teilbar");
		}
	}

}

//nextInt holt sich das nächste Token (behandelt jedes Token als Integerwert)
