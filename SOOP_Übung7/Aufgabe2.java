import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Wie viele Zahlen?
		System.out.print("Wie viele Zahlen wollen Sie einlesen? ");
		int zahlen = s.nextInt();

		// Welche Zahlen im Array?
		int[] arr = new int[zahlen];
		System.out.print("Geben Sie " + zahlen + " Zahlen ein: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		s.close();

		int minloc = 1;
		int maxloc = 1;
		double total = 0;
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
			if (min > arr[i]) {
				min = arr[i];
				minloc = i + 1;
			}
			if (max < arr[i]) {
				max = arr[i];
				maxloc = i + 1;
			}

		}
		System.out.println("Größte Zahl: " + max + " an Stelle " + maxloc);
		System.out.println("Kleinste Zahl: " + min + " an Stelle " + minloc);
		double durchschnitt = total / arr.length;
		System.out.println("Durchschnitt: " + durchschnitt);
	}

}
