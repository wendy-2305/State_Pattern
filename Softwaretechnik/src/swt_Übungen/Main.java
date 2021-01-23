package swt_Übungen;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	Scanner scanner= new Scanner(System.in);
	
	private List<Projekt> projekte = new ArrayList<Projekt>();
	private List<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
	
	public Main() {
		int ein=-1;
		while(ein!=0) {
			System.out.println("was wollen sie machen?\n"
			+"(0) Programm beenden \n"
		    +"(1) Neues Mitarbeiter anlegen \n"
			+"(2) Neues Projekt anlegen\n"
			+"(3) einem Projekt einem Mitarbeiter zuordnen\n"
			+"(4) einem Mitarbeiter einem Projekt zuordnen\n"
			+"(5) einem Mitarbeiter einem Projekt entfernen\n"
			+"(6) einem Projekt von einem Mitarbeiter entfernen\n"
			+"(7) Alle Mitarbeiter zu einem Projekt ausgeben\n"
			+"(8) Alle Projekte eines Mitarbeiters ausgeben\n"
						
					);ein= new Scanner(System.in).nextInt();
				
			switch(ein) {
			case 1:{
				mitarbeiter.add(new Mitarbeiter());
				break;
			}
			case 2:{
				projekte.add(new Projekt());
				break;
			}
			case 3:{
				Mitarbeiter mi=zuMinr() ;
				Projekt pi=zuPrnr();
				if(mi!=null && pi!=null)
					pi.bearbeiterHinzufuegen(mi);
				break;
			}
			case 4:{
				Mitarbeiter mi=zuMinr() ;
				Projekt pi=zuPrnr();
				if(mi!=null && pi!=null)
					mi.projekteHinzufuegen(pi);
				break;
			}
			case 5:{
				Mitarbeiter mi=zuMinr() ;
				Projekt pi=zuPrnr();
				if(mi!=null && pi!=null)
					pi.bearbeiterlöschen(mi);
				break;
			}
			case 6:{
				Mitarbeiter mi=zuMinr() ;
				Projekt pi=zuPrnr();
				if(mi!=null && pi!=null)
					mi.projektelöschen(pi);
				break;
			}
			case 7:{
				Projekt pi=zuPrnr();
				System.out.println("Mitarbeiter:");
				for(Mitarbeiter m:pi.bearbeiter)
				System.out.println(" " + m );
				break;
				}
				case 8:{
				System.out.println("Projekte:");
				for(Projekt p:projekte)
				System.out.println(" " + p);
				break;
				}
			}
		}
		
		
	}
	public Mitarbeiter zuMinr() {
		System.out.println("Welcher Mitarbeiter (minr)");
		int minr= new Scanner(System.in).nextInt();
		Mitarbeiter ergebnis=null;
		for(Mitarbeiter m: mitarbeiter) {
			if(m.getMinr()==minr) ergebnis=m;
			}
		return ergebnis;
		
	}
	
	public Projekt zuPrnr() {
		System.out.println("welche Projekte (prnr)");
		int prnr= new Scanner(System.in).nextInt();
		Projekt reponse= null;
		for(Projekt p:projekte) {
			if(p.getPrnr()==prnr) reponse=p;
		}
		return reponse;
	}
	public static void main(String[] args) {
		new Main();
		}
	
}
