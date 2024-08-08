import java.util.Scanner;

public class ASCII_Art_4a {

	public static void main(String[] args) {

		System.out.println("Geben Sie Ihre ASCII-Art zeilenweise an:");

		Scanner s = new Scanner(System.in);
		s.close();
		System.out.println("Geben Sie die 1. Zeile ein:");
		String Zeile1 = s.nextLine();
		System.out.println("Geben Sie die 2. Zeile ein:");
		String Zeile2 = s.nextLine();
		System.out.println("Geben Sie die 3. Zeile ein:");
		String Zeile3 = s.nextLine();
		System.out.println("Geben Sie die 4. Zeile ein:");
		String Zeile4 = s.nextLine();
		System.out.println("Geben Sie die 5. Zeile ein:");
		String Zeile5 = s.nextLine();
		System.out.println("Geben Sie die 6. Zeile ein:");
		String Zeile6 = s.nextLine();
		System.out.println("Geben Sie die 7. Zeile ein:");
		String Zeile7 = s.nextLine();
		System.out.println("Geben Sie die 8. Zeile ein:");
		String Zeile8 = s.nextLine();
		System.out.println("Geben Sie die 9. Zeile ein:");
		String Zeile9 = s.nextLine();

		System.out.println("Ihre Finale Eingabe lautet:");

		System.out.println(Zeile1 + "\n" + Zeile2 + "\n" + Zeile3 + "\n" + Zeile4 + "\n" + Zeile5 + "\n" + Zeile6 + "\n"
				+ Zeile7 + "\n" + Zeile8 + "\n" + Zeile9 + "\n");

	}

}
