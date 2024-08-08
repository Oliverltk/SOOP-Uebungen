public class Aufgabe4 {

	public static void main(String[] args) {
		int[] a = { 2, -1, 7, 3, 3, 3, 1, 3, 3, 3, 9, 0 };
		viererfolge(a);

	}

	public static boolean viererfolge(int[] a) {
		boolean meinBoolean = false;
		int zaehler = 0;
		int vergleichszahl = 0;
		for (int i = 0; i < a.length; i++) {
			if (vergleichszahl == a[i]) {
				zaehler++;
			}
			else {
				zaehler = 0;
			}
			vergleichszahl = a[i];
		}

		if (zaehler >= 4) {
			meinBoolean = true;
		}
		System.out.println(meinBoolean);
		return meinBoolean;

	}
}
