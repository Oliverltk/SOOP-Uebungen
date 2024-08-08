//Implementieren Sie eine Klasse Koerper, welche dreidimensionale geometrische Körper im R3\mathbb{R} ^3R3 repräsentiert
public class Koerper {

	// Öffentliches Attribut String farbe, das die Farbe des Körpers speichert
	public String farbe;

	// Öffentliches Attribut koordinate vom Typ Punkt
	public Punkt koordinate;

	// Konstruktor mit vier Parametern: für die Koordinate und die Farbe
	public Koerper(double x, double y, double z, String farbe) {
		this.koordinate = new Punkt(x, y, z);
		this.farbe = farbe;
	}

	// Parameterloser Konstruktor, der die Farbe auf den Wert schwarz setzt und den
	// Körper im Koordinatenursprung platziert.
	// Der parameterlose Konstruktor verwendet den anderen, parametrisierten
	// Konstruktor.
	public Koerper() {
		this(0, 0, 0, "schwarz");

	}

	// Methode public double volumen(), liefert das Volumen dieses Koerper. Da bei
	// einer allgemeinen Form nicht klar ist, wie groß das Volumen ist, wird 0.0
	// geliefert.
	public double volumen() {
		return (0.0);
	}

	// Methode public double flaeche(), liefert den Oberflächeninhalt dieses
	// Koerper. Da bei einer allgemeinen Form nicht klar ist, wie groß der
	// Flächeninhalt ist, wird 0.0 geliefert.
	public double flaeche() {
		return (0.0);
	}

	// Methode public double abstand(Koerper k), liefert den Abstand zwischen den
	// Positionen dieses Koerper und des Koerper k in euklidischer Metrik. Verwenden
	// Sie die Methode abstand der Klasse Punkt.
	public double abstand(Koerper k) {
		return koordinate.abstand(k.koordinate);
	}

	// Methode public String toString(), liefert alle Datenfelder des Koerper in
	// einem String zurück. Ist diese Methode neu oder überschrieben? Wenn sie
	// überschrieben ist, von welcher Klasse erbt Koerper sie und welche
	// Informationen liefert sie beim Aufruf in der Superklasse?
	public String toString() {
		return "( Koerper: " + this.koordinate.toString() + ", Farbe: " + this.farbe + ")";
	}
}
