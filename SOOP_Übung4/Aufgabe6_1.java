import java.util.Scanner;

public class Aufgabe6_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int laenge = 0;
		
		int breite = 0;
		
		
		System.out.print("Länge: ");
		laenge = s.nextInt();
		System.out.print("Breite: ");
		breite = s.nextInt();
		
		
		
		String bstern = "";
		String obenunten= "";	
			
		for(int j = 2; j<=laenge; j++) {
			obenunten +="*";
			if(j==laenge) {
				bstern += "*";
			}
			else {
				bstern += " ";
			}
		}
		
		for(int i = 1; i<=breite; i++) {
			if(i == 1 || i == breite) {
				System.out.println("*"+obenunten);
			}
			else {
			System.out.println("*"+bstern);
			}
		}


	}

}
