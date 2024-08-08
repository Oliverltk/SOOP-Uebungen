
public class Aufgabe5 {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8 };
		System.out.print("Doppelt: { ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(doppelt(a)[i] + " ");
		}
		System.out.print("}");

	}

	public static int[] doppelt(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i] * 2;
		}
		return b;
	}
}
