import java.util.Scanner;

public class Aufgabe_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Untere Grenze: ");
		int grenze1 = s.nextInt();
		int grenze2 = 0;
		do {
			System.out.print("Obere Grenze: ");
			grenze2 = s.nextInt();
		} while(grenze2<=grenze1);
		s.close();
		int zaehler = grenze1;
		
		System.out.print("Die Reihe lautet:");
		while (zaehler <= grenze2) {
			if (zaehler % 3 == 0 && zaehler % 4 != 0|| zaehler % 4 == 0 && zaehler % 3 != 0) {
				System.out.print(" "+zaehler);
				
			}
			zaehler++;
		}
		
	}

}