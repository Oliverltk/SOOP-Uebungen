
import java.util.Arrays;

public class Multikoerper {

	//privates Attribut Koerper[] komponenten, das die Teilkörper speichert.
	private Koerper[] komponenten;
	
	//Konstruktor mit einem Parameter, der die Anzahl der Teilkörper repräsentiert.
	public Multikoerper(int anzahl) {
		anzahl = this.komponenten.length + 1;
	}
	
	//Parameterloser Konstruktor, der die Anzahl der Teilkörper auf 1 festlegt. Der parameterlose Konstruktor verwendet den anderen, parametrisierten Konstruktor.
	public Multikoerper() {
		
	}
	
	//Methode public void einfuegen(Koerper k), welche den übergebenen Körper hinzufügt. Achten Sie darauf, dass das Array komponenten ggf. schon voll ist. Der neue Körper soll in jedem Fall eingefügt werden.
	public void einfuegen(Koerper k) {
		komponenten = Arrays.copyOf(komponenten, komponenten.length + 1);
		komponenten[komponenten.length-1] = k;
	}
	
	//Eine öffentliche Methode, welche die Anzahl der Teilkörper zurückliefert.
	public double Anzahl() {
		return ;
	}
}
