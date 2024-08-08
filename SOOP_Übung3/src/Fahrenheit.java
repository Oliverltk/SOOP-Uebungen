import java.util.Scanner;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Fahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Zahl einlesen
		Scanner s = new Scanner (System.in);
		System.out.print("Grad in Celsius: ");
		int x = s.nextInt();
		
		//Rechnung
		double y = (x * 9/5) + 32;
		
		//Ausgabe
		System.out.println("Grad in Fahrenheit: "+y);
		
	}

}
