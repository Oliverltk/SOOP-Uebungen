import java.util.Scanner;

public class Fahrenheit_in_Kelvin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Zahl in Kelvin: ");
		double x = s.nextDouble();

		double y = (x - 273.15) * 9/5 + 32;
		System.out.print("Zahl in Fahrenheit: " + y);
	}

}
