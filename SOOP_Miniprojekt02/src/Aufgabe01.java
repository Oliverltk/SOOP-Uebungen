public class Aufgabe01 {

	public static void main(String[] args) {
		double[][] n = { { 1.0, 2.0, 3.0, 4.0 }, { 5.0, 6.0, 7.0, 8.0 }, { 9.0, 10.0, 11.0,12.0 }, {13.0, 14.0, 15.0,16.0} };
		System.out.println(summeDiagonale(n));

	}

	public static double summeDiagonale(double[][] n) {
		double summe1 = 0; //Diagonale von links oben nach rechts unten
		double summe2 = 0; //Diagonale von rechts oben nach links unten
		
		int j = n.length-1;
		
		// Diagonale
		for (int i = 0; i < n.length; i++) {
			summe1 += n[i][i];
			summe2 += n[i][j];
			j--;
		}

		return summe1 + summe2;
	}
}
