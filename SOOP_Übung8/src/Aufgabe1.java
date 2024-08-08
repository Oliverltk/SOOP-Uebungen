import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("n: ");
		int n = s.nextInt();
		System.out.println("o: ");
		int o = s.nextInt();
		System.out.println(f(n));
		System.out.println(g(o));
		s.close();
	}
	//Vollständige Induktion beweist, dass die Methode f(n) die Quadratzahl von n berechnet
	public static int f(int n) {
		if (n == 1) {
			return 1;
		} else {
			return f(n - 1) + 2 * n - 1;
		}
		
	}
	//nicht-rekursive Implementierung
	public static int g(int o) {
		int quadrat = o*o;
		return quadrat;
	}
	
}
