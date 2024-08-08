import java.util.Arrays;

public class Bank {
	// Array mit allen Konten der Bank
	Konto[] konten;

	/**
	 * Parameterloser Konstruktor
	 */
	public Bank() {
	}

	/**
	 * Konstruktor
	 *
	 * @param konten Array mit den Konten der Bank
	 */
	public Bank(Konto[] konten) {
		this.konten = konten;
	}

	/***********************************
	 * BEGINN des zu bearbeitenden Codes
	 ***********************************/
	/**
	 * Liefert eine String-Repräsentation aller Konten als Liste untereinander:
	 *
	 * [nr]: guthaben [nr]: guthaben [nr]: guthaben usw.
	 *
	 * @return String, der die Liste aller Konten wie oben dargestellt enthält
	 */
	public String toString() {
		// Lösung hier
		/*
		 * String[] b = new String[0]; for(int i = 0;i<konten.length; i++) { b =
		 * Arrays.copyOf(b, b.length+1); b[b.length -1] = konten[i].toString(); }
		 */
		String r = "";
		for (int i = 0; i < this.konten.length; i++) {
			r = r + this.konten[i] + "\n";
		}
		return r;
	}

	/**
	 * Liefert das Konto zur übergebenen Nummer.
	 *
	 * @param nummer Nummer des gesuchten Kontos
	 * @return zur Nummer gehörendes Konto Objekt, oder null, falls das Konto nicht
	 *         existiert
	 */
	public Konto getKonto(int nummer) {
		// Lösung hier
		for (int i = 1; i < this.konten.length ; i++) {
			if (konten[i].getNummer() == nummer) {
				return this.konten[nummer];
			}
		}
		return null;

	}

	/**
	 * Überweist einen Betrag von einem Konto zu einem anderen Konto. Nach der
	 * Überweisung ist das Guthaben auf dem Konto sender um den Betrag niedriger und
	 * auf dem Konto empfänger um den Betrag höher. Die Überweisung kann
	 * fehlschlagen, falls das Konto sender nicht ausreichend gedeckt ist.
	 *
	 * @param sender     Kontonummer des Senders der Überweisung
	 * @param empfaenger Kontonummer des Empfängers der Überweisung
	 * @param betrag     Betrag, der vom Konto des Senders auf das Konto des
	 *                   Empfängers überwiesen wird
	 * @return true, falls die Überweisung erfolgreich war, sonst false
	 */
	public boolean ueberweisen(int sender, int empfaenger, double betrag) {
		// Lösung hier

		if (sender < betrag) {
			return false;
		} else {
			sender -= betrag;
			empfaenger += betrag;
		}
		return true;
	}

	/**
	 * Ermittelt die Bilanzsumme der Bank: Die Bilanzsumme ist die Summe aller
	 * Guthaben aller Konten.
	 *
	 * @return die Bilanzsumme
	 */
	public double bilanzsumme() {
		// Lösung hier
		double summe = 0;
		for (int i = 0; i < konten.length; i++) {
			summe += konten[i].getGuthaben();
		}
		return summe;
	}

	/**
	 * Führt die Kontenabrechnung am Quartalsende durch: Jedem Konto mit positivem
	 * Guthaben werden 2% des Guthabens zugebucht (Guthabenzinsen), von jedem Konto
	 * mit negativem Guthaben werden 10% des Guthabens abgebucht
	 * (Überziehungsgebühren).
	 */
	public void abrechnen() {
		// Lösung hier
		for (int i = 0; i < konten.length; i++) {
			if (konten[i].getGuthaben() < 0) {
				konten[i].abbuchen(konten[i].getGuthaben()*0.1);
			}
			else {
				konten[i].zubuchen(konten[i].getGuthaben()*1.02);
			}
		}
	}

	/**
	 * Liefert alle Konten, bei denen das Guthaben negativ UND mehr als die Hälfte
	 * des Dispokredits ausgeschöpft ist. Anmerkung: Der Dispokredit ist im Konto
	 * als positiver Betrag gespeichert.
	 *
	 * @return Array mit den Risikokonten
	 */
	public Konto[] risikoKonten() {
		// Lösung hier
		Konto[] risiko = new Konto[0];
		for(int i = 0;i<konten.length;i++) {
			if(konten[i].getGuthaben()<0 && konten[i].getGuthaben()<(risiko[i].getDispo()/2)) {
				risiko = Arrays.copyOf(risiko, risiko.length+1);
				risiko[risiko.length-1] = konten[i];
				
			}
		}
		return risiko;
	}

	/***********************************
	 * ENDE des zu bearbeitenden Codes
	 ***********************************/
	// Verwenden Sie die Methode main für Ihre Tests, fügen Sie ggf.
	// weitere Konten und Tests hinzu
	public static void main(String[] args) {
		// fünf Konten für die Tests
		Konto[] k = { new Konto(), new Konto(2000, 500), new Konto(100, 0), new Konto(-200, 1000),
				new Konto(1000, 500) };
		// Bank initialisieren
		Bank b = new Bank(k);
		// Sollte die fünf Konten untereinander ausgeben, erfordert toString
		System.out.println(b);
		// Ausgabe:
		// [ 1]: 0,00
		// [ 2]: 2000,00
		// [ 3]: 100,00
		// [ 4]: -200,00
		// [ 5]: 1000,00
		// Sollte das dritte Konto (Guthaben 100) ausgeben
		System.out.println(b.getKonto(3));
		// Sollte true ausgeben:
		System.out.println(b.ueberweisen(4, 2, 350));
		System.out.println();
		// Liste wie oben, Konto 2: 2350 --- Konto 4: -550:
		System.out.println(b);
		// sollte 2900 ausgeben:
		System.out.println(b.bilanzsumme());
		System.out.println();
		// Sollte 1300 ausgeben:
		System.out.println(b.getKonto(3).zubuchen(1200));
		System.out.println();
		b.abrechnen();
		// Liste wie oben
		// Erwartete Guthaben: 0 --- 2397 --- 1326 --- -605 --- 1020
		System.out.println(b);
		// sollte 4138 ausgeben:
		System.out.println(b.bilanzsumme());
		System.out.println();
		// Sollte das Konto 4 in zusätzlichen [] ausgeben:
		System.out.println(Arrays.toString(b.risikoKonten()));
		// Sollte null ausgeben:
		System.out.println(b.getKonto(507));
	}
}