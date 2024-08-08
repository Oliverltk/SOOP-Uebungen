import java.util.Scanner;

public class Ausgeschrieben_6 {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Eingabe von Zahl
		System.out.println("Zahl [0..9999]: ");
		int Eingabezahl = s.nextInt();
		
		//Zeichenkette mit String
		String tausender = "";
		String hunderter = "";
		String zehner	 = "";
		String einer	 = "";
		
		//Eingabe der Tausender
		switch (Eingabezahl/1000) {
		case 1: tausender = "eintausend";
		break;
		case 2: tausender = "zweitausend";
		break;
		case 3: tausender = "dreitausend";
		break;
		case 4: tausender = "viertausend";
		break;
		case 5: tausender = "fünftausend";
		break;
		case 6: tausender = "sechstausend";
		break;
		case 7: tausender = "siebentausend";
		break;
		case 8: tausender = "achttausend";
		break;
		case 9: tausender = "neuntausend";
		break;
		}
		
		//Eingabe der Hunderter
		switch (Eingabezahl/1000) {
		case 1: hunderter = "einhundert";
		break;
		case 2: hunderter = "zweihundert";
		break;
		case 3: hunderter = "dreihundert";
		break;
		case 4: hunderter = "vierhundert";
		break;
		case 5: hunderter = "fünfhundert";
		break;
		case 6: hunderter = "sechshundert";
		break;
		case 7: hunderter = "siebenhundert";
		break;
		case 8: hunderter = "achthundert";
		break;
		case 9: hunderter = "neunhundert";
		break;
		}
		
		//Eingabe der Zehner
		switch (Eingabezahl%100) {
		case 1: zehner = "zehn";
		break;
		case 2: zehner = "zwanzig";
		break;
		case 3: zehner = "dreißig";
		break;
		case 4: zehner = "vierzig";
		break;
		case 5: zehner = "fünfzig";
		break;
		case 6: zehner = "sechszig";
		break;
		case 7: zehner = "siebzig";
		break;
		case 8: zehner = "achtzig";
		break;
		case 9: zehner = "neunzig";
		break;
		}
		
		//Eingabe der Einer in Zehner;
		switch (Eingabezahl%100) {
		case 1: zehner = "elf";
		break;
		case 2: zehner = "zwölf";
		break;
		case 3: zehner = "dreizehn";
		break;
		case 4: zehner = "vierzehn";
		break;
		case 5: zehner = "fünfzehn";
		break;
		case 6: zehner = "sechzehn";
		break;
		case 7: zehner = "siebzehn";
		break;
		case 8: zehner = "achtzehn";
		break;
		case 9: zehner = "neunzehn";
		break;
		}
		
		//Eingabe der Einer
		switch (Eingabezahl%100) {
		case 1: einer = "eins";
		break;
		case 2: einer = "zwei";
		break;
		case 3: einer = "drei";
		break;
		case 4: einer = "vier";
		break;
		case 5: einer = "fünf";
		break;
		case 6: einer = "sechs";
		break;
		case 7: einer = "sieb";
		break;
		case 8: einer = "acht";
		break;
		case 9: einer = "neun";
		break;
		}
		
		//Zusammenfügen der Zahlen und Ausgabe
		
		
		
		/*if (zehnertostring(zahl) != "null")
		Ergebnis: zehnertostring tausender + hundertertostring*/

		
		
		
		
		
		
		
		
		
		
		
		
		{
			System.out.println(); 
		
		/*int eingabe einer, zehner, hunderter, tausender;
		
		System.out.println("Zahl [0..9999]: ");
		
		eingabe = In.readInt;
				
		einer 		= eingabe%10;
		zehner 		= (eingabe/10)%10;
		hunderter 	= (eingabe/100)%10;
		tausender	= (eingabe/1000)%10;
	
	*/
		}
	}

}
