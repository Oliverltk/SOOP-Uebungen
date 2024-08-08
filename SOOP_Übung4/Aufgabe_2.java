import java.util.Scanner;

public class Aufgabe_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ergebnis = 0;
		System.out.print("Zahl: ");
		int zahl = s.nextInt();
		while(ergebnis<100) {
		System.out.print("Zahl: ");
		zahl = s.nextInt();
		ergebnis += zahl; 
		}
		s.close();
		

			
		
		

		System.out.println("Summe: " + ergebnis);
	}

}
