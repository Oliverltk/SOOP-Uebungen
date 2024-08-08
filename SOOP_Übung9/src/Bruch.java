public class Bruch {
	int zaehler;
	int nenner;
	
	public Bruch(){
		
	}
	
	public Bruch(int zaehler, int nenner){
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public Bruch(int zaehler) {
		this(1, zaehler);
	}
	
	public String toString() {
		return this.zaehler + " / " + this.nenner;
	}
	
	public void addiere(Bruch b) {
		zaehler = zaehler * b.nenner + b.zaehler * nenner;
		nenner = nenner * b.nenner;
		
	}
	
	public void subtrahiere(Bruch b) {
		zaehler = zaehler * b.nenner - b.zaehler * nenner;
		nenner = nenner * b.nenner;
	}
	
	public void multipliziere(Bruch b) {
		zaehler = zaehler * b.zaehler;
		nenner = nenner * b.nenner;
	}

	public void dividiere(Bruch b) {
		zaehler = zaehler * b.nenner;
		nenner = nenner * b.zaehler;
	}
	
	public double wert() {
		return (double) this.zaehler/this.nenner;
	}
	
	public void kuerze() {
		int g = Math.abs(ggT(this.zaehler, this.nenner));
		this.zaehler = this.zaehler / g;
		this.nenner = this.nenner / g;
		
	}
	
	private int ggT(int a, int b) {
		while(b!=0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	
	public static Bruch addiere(Bruch a, Bruch b) {
		Bruch c = new Bruch();
		c.zaehler = a.zaehler * b.nenner + b.zaehler * a.nenner;
		c.nenner = a.nenner * b.nenner;

		return c;
	}

	public static Bruch subtrahiere(Bruch a, Bruch b) {
		Bruch c = new Bruch();
		c.zaehler = a.zaehler * b.nenner - b.zaehler * a.nenner;
		c.nenner = a.nenner * b.nenner;

		return c;
	}

	public static Bruch multipliziere(Bruch a, Bruch b) {
		Bruch c = new Bruch();
		c.zaehler = a.zaehler * b.zaehler;
		c.nenner = a.nenner * b.nenner;

		return c;
	}

	public static Bruch dividiere(Bruch a, Bruch b) {
		Bruch c = new Bruch();
		c.zaehler = a.zaehler * b.nenner;
		c.nenner = a.nenner * b.zaehler;

		return c;
	}

}
