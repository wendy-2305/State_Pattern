package swt_Übungen;
import java.util.ArrayList;
import java.util.Scanner;

public class Mitarbeiter implements Mitarbeiterinterface {
	
	int minr;
	String name;
	private ArrayList<Projekt>projekte;
	

	public Mitarbeiter(int minr, String name) {
		super();
		this.minr = minr;
		this.name = name;
		this.projekte = new ArrayList<Projekt>();
	}
	public Mitarbeiter(){
		Scanner eingabe=  new Scanner(System.in);
		System.out.println("Mitarbeiternummer: ");
		this.minr= eingabe.nextInt();
		System.out.println("Mitarbeitername: ");
		this.name= eingabe.next();
		this.projekte = new ArrayList<Projekt>();
	}
	
	
	public int getMinr() {
		return minr;
	}
	public void setMinr(int minr) {
		this.minr = minr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString(){
	StringBuffer s= new StringBuffer(minr+": "+name+ "[ ");
	for(Projekt p:projekte){
	s.append(p.getName());
	s.append("(");
	s.append(""+p.getPrnr());
	s.append(") ");
	}
	s.append("]");
	return s.toString();
	}
	
	public void projekteHinzufuegen(Projekt p) {
		projekte.add(p);
	}
	public void projekteHinzufuegen2(Projekt p) {
		projekte.add(p);
		p.bearbeiterHinzufuegen2(this);
	}
	
	public void projektelöschen(Projekt p) {
		projekte.remove(p);
	}
	

}
