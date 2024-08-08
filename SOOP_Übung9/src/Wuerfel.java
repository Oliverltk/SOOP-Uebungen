
public class Wuerfel extends Koerper {

	// Attribut private double laenge, das die Kantenlänge des Würfels speichert
	private double laenge;

	// Konstruktor, der geeignete Parameter für alle Attribute enthält.
	public Wuerfel(double x, double y, double z, String farbe, double laenge) {
		super(x, y, z, farbe);
		this.laenge = laenge;
	}
	
	public Wuerfel() {
		super();
		this.laenge = 0.0;
	}
	// Getter- und Setter-Methoden für das Attribut laenge
	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	// Überschreiben Sie die Methoden volumen und flaeche in der für Würfel
	// spezifischen Weise.
	public double volumen() {
		return (Math.pow(this.getLaenge(), 3));
	}

	public double flaeche() {
		return (6 * Math.pow(this.getLaenge(), 2));
	}
	
	//Falls die Methode abstand einen Wuerfel übergeben bekommt, soll sie den korrekten Abstand zwischen den Mittelpunkten dieses und des übergebenen Wuerfel liefern.
	public double abstand(Wuerfel w) {
		Punkt p = new Punkt(w.koordinate.x, w.koordinate.y, w.koordinate.z);
		Punkt p2 = new Punkt(this.koordinate.x, this.koordinate.y, this.koordinate.z);
		p2.bewege(this.laenge/2, this.laenge/2, this.laenge/2);
		p.bewege(w.laenge, w.laenge, w.laenge);
		return p.abstand(p2);
	}
	
	// Überschreiben Sie die Methode toString so, dass auch das neue Attribut
	// zurückgeliefert wird.
	public String toString() {
		return "( Wuerfel: " + this.koordinate + ", Farbe: " + this.farbe + ", Laenge:"+this.laenge+" )";
	}
}
