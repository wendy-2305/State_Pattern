package swt_Übungen;

public class Kritisch implements Zustand_state {

	
	public String auskunft() {
		
		return "zeigt Verhaltensdefizite";
	}

	
	public int kredit() {
		
		return 100;
	}

	
	public Zustand_state Aktionpunktlich() {
		
		return new Beobachtung();
		
	}

	public Zustand_state Aktionunpunktlich() {
		
		return new Gegenvorkasse();
	}

	
	public Zustand_state nichtbezahlt() {
		
		return new Gegenvorkasse();
	}

}
