package swt_�bungen;

public interface Zustand_state {
	
	public String auskunft();
	public int kredit();
	public Zustand_state Aktionpunktlich();
	public Zustand_state Aktionunpunktlich();
	public Zustand_state nichtbezahlt();

}
