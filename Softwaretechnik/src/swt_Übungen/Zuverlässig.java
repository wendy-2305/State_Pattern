package swt_�bungen;

public class Zuverl�ssig implements Zustand_state{

	int anzahl=2;
	public String auskunft(){
		return "Der kunde ist zuverl�ssig";
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
