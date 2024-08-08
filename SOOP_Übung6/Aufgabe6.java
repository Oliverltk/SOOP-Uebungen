import java.util.Arrays;

public class Aufgabe6 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 4 };
		System.out.print("Quadratzahlen: { ");
		int[] d = quadrate(a);
		for (int i = 0; i < d.length; i++) {
			System.out.print(quadrate(a)[i] + " ");

		}
		System.out.print("}");

	}

	public static int[] quadrate(int a[]) {
		int[] b = {};
		for (int i = 0; i < a.length; i++) {
			if (Math.sqrt(a[i]) % 1 == 0) {
				b = Arrays.copyOf(b, b.length + 1);
				b[b.length - 1] = a[i];

			}

		}
		return b;
	}

}
