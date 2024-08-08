import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Zahl für x1: ");
		double x1 = s.nextDouble();
		System.out.print("Zahl für y1: ");
		double y1 = s.nextDouble();
		System.out.print("Zahl für x2: ");
		double x2 = s.nextDouble();
		System.out.print("Zahl für y2: ");
		double y2 = s.nextDouble();
		s.close();
		System.out.print("Abstand: " + abstand(x1, y1, x2, y2));
	}

	public static double abstand(double x1, double y1, double x2, double y2) {
		double abstand = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		return (abstand);
	}

}
