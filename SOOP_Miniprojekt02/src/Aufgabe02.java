public class Aufgabe02 {

	public static void main(String[] args) {
		String[] a 	= { "Mensa","mensa","Informatik", "Keks", "Informatik", "Info" };
		String s 	= "Mensa";
		int count	= 0;
		System.out.print(wieOftWort(a, s, count));

	}
	
	public static int wieOftWort(String a[], String s, int count) {
		for(int i = 0; i< a.length; i++) {
			boolean b = a[i].equalsIgnoreCase(s);
			if (b==true) {
				count++;
			}
		}
		return count;
	}
}
