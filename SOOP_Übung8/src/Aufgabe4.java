public class Aufgabe4 {
	static int x = 0;

	public static void main(String[] args) {
		int n = 40;
		long milli = System.currentTimeMillis();
		fibonacci(n);
		long end = System.currentTimeMillis();
		System.out.println("Anzahl der Aufrufe: " + x);
		System.out.print("Zeit: " + (end - milli));

	}

	public static int fibonacci(int n) {
		x += 1;
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
