import java.util.Arrays;

public class Rechnung {

	// privates Attribut Rechnung[] rechnungen
	private Artikel[] artikel;

	// parameterloser Konstruktor
	public Rechnung() {
		this.artikel = new Artikel[1];
	}

	//getter und setter
	public Artikel[] getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel[] artikel) {
		this.artikel = artikel;
	}

	// Methode void neuerArtikel(Artikel artikel), die einen Artikel zu der Rechnung
	// hinzufügt

	
	public void neuerArtikel(Artikel artikel) {

		// Kopiere das Array, mach es ein Feld größer, schreibe Artikel an letzte Stelle
		this.artikel = Arrays.copyOf(this.artikel, this.artikel.length + 1);
		this.artikel[this.artikel.length - 1] = artikel;

	}

	// Methode double getBetrag(), die den Gesamtbetrag der Rechnung zurückliefert.
	public double getBetrag() {

		// Schleife, die die Preise auf leeren Betrag aufaddiert
		double betrag = 0;
		for (int i = 1; i < this.artikel.length; i++) {
			betrag += artikel[i].getpreis();
		}
		return betrag;
	}

}
