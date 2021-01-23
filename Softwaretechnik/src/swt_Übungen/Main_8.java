package swt_Übungen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_8 {
	public ArrayList<Haendler> haendler = new ArrayList<>();
	public ArrayList<Aktie> aktien = new ArrayList<>();
	
	public Main_8() {
		int eingabe=-1;
		
		
		while(eingabe!=0) { 
			System.out.println("was wollen sie mit machen? \n"
				+"(0)Programm beenden \n"
				+"(1)neue Aktie erstellen \n"
				+"(2neuen Haendler erstellen \n"
				+"(3)haendler interesiert an Aktien \n"
				+"(4)aktie andern \n"); eingabe=new Scanner(System.in).nextInt();
			
				
		switch(eingabe) {
		case 1:
			  neueAktie();
			  break;
			
		case 2:
			neuerHaendler();
			break;
			
		case 3:{
			haendlerInteresseFuerAktie();
			break;
		}
			
		case 4:{
			aktienwertAendern();
			break;
		}
			}
		    }
		    }
	
	public void neueAktie(){
		Scanner sc= new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.print("Aktienname? ");
		String name=sc.next();
		// letztes Zeichen \n löschen
		name=name.substring(0,name.length()-1);
		aktien.add(new Aktie(name));
		}
	
	
		public void neuerHaendler(){
		Scanner sc= new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.print("Haendlername? ");
		String name=sc.next();
		name=name.substring(0,name.length()-1);
		haendler.add(new Haendler(name));
		}
	
		private int listenelementWaehlen(List<?> l){
			//wird nicht mit leerer Liste aufgerufen
			int ergebnis=-1;
			while(ergebnis<0 || ergebnis>=l.size()){
			for(int i=0;i<l.size();i++)
			System.out.print((i+1)+":"+l.get(i)+" ");
			ergebnis= new Scanner(System.in).nextInt()-1;
			}
			return ergebnis;
			}
		
			public void haendlerInteresseFuerAktie(){
			if (aktien.size()>0 && haendler.size()>0){
			System.out.println("Welcher Haendler?");
			int h= listenelementWaehlen(haendler);
			System.out.println("Welche Aktie?");
			int a= listenelementWaehlen(aktien);
			haendler.get(h).neueAktie(aktien.get(a));
			}
			}
			public void aktienwertAendern(){
			if(!aktien.isEmpty()){
			System.out.println("Welche Aktie?");
			int a= listenelementWaehlen(aktien);
			System.out.print("Neuer Wert: ");
			aktien.get(a).setWert(new
			Scanner(System.in).nextInt());
			}
			}
	
     public static void main(String[] args) {
		new Main_8();
		}

}
