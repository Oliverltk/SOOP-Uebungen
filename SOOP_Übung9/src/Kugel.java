//Leiten Sie von der Klasse Koerper eine Klasse Kugel ab, welche eine Kugel im R3\mathbb{R} ^3R3 repräsentiert. Das Attribut koordinate repräsentiert den Mittelpunkt der Kugel.
public class Kugel extends Koerper {

	// Attribut private double radius, das den Radius der Kugel speichert.
	private double radius;

	// Konstruktor, der geeignete Parameter für alle Attribute enthält.
	public Kugel(double x, double y, double z, String farbe, double radius) {
		super(x, y, z, farbe);
		this.radius = radius;
	}

	// Methode public void setRadius() mit der der Radius gesetzt werden kann. Es
	// handelt sich hierbei um eine sogenannte Setter-Methode. Recherchieren Sie
	// selbständig, was Getter- und Setter-Methoden sind.
	public void setRadius(double neuradius) {
		this.radius = neuradius;
	}

	public double volumen() {
		return Math.PI * 2 * this.radius;
	}

	public double flaeche() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
}
