package swt_�bungen;

public class Gegenvorkasse implements Zustand_state {

public String auskunft() {
		
		return "ist kreditunw�rdig";
	}

	
	public int kredit() {
		
		return 0;
	}

	
	public Zustand_state Aktionpunktlich() {
		
		return this;
	}

	
	public Zustand_state Aktionunpunktlich() {
		
		return this;
	}

	
	public Zustand_state nichtbezahlt() {
		
		return this;
	}
}
