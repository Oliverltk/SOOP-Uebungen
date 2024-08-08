import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		//Zahlen einlesen
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Eingabe: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		//int[] a = { 3, 19, 44, 19, 3, 5, 9, 19, 64, 73 };
		s.close();

		System.out.println(Arrays.toString(filtereMehrfache(a)));

	}

	public static int[] filtereMehrfache(int[] a) {
		//Leeres Array filtered
		int[] filtered = new int[0];
		boolean doppelt = false;
		for (int j = 0; j < a.length; j++) {
			doppelt = false;
			for (int k = 0; k < filtered.length; k++) {
				//Prüfe, ob Zahl doppelt ist, wenn ja, setze doppelt = true
				if (a[j] == filtered[k]) {
					doppelt = true;
				}
			}
			//Wenn Zahl nicht doppelt, schreibe in filtered
			if (doppelt==false) {
				filtered = Arrays.copyOf(filtered, filtered.length + 1);
				filtered[filtered.length - 1] = a[j];
			}
		}
		return filtered;
	}
}
