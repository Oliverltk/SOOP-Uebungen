import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Zahl: ");
		int x = s.nextInt();
		int ergebnis = gauss(x);
		s.close();
		System.out.print("Ergebnis: " + ergebnis);

	}

	public static int gauss(int x) {
		return (x * (x + 1) / 2);
	}

}
