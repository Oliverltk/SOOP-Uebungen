import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		//Zahlen einlesen
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("Geben Sie "+ arr.length +" Zahlen ein: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		
		//Leere Arrays erstellen
		int gerade[] = new int[0];
		int ungerade[] = new int[0];
		
		//Arrays durchzählen und prüfen, ob Zahlen gerade oder ungerade sind
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				gerade = Arrays.copyOf(gerade, gerade.length+1);
				gerade[gerade.length-1] = arr[i];
			} else {
				ungerade = Arrays.copyOf(ungerade, ungerade.length+1);
				ungerade[ungerade.length-1] = arr[i];
			}
		}
		//System.out.println("Gerade Zahlen: "+Arrays.toString(gerade));
		//System.out.println("Ungerade Zahlen: "+Arrays.toString(ungerade));
		
		//Arrays printen
		printArrays(gerade,ungerade);
	}
	
	
		public static void printArrays(int[] gerade, int[] ungerade) {
			System.out.print("Gerade Zahlen: ");
			for(int i = 0; i < gerade.length;i++) {
				System.out.print(gerade[i]+" ");
			
			}
			System.out.println();
			System.out.print("Ungerade Zahlen: ");
			for(int i = 0; i < ungerade.length;i++) {
				System.out.print(ungerade[i]+" ");
				
			}
			
	}
}
