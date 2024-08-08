import java.util.Scanner;

public class Aufgabe_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Zahl n: ");
		double n = s.nextDouble();
		double x = 0;
		for(double i = 1; i < n+1; i++) {
			x=1.0/(2*i)+x;
		}
		System.out.println("Summe: "+x);
		
	}

}
