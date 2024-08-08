import java.util.Scanner;

public class Ausgeschrieben_6_Entwurf {

	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Zahl [0..9999]: ");
		int Eingabezahl = s.nextInt();
		
		String tausender 	= "";
		String hunderter 	= "";
		String zehner 		= "";
		String einer		= "";
		int tausenderi 		= Eingabezahl/1000%10;
		int hunderteri 		= Eingabezahl/100%10;
		int zehneri 		= Eingabezahl/10%10;
		int eineri			= Eingabezahl%10;
		String a ="";
		
		if(tausenderi == 0 && hunderteri == 0 && zehneri == 1) {
			
			switch (zehneri){
			case 0:
			a= "";
			break;
			case 1: 
			a="Elf";
			break;
			case 2:
			a="Zwölf";
			break;
			case 3:
			a="dreizehn";
			break;
			case 4:
			a="Vierzehn";
			break;
			case 5:
			a="Fünfzehn";
			break;
			case 6:
			a="Sechzehn";
			break;
			case 7:
			a="Siebzehn";
			break;
			case 8:
			a="Achtzehn";
			break;
			case 9:
			a="Neunzehn";
			break;
			}
			System.out.println(a);
		}
		
			else {
			
		
		
		switch (Eingabezahl/1000) {
		case 1: tausender = "eintausend";
		break;
		case 2: 
		}
			
		switch (Eingabezahl/100%10) {
		case 1: hunderter = "einhundert";
		break;
		case 2:
		}
		
		switch (Eingabezahl/10%10) {
		case 1: zehner = "zehn";
		break;
		case 2: zehner = "zwanziger";
		break;
		}
		
		switch (Eingabezahl%10) {
		case 1: einer = "eins";
		break;
		case 2: einer = "zwei";
		break;
		case 3: einer = "drei";
		break;
		}
		System.out.println(tausender + hunderter + einer +"und"+ zehner);
			}
		
	}
	

}

		
