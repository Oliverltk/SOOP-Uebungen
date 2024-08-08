//Implementieren Sie eine Klasse Punkt, welche einen Punkt im R3\mathbb{R} ^3R3 (dreidimensionaler Raum) repräsentiert
public class Punkt {

	// Öffentliche double Attribute x, y und z, welche die Koordinate des Punktes im
	// Raum repräsentieren.
	public double x, y, z;

	// Ein Konstruktor mit drei double-Parametern zum Erzeugen von Punkt-Objekten.
	public Punkt(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// Methode public void bewege(double dX, double dY, double dZ), welche den Punkt
	// im Raum um die angegebenen Werte verschiebt
	public void bewege(double dX, double dY, double dZ) {
		x = x + dX;
		y = y + dY;
		z = z + dZ;
	}

	// Methode public double abstand(Punkt p), liefert den Abstand zwischen den
	// Positionen dieses Punkt und des Punkt p in euklidischer Metrik
	public double abstand(Punkt p) {
		// return (p.x - x) + (p.y- y) + (p.z - z);
		return Math.sqrt(
				(p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y) + (p.z - this.z) * (p.z - this.z));

	}

	// Methode public String toString(), welche eine Zeichenkette der Form (x, y, z)
	// zurückliefert.
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}
}
