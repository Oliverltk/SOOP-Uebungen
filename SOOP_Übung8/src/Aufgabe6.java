public class Aufgabe6 {

	public static void main(String[] args) {
		String s = "haribo";
		System.out.print(reverse(s));
	}
	
	public static String reverse(String s) {
	    if ((null == s) || (s.length() <= 1)) {
	        return s;
	    }
	    return reverse(s.substring(1)) + s.charAt(0);
	}


}
