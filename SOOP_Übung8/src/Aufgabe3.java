public class Aufgabe3 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(m(i,0.0,1));
	}

	public static double m(int i,double summe,double teiler) {
		double ergebnis = teiler / (teiler + 1);
		summe += ergebnis;
		if (i == teiler) {
			return summe;
		} else {
			return m(i,summe,teiler+1);
		}
	}
}
