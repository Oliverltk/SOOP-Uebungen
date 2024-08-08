import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Eingabe der ersten Person
		System.out.println("erste Person");

		System.out.print("Name: ");
		String Name1 = s.next();
		System.out.print("Vorname: ");
		String Vorname1 = s.next();
		System.out.print("Geburtsdatum: ");
		String Geburtsdatum1 = s.next();
		System.out.print("Geschlecht: ");
		String Geschlecht1 = s.next();
		System.out.print("Guthaben: ");
		String Guthaben1 = s.next();

		// Eingabe der zweiten Person
		System.out.println("zweite Person");

		System.out.print("Name: ");
		String Name2 = s.next();
		System.out.print("Vorname: ");
		String Vorname2 = s.next();
		System.out.print("Geburtsdatum: ");
		String Geburtsdatum2 = s.next();
		System.out.print("Geschlecht: ");
		String Geschlecht2 = s.next();
		System.out.print("Guthaben: ");
		String Guthaben2 = s.next();

		// Ausgabe in der Tabelle
		System.out.println("\nPerson   Name             Geburtsdatum   Geschlecht   Guthaben	");
		System.out.printf("--------------------------------------------------------------	");
		System.out.printf("\n     1   %-14s   %10s   %7s   %13s             				", Name1 + " " + Vorname1,
				Geburtsdatum1, Geschlecht1, Guthaben1);
		System.out.printf("\n     2   %-14s   %10s   %7s   %13s         					", Name2 + " " + Vorname2,
				Geburtsdatum2, Geschlecht2, Guthaben2);

	}

}
