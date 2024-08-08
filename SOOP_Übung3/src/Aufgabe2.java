import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		//Zahl einlesen
		System.out.print("Zahl: ");

		int x = s.nextInt();

		int letzte = x % 10;

		switch (letzte) {
		case 0:
			System.out.println(x + " endet auf Null");
			break;
		case 1:
			System.out.println(x + " endet auf Eins");
			break;
		case 2:
			System.out.println(x + " endet auf Zwei");
			break;
		case 3:
			System.out.println(x + " endet auf Drei");
			break;
		case 4:
			System.out.println(x + " endet auf Vier");
			break;
		case 5:
			System.out.println(x + " endet auf Fünf");
			break;
		case 6:
			System.out.println(x + " endet auf Sechs");
			break;
		case 7:
			System.out.println(x + " endet auf Sieben");
			break;
		case 8:
			System.out.println(x + " endet auf Acht");
			break;
		case 9:
			System.out.println(x + " endet auf Neun");
			break;
		}
	}

}
