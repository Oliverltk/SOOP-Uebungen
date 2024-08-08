public class Aufgabe6 {

	public static void main(String[] args) {
		String wort = "a";
		char[] eingabew = wort.toCharArray();
		System.out.print(automat(eingabew));
		
	}

	public static boolean automat(char[] eingabew) {
		String alphabet = "abce";
		char[] eingabea = alphabet.toCharArray();
		//Einzelner Buchstabe kein Paar
		if(eingabew.length<=1) {
			return false;
		}
		// erster Buchstabe ist gleich dem folgenden Buchstaben, aber kein a oder e,
		// Anzahl an Buchstaben soll gerade sein
		if (eingabew[0] == eingabew[1] && eingabew[0] != eingabea[0] && eingabew[0] != eingabea[3]
				&& eingabew.length % 2 == 0) {

			for (int i = 2; i < eingabew.length; i += 2) {

				// Eingabe darf nur b oder c sein
				if (eingabew[i] == eingabea[1] || eingabew[i] == eingabea[2]) {
					// Zwei aufeinanderfolgende Buchstaben sind gleich
					if (eingabew[i] == eingabew[i + 1]) {

					} else {
						return false;
					}
				} else {
					return false;
				}
			}
			return true;
		} else if (eingabew[0] != eingabew[1]) {
			for (int i = 0; i < eingabew.length-1; i++) {
				if (istvokal(eingabew[i])==istvokal(eingabew[i+1])) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static boolean istvokal(char buchstabe) {
		char[] vokale = { 'a', 'e' };
		for (int i = 0; i < vokale.length; i++) {
			if (buchstabe == vokale[i]) {
				return true;
			}
		}
		return false;

	}

}
