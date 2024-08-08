import java.util.Scanner;

public class ZahlinInterval_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Eingabe von Intervall
		System.out.println("1. Intervallgrenze: ");
		int Grenze1 = s.nextInt();

		System.out.println("2. Intervallgrenze: ");
		int Grenze2 = s.nextInt();

		// Eingabe von Zahl
		System.out.println("Zahl: ");
		int Zahl1 = s.nextInt();

		// Ausgabe
		if (Grenze1 < Zahl1 && Zahl1 < Grenze2) {
			System.out.println(Zahl1 + " liegt im Intervall" + "[" + Grenze1 + "," + Grenze2 + "]");
		}

		// Ausgabe im gedrehten Verhältnis
		else if (Grenze1 > Zahl1 && Zahl1 > Grenze2) {
			System.out.println(Zahl1 + " liegt im Intervall " + "[" + Grenze2 + "," + Grenze1 + "]");
		} 
		else {
			System.out.println(Zahl1 + " liegt nicht im Intervall");
		}
	}

}

//Intervall beinhaltet alle ganzen Zahlen (einschließlich die Zahlen der Intervallgrenzen)