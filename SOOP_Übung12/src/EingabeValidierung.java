import java.io.*;

public class EingabeValidierung {

	// Eingabekanal von der Tastatur
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static double readDouble() throws Inputexception {
		String s;
		double d = 0.0;
		boolean korrekt = true;

		// String-Eingabe und Typumwandlung - zu vervollständigen:
		do {
			try {
				System.out.print("Bitte double-Zahl eingeben: ");
				s = in.readLine(); // Tastatureingabe entgegennehmen
				d = Double.parseDouble(s);
				korrekt = true;
			} // Eingabestring in double wandeln
			catch (Exception e1) {
				korrekt = false;
				throw new Inputexception("input exception");
				
			}
			
		} while (!korrekt);
		return d;
	}

	public static void main(String[] args) {
		try {
		double eingabe = readDouble();
		System.out.println("Eingabe: " + eingabe);
		}
		catch(Inputexception e2) {
			System.out.println("Inout Exception catched in main");
		}
	}
}
