//noch keine Rücksicht auf Bruttopreise und Mwst im Pfand genommen

public class Menu extends Artikel {

	//  private Attribute
	private boolean vegetarisch;
	private int kalorien;
	private Getraenk getraenk;
	private String beschreibung;

	// parameterloser Konstruktor
	public Menu() {
		
	}
	
	// Konstruktor mit Parametern für alle Attribute
	public Menu(boolean vegetarisch, int kalorien, Getraenk getraenk, String beschreibung, String name, double preis, double mwstsatz) {
		super(name,preis,mwstsatz);
		this.vegetarisch = vegetarisch;
		this.kalorien = kalorien;
		this.getraenk = getraenk;
		this.beschreibung = beschreibung;
		
	}

	// Getter
	public boolean getvegetarisch() {
		return vegetarisch;
	}

	public int getkalorien() {
		return kalorien;
	}

	public Getraenk getgetraenk() {
		return getraenk;
	}

	public String getbeschreibung() {
		return beschreibung;
	}

	// Setter
	public boolean setvegetarisch(boolean neuvegetarisch) {
		this.vegetarisch = neuvegetarisch;
		return neuvegetarisch;
	}

	public int setvegetarisch(int neukalorien) {
		this.kalorien = neukalorien;
		return neukalorien;
	}

	public Getraenk setgetraenk(Getraenk neugetraenk) {
		this.getraenk = neugetraenk;
		return neugetraenk;
	}

	public String setbeschreibung(String neubeschreibung) {
		this.beschreibung = neubeschreibung;
		return neubeschreibung;
	}

	public String toString() {
		// Ergebnis mit vegetarisch
		String ergebnis = this.getname() + " - " + this.getbeschreibung() + "(" + "vegetarisch" + ")" + "("
				+ this.getpreis() + " Euro)";

		// falls vegetarisch false, dann soll vegetarisch weg
		if (vegetarisch == false) {
			ergebnis = ergebnis.replace("(" + "vegetarisch" + ")", "");
		}

		return ergebnis;
	}

	public String getempfehlung() {

		// String erstellen
		String rot = "rot";
		String gelb = "gelb";
		String gruen = "gruen";

		// Kalorienabfrage
		if (this.kalorien > 750) {
			return rot;
		} else if (this.kalorien > 500) {
			return gelb;
		} else {
			return gruen;
		}
	}
}
