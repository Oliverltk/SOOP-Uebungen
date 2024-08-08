public class Test {

	public static void main(String[] args) {
		// Bruch
		Bruch a = new Bruch(1, 3);
		Bruch b = new Bruch(1, 4);
		System.out.println(a.toString());
		// a.addiere(b);
		System.out.println(a.toString());
		// System.out.println(b.toString());

		a.subtrahiere(b);
		System.out.println(a.toString());
		// System.out.println(b.toString());

		// Punkt
		Punkt c = new Punkt(2, 2, 2);
		Punkt d = new Punkt(7, 8, 9);
		System.out.println(c.toString());
		c.bewege(2, 1, 2);
		System.out.println(c.toString());
		System.out.println(c.abstand(d));
		
		//Koerper
		Koerper e = new Koerper(1,1,1,"blau");
		System.out.println(e.volumen());
		System.out.println(e.flaeche());
		System.out.println(e.farbe);
		System.out.println(e.toString());
		
		//Wuerfel
		Wuerfel f = new Wuerfel(2,2,2,"gruen",3);
		System.out.println(f.getLaenge());
		Wuerfel g = new Wuerfel(3,3,3,"rot", 4);
		System.out.println(f.abstand(g));
		System.out.println(f.volumen());
		System.out.println(f.flaeche());
		System.out.println(f.toString());
	}

}
