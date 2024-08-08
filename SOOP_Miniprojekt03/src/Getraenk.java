public class Getraenk extends Artikel{
	private double pfand;
	
	public Getraenk() {
		
	}

	public Getraenk(String name,double preis,double mwstsatz,double pfand) {
		super(name, preis, mwstsatz);
		
	
	}

	public double getpfand() {
		return pfand;
	}

	public double setpfand(double neuerpfand) {
		this.pfand = neuerpfand;
		return neuerpfand;
	}
	
	//Wieso will der die Methode von der Klasse Artikel nicht aufrufen?
	//Keine Ahnung, ob getmwstsatz etwas bringt.
	public String toString() {
		return this.getname() + " - " + this.getpreis() + " Euro (inkl. " + this.pfand + " Pfand ) (inkl. "
				+ this.berechneMwst() + " Euro Mwst.)";
	}
}
