import java.util.Scanner;

public class ASCII_Art_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Bitte geben Sie einen Wunsch an(1..3):");
		int Wert = s.nextInt();
		s.close();
		
		if (Wert == 1) {
		System.out.println("Sie haben sich für eine Tür entschieden:");
		System.out.println("	 __________			");
		System.out.println("	|  ______  |		");
		System.out.println("	| |      | |		");
		System.out.println("	| |______| |		");
		System.out.println("	|          |		");
		System.out.println("	|0         |		");
		System.out.println("	|          |		");
		System.out.println("	|          |		");
		System.out.println("	|          |		");
		System.out.println("	|__________|		");
		}
		
		else
		if (Wert == 2) {
		System.out.println("Sie haben sich für einen Schlüssel entschieden:");
		System.out.println("	   |__				");
		System.out.println("	   |__				");
		System.out.println("	   |				");
		System.out.println("	   |				");
		System.out.println("	   |				");
		System.out.println("	   |				");
		System.out.println("	 __|_				");
		System.out.println("	|    |				");
		System.out.println("	|____|				");
		}
		
		else
		if (Wert == 3) {
		System.out.println("Sie haben sich für eine Truhe entschieden");
		System.out.println("	 ______________ 	");
		System.out.println("	|              |    ");
		System.out.println("	|_______0______|	");
		System.out.println("	|              |	");
		System.out.println("	|______________|	");
		}
			
		else {
			System.out.println("Ungültige Eingabe!");
		}
		
		

	}

}
