import java.util.Scanner;

public class Physikalisch_7 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner (System.in);
	
	//Eingabe von Berechnungsart
	System.out.println("Berechnung waehlen (0..3): ");
	int Eingabezahl = s.nextInt();
	
	//Eingabe von Daten
	
	//Berechnungsart 1
	if (Eingabezahl == 0) {
		System.out.println("Geschwindigkeit aus Weg und Zeit");
		
		System.out.println("Strecke in Meter:");
		int Strecke1 = s.nextInt();
		
		
		System.out.println("Zeit in Sekunden:");
		int Zeit1 = s.nextInt();
		
		//Berechnung und Ausgabe (1)
		System.out.println("Geschwindigkeit:" +Strecke1/Zeit1+ " m/s");
	}
	
	//Berechnungsart 2
	if (Eingabezahl == 1) {
		System.out.println("Kraft aus Masse und Beschleunigung");
	
	
	System.out.println("Masse [kg]:");
	int Masse1 = s.nextInt();
	
	
	System.out.println("Beschleunigung [m/s^2]:");
	int Beschleunigung1 = s.nextInt();
	
	//Berechnung und Ausgabe (2)
	System.out.println("Kraft:" +Masse1*Beschleunigung1+ " N");
	}
	
	//Berechnungsart 3
	if (Eingabezahl == 2) {
		System.out.println("Widerstand aus Spannung und Stromstärke");
		
		System.out.println("Spannung [V]:");
		int Spannung1 = s.nextInt();
		
		System.out.println("Stromstärke [A]: ");
		int Stromstärke1 = s.nextInt();
		
		//Berechnung und Ausgabe (3)
		System.out.println("Widerstand:" +Spannung1/Stromstärke1+ " Ohm");
		
	}
	
	//Berechnungsart 4
	if (Eingabezahl == 3) {
		System.out.println("Leistung aus Spannung und Stromstärke");
		
		System.out.println("Spannung [V]:");
		int Spannung1 = s.nextInt();
		
		System.out.println("Stromstärke [A]: ");
		int Stromstärke1 = s.nextInt();
		
		//Berechnung und Ausgabe (4)
		System.out.println("Leistung:" +Spannung1*Stromstärke1+ " Watt");
	}
	else {
		System.out.println("Ungültige Eingabe");
	}
	
	}
	
}
