import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Gewünschte Länge: ");
		int reihe = s.nextInt();
		String temporary = "" + Math.pow(10, (reihe-3));
		int zahl = (int) Math.pow(2, reihe);
		s.close();

		for (int i = 0; i < zahl; i++) {
			String binaer = Integer.toBinaryString(i);
			
			while (binaer.length() < temporary.length()) {
				binaer = "0" + binaer;
			}
			System.out.println(binaer.replaceAll("\\B", " "));
			
		}

	}
}

/*
 * for (int i = 0; i < zahl; i++) { String wert = Integer.toBinaryString(i); int
 * laenge = Integer.toBinaryString(i).length(); while(wert.length() < reihe) {
 * System.out.println("0"+ wert); wert = 0+wert; } } public static int
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * } /
 **/