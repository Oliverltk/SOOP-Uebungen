public class Aufgabe5 {

	public static void main(String[] args) {
		int n = 20467;
		System.out.println(quersumme(n));
	}

	public static int quersumme(int n) {

		int summe = 0;
		summe += (n % 10);

		if (n != 0) {
			n = n / 10;
			summe += quersumme(n);
		}

		return summe;

	}

}
