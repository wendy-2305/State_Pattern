package swt_Übungen;

public class Zuverlässig implements Zustand_state{

	int anzahl=2;
	public String auskunft(){
		return "Der kunde ist zuverlässig";
	}
	
	public int kredit() {
		
		return 500;
	}
	
	public Zustand_state Aktionpunktlich() {
		return this;
	}
	
	public Zustand_state Aktionunpunktlich() {
		setAnzahl(0);
				return new Beobachtung();
	}
	

	public Zustand_state nichtbezahlt() {
				return new Gegenvorkasse();
	}
	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
}
