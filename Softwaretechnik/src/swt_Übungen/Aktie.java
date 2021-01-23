package swt_Übungen;

import java.util.Scanner;

public class Aktie extends Aktienverwaltung {

	public int wert;

	public Aktie(String aktienname) {
		super(aktienname);
	}
	
 /*   public Aktie() {
		Scanner eingabe =new Scanner(System.in);
		System.out.println("Aktienname?");
		this.aktienname=eingabe.next();
		
	}*/

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
		benachrichtigen();
	}
	@Override
	public String toString(){
	return getAktienname();
	}
	
}
