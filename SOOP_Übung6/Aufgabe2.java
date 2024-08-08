import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie a, b, c ein: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double[] rueckgegebeneNullstellen = nullstellen(a, b, c);
		s.close();
		if (rueckgegebeneNullstellen.length == 0) {
			System.out.println("Funktion hat keine Nullstellen.");
		} else {
			for (int i = 0; i < rueckgegebeneNullstellen.length; i++) {
				System.out.println(rueckgegebeneNullstellen[i]);
			}
		}

	}

	public static double[] nullstellen(double a, double b, double c) {
		double diskriminante = (b * b) - (4 * a) * c;
		double formel1 = ((-b) + Math.sqrt(diskriminante)) / (2 * a);
		double formel2 = ((-b) - Math.sqrt(diskriminante)) / (2 * a);
		if (diskriminante == 0) {
			double[] output = new double[1];
			output[0] = formel1;
			return output;
		}

		else if (diskriminante > 0) {
			double[] output = new double[2];
			output[0] = formel1;
			output[1] = formel2;
			return output;
		}

		else {
			double[] output = new double[0];
			return output;
		}
	}
}