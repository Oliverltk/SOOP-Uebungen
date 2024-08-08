public class Aufgabe7 {

	public static void main(String[] args) {
		long x = 77588;
		System.out.println(istPrim(x));

	}

	public static boolean istPrim(long x) {
		boolean primzahl = true;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				primzahl = false;
			}
		}
		return primzahl;
	}
}
