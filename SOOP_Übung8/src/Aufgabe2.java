public class Aufgabe2 {

	public static void main(String[] args) {
		int i = 2;
		System.out.println(m(i,0,0));
	}

	public static double m(int i,int teiler,double summe) {
		summe += 1.0 / (teiler + 1);	
		if (i == teiler) {
			return summe;
		} else {
			return m(i,teiler+1,summe);
		}
	}
}
