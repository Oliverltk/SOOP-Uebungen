import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in); 
		System.out.print("Zahl: ");
		int a = s.nextInt();
		System.out.print("Zahl: ");
		int b = s.nextInt();
		s.close();
		max(a,b);

	}
	public static int max (int a, int b) {
		
		if(a<b) {
			System.out.println("Die Zahl "+b+" ist größer als "+a);
			return (b);
		}
		else if(b<a) {
			System.out.println("Die Zahl "+a+" ist größer als "+b);
			return (a);
		}
		return 0;
	} 
}
