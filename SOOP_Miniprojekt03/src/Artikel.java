public class Artikel {

	private String name;
	private double preis;
	private double mwstsatz;
	
	//leerer Konstruktor
	public Artikel() {
		
	}
	
	//private Atribute name, preis, mwstsatz
	public Artikel(String name, double preis, double mwstsatz) {
		this.name = name;
		this.preis = preis;
		this.mwstsatz = mwstsatz;
	}
	
	//getter
	public String getname() {
		return name;
	}
	
	public double getpreis() {
		return preis;
	}

	public double getmwstsatz() {
		return mwstsatz;
	}
	
	//setter
	public String setname(String neuerName) {
		this.name = neuerName;
		return neuerName;
	}
	
	public double setpreis(double neuerPreis) {
		this.preis = neuerPreis;
		return neuerPreis;
	}
	
	public double setmwstsatz(double neuermwstsatz) {
		this.mwstsatz = neuermwstsatz;
		return neuermwstsatz;
	}
	
	//Methode berechneMwst
	public double berechneMwst() {
		/*double nummer = 0;
		nummer = (this.preis) * mwstsatz;
		nummer = Math.round(nummer*100);
		return nummer/100;*/
		
		double a = ((this.preis) / (1+this.mwstsatz) * this.mwstsatz)*100;
		double b = Math.round(a);
		return b/100;
	}
	
	//Methode toString
	public String toString() {
		return this.getname() + " - " + this.getpreis() + " Euro (inkl. "+this.berechneMwst()+" Euro Mwst.)";
	}
	
	
}
