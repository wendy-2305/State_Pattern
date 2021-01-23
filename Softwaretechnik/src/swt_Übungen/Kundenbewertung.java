package swt_Übungen;

public class Kundenbewertung {
	
		private Zustand_state zustand;
		public Kundenbewertung(){
		zustand= new Beobachtung();
		}
		public void korrektGezahlt(){
		zustand=zustand.Aktionpunktlich();
		}
		public void verspaetetGezahlt(){
		zustand=zustand.Aktionunpunktlich();
		}
		public void nichtGezahlt(){
		zustand=zustand.nichtbezahlt();
		}
		public int kredit(){
		return zustand.kredit();
		}
		public String auskunft(){
		return zustand.auskunft();
		}
		}


