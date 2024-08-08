import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie a, b, c ein: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		s.close();

		double diskriminante = (b * b) - 4 * a * c;
		double formel1 = -b + Math.sqrt(diskriminante) / (2 * a);
		double formel2 = -b - Math.sqrt(diskriminante) / (2 * a);
		if (diskriminante == 0) {
			System.out.print("Die Nullstelle liegt bei " + formel1);
		} else if (diskriminante > 0) {
			System.out.print("Die Nullstellen liegen bei " + formel1 + " und " + formel2);
		} else {
			System.out.print("Die Gleichung hat keine reelen Nullstellen.");
		}

	}

}
