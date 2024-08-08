import java.util.Scanner;

public class Teilbar3_2 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		//Eingabe von Zahl
		System.out.println("Bitte geben sie eine Zahl ein:");
		int Zahl1 = s.nextInt();
		
		//Ausgabe
		if(Zahl1%3 == 0) {
			System.out.println( Zahl1 + " ist durch 3 teilbar");
			
		}
		else {
			System.out.println( Zahl1 + " ist nicht durch 3 teilbar");
		}
		
	}

}
