package swt_Übungen;

public class Beobachtung implements Zustand_state {

	
	private int anzahl=0;
	public String auskunft() {
	return "wird noch bewertet";
	}
	public int kredit() {
	return 200;
	}
	public Zustand_state Aktionpunktlich() {
	anzahl++;
	if(anzahl>2)
	return new Zuverlässig();
	else
	return this;
	}
	public Zustand_state Aktionunpunktlich() {
	return new Kritisch();
	}
	public Zustand_state nichtbezahlt() {
	return new Gegenvorkasse();
	}
	}

