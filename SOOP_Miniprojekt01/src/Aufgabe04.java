import java.util.Scanner;

public class Aufgabe04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long milliseconds = s.nextLong();
		s.close();
		System.out.print(convertMillisec(milliseconds));

	}

	public static String convertMillisec(long milliseconds) {
		int seconds = (int) (milliseconds / 1000) % 60;
		int minutes = (int) (milliseconds / (1000 * 60)) % 60;
		int hours 	= (int) (milliseconds / (60 *1000 * 60) % 60);
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

}
