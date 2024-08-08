public class Aufgabe8 {

	public static void main(String[] args) {
		int n = 3;
		schachbrett(n);

	}

	public static void schachbrett(int n) {
		double[][] schachbrett = new double[n][n];
		
		int counter = 0;
		// for-Schleife für Zeile
		for (int i = 0; i < schachbrett.length; i++) {

			// for-Schleife für Spalte
			for (int j = 0; j < schachbrett.length; j++) {
				schachbrett[i][j] = Math.pow(2, counter);
				System.out.printf("%20.0f", schachbrett[i][j]);
				counter++;
			}
			System.out.print("\n");
		}

	}

}
