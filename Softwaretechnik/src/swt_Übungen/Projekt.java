package swt_Übungen;

import java.util.ArrayList;
import java.util.Scanner;

public class Projekt implements Projektinterface{


	String name;
	int prnr;
	public ArrayList<Mitarbeiter> bearbeiter;
	
	public Projekt(String name, int prnr) {
		this.name = name;
		this.prnr = prnr;
		this.bearbeiter=new ArrayList<Mitarbeiter>();
	}
	
	public Projekt() {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Projektnummer: ");
		this.prnr= eingabe.nextInt();
		System.out.println("Projektname: ");
		this.name=eingabe.next();
		this.bearbeiter=new ArrayList<Mitarbeiter>();
	}
	
	
	@Override
	public String toString(){
	StringBuffer s= new StringBuffer(prnr+": "+name+ "[ ");
	for(Mitarbeiter m:bearbeiter){
	s.append(m.getName());
	s.append("(");
	s.append(""+m.getMinr());
	s.append(") ");
	}
	s.append("]");
	return s.toString();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrnr() {
		return prnr;
	}
	public void setPrnr(int prnr) {
		this.prnr = prnr;
	}
	
	public void bearbeiterHinzufuegen(Mitarbeiter m) {
		bearbeiter.add(m);
	}
	public void bearbeiterHinzufuegen2(Mitarbeiter m) {
		bearbeiter.add(m);
		m.projekteHinzufuegen2(this);
	}
	
	public void bearbeiterlöschen(Mitarbeiter m) {
		bearbeiter.remove(m);
	}


}
