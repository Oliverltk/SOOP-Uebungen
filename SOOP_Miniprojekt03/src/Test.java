public class Test {

	public static void main(String[] args) {
		
		//Artikel
		Artikel eis = new Artikel("Schokoeis",1.5, 0.19);
		String name = eis.getname();
		double preis = eis.getpreis();
		double mwstsatz = eis.getmwstsatz();
		String ergebnis = eis.toString();
		System.out.println(name);
		System.out.println(preis);
		System.out.println(mwstsatz);
		System.out.println(ergebnis);
		System.out.println();
		
		//Getraenk
		Getraenk cola = new Getraenk("light",1.40, 0.50, 0.15);
		double pfand = cola.setpfand(0.25);
		String ausgabe = cola.toString();
		System.out.println(pfand);
		System.out.println(ausgabe);
		System.out.println();
		
		//Menu
		Getraenk fanta = new Getraenk("lemon",1.20, 0.19, 0.25);
		Menu eins = new Menu(true, 700, fanta , "Mahlzeit", "HappyMeal", 7.50, 0.25);
		eins.setbeschreibung(eins.getbeschreibung()+ " mit " +eins.getgetraenk().getname());
		System.out.println(eins.toString());
		
		//Rechnung
		Rechnung heute = new Rechnung();
		heute.neuerArtikel(eis);
		heute.neuerArtikel(cola);
		heute.neuerArtikel(eins);
		
		System.out.println(heute.getBetrag());
		
		//Kasse
		 Kasse kasse = new Kasse(15.0);
	        kasse.neueRechnung();
	        kasse.neuerArtikel(eis);
	        kasse.neuerArtikel(eis);
	        System.out.println("Das kostet insgesamt "+kasse.kassieren());
	        System.out.println("Barbestand vorm Bezahlen "+kasse.getBarBestand());
	        kasse.bezahlen(20.0);
	        System.out.println("Barbestand nach dem Bezahlen "+kasse.getBarBestand());
	        kasse.neueRechnung();
	        System.out.println("Gesamtumsatz "+kasse.getUmsatz());
	        
	        kasse.neueRechnung();
	        kasse.neuerArtikel(cola);
	        System.out.println("Das kostet insgesamt "+kasse.kassieren());
	        System.out.println("Barbestand vorm Bezahlen "+kasse.getBarBestand());
	        kasse.bezahlen(20.0);
	        System.out.println("Barbestand nach dem Bezahlen "+kasse.getBarBestand());
	        System.out.println("Gesamtumsatz "+kasse.getUmsatz());
	}

}
