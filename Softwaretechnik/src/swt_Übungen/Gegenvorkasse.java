package swt_Übungen;

public class Gegenvorkasse implements Zustand_state {

public String auskunft() {
		
		return "ist kreditunwürdig";
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
