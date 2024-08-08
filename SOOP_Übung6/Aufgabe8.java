import java.util.Arrays;

public class Aufgabe8 {
	public static void main(String[] args) {
		long x = 123456789; 
		System.out.print(Arrays.toString(primfaktoren(x)));
		
	}

	public static long[] primfaktoren(long x) {
		long[] faktoren = new long[0];
		if(Aufgabe7.istPrim(x)) {
			faktoren = Arrays.copyOf(faktoren, faktoren.length+1);
			faktoren[faktoren.length-1] = x;
			return faktoren;
		}
		long zaehler = 2;
		while (zaehler < x/2) {
			if (x % zaehler == 0) {
				x = x / zaehler;
				faktoren = Arrays.copyOf(faktoren, faktoren.length+1);
				faktoren[faktoren.length-1] = zaehler;
				zaehler = 2;
			} else {
				zaehler++;
			}
		}
		faktoren = Arrays.copyOf(faktoren, faktoren.length+1);
		faktoren[faktoren.length-1] = x;
		
		return faktoren;
	}

}
