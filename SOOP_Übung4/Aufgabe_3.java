import java.util.Scanner;

public class Aufgabe_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Untere Grenze: ");
		int grenze1 = s.nextInt();
		System.out.print("Obere Grenze: ");
		int grenze2 = s.nextInt();
		s.close();
		System.out.print("Die Reihe lautet:");
		for (int i = grenze1; i <= grenze2; i++) {
			System.out.print(" " + i);

		}

	}

}
