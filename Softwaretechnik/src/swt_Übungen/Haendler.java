package swt_Übungen;
import java.util.ArrayList;
import java.util.Scanner;

public class Haendler implements Haendlerinterface{

	private String haendlername;
	private ArrayList<Aktie>aktielist=new ArrayList<>();
	
	public Haendler(String haendlername) {
		this.haendlername = haendlername;
		
		}
	
	public String getHaendlername() {
		return haendlername;
	}

	public void setHaendlername(String haendlername) {
		this.haendlername = haendlername;
	}
	
	
	public void aktualisieren(String aktienname) {
		
		System.out.println(haendlername + "hat neuen wert für" + aktienname + ": " + aktiewertfinden(aktienname));
				
		}
	
	public String toString(){
	return haendlername;
	}
	
	private int aktiewertfinden(String aktienname){
		for(Aktie a:aktielist)
		if(a.getAktienname().equals(aktienname))
		return a.getWert();
		//nie erreichen
		assert(false);
		return 0;
		}
	
	public void neueAktie(Aktie aktie) {
		aktielist.add(aktie);
		aktie.anmelden(this);
		}
	
}
