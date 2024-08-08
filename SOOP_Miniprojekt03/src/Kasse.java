import java.util.Arrays;

public class Kasse extends Rechnung {

	// privates Attribut Rechnung[] rechnungen
	private Rechnung[] rechnungen;

	// privates Attribut double barBestand
	private double barBestand;

	// parameterloser Konstruktor
	public Kasse() {
		this.rechnungen = new Rechnung[1];
	}

	// getter und setter Rechnungen
	public Rechnung[] getRechnungen() {
		return rechnungen;
	}

	public void setRechnungen(Rechnung[] rechnungen) {
		this.rechnungen = rechnungen;
	}

	// getter und setter barBestand
	public double getBarBestand() {
		return barBestand;
	}

	public void setBarBestand(double barBestand) {
		this.barBestand = barBestand;
	}

	// Konstruktor mit einem double-Parameter, der den initialen Bargeldbestand
	// abbildet
	public Kasse(double startgeld) {
		this.rechnungen = new Rechnung[1];
		this.rechnungen[0] = new Rechnung();
		this.barBestand = startgeld;
		System.out.println(startgeld);
	}

	// Methode void neueRechnung(), die einen neuen Bezahlvorgang beginnt
	public void neueRechnung() {
		Rechnung[] tmp = new Rechnung[this.rechnungen.length];
		tmp = Arrays.copyOf(this.rechnungen, this.rechnungen.length + 1);
		this.rechnungen = tmp;
		Rechnung neueRechnung = new Rechnung();
		this.rechnungen[this.rechnungen.length - 1] = neueRechnung;
	}

	//  Methode void neuerArtikel(Artikel), die einen neuen Artikel zur aktuellen
	// Rechnung hinzufügt.
	public void neuerArtikel(Artikel artikel) {
		this.rechnungen[this.rechnungen.length - 1].neuerArtikel(artikel);
	}

	// Methode double kassieren(), welche den Gesamtbetrag der aktuellen Rechnung
	// zurückliefert
	public double kassieren() {
		return this.rechnungen[this.rechnungen.length - 1].getBetrag();
	}

	// Methode double bezahlen(double gegeben), welche den Bezahlvorgang für die
	// aktuelle Rechnung durchführt
	public double bezahlen(double gegeben) {
		double wechselgeld = gegeben - kassieren();
		this.barBestand = this.barBestand + kassieren();
		return wechselgeld;
	}

	//  Methode double getUmsatz(), die den Gesamtumsatz aller Rechnungen der Kasse
	// zurückgibt
	public double getUmsatz() {
		double summe = 0;
		for (int i = 1; i < this.rechnungen.length; i++) {
			summe += this.rechnungen[i].getBetrag();
		}
		return summe;
	}
}
