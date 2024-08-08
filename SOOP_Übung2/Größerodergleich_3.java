import java.util.Scanner;

public class Größerodergleich_3 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		//Eingabe von Zahl
		System.out.println("Bitte geben sie eine Zahl ein:");
		int Zahl1 = s.nextInt();
		
		System.out.println("Bitte geben sie eine Zahl ein:");
		int Zahl2 = s.nextInt();
		s.close();
		
		//Ausgabe von Zahl
		if (Zahl1>Zahl2) {
			System.out.println(Zahl1 + " ist größer als " + Zahl2);
		}
		
		if (Zahl1<Zahl2) {
			System.out.println(Zahl2 + " ist größer als " + Zahl1);
		}
		if (Zahl1 == Zahl2) {
			System.out.println("Die Zahlen sind gleich groß.");
		}
		
		}
	}


