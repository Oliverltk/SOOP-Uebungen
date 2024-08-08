import java.util.Scanner;

public class Aufgabe8 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Epsilon eingeben: ");
		double n= s.nextDouble();
		double pi = 0;
		double p2 = 0;
		double i = 0;
		
		do {
			pi = p2;
			p2 = p2 + ((Math.pow((-1.0), i))/(2*i+1));
			i++;
		}
		while (Math.abs((p2 -pi)) > n);
		System.out.println("Pi = "+p2);
		s.close();
	}

}
