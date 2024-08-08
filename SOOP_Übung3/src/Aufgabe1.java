import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Bitte geben Sie drei Zahlen ein: ");
		
		//Zahlen einlesen
		int x =s.nextInt();
		int y =s.nextInt();
		int z =s.nextInt();
		
		//Bedingungen aufstellen und Reihenfolgen ausgeben
		if (x < y && y < z) {
		System.out.println("Ihre Reihenfolge lautet: "+ x+" " + y+" " + z);	
		}
		
		else if (x < z && z < y) {
		System.out.println("Ihre Reihenfolge lautet: "+ x +" "+ z +" "+ y);
		}
		
		else if (y < x && x < z) {
		System.out.println("Ihre Reihenfolge lautet: "+ y + " " + x + " " + z);
		}
		
		else if ( y < z && z < x) {
		System.out.println("Ihre Reihenfolge lautet: "+ y + " " + z + " " + x);
		}
		
		else if (z < x && x < y) {
		System.out.println("Ihre Reihenfolge lautet: "+ z + " " + x + " " + y);
		}
		
		else if (z < y && y < x) {
		System.out.println("Ihre Reihenfolge lautet: "+ z + " " + y + " " + x);
		}
		

	}

}
