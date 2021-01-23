package SWTTTT;

import java.util.Scanner;

public class Main_mon_chien {

	public static void main(String[] args) {
		Zustand_6 A= new Lebendig();
		Zustand_6 B= new Fitt();
		Zustand_6 C= new Froh();
			boolean a=true;
			while(a) {
			if(B!= null && C!= null) {
			while(B.toString() != "Geplatz" && B.toString()!= "Verhungert" && C.toString()!= "Weggelaufen" ) {
				System.out.println("was wollen sie mit wauzi machen?\n" +
						"(0)verschenken \n" +
						"(01)mit ihm spielen \n" + "(02) mit ihm gassi gehen\n" +"(03)ihm füttern\n" + "(04)ihn ignorieren und lernen"
						);
				int value= new Scanner(System.in).nextInt();
				
				
			switch(value) {
			case 0:
		       a=false;
		       System.out.println("adios wauzi");
		       break;
			case 1:
				B=B.spielen();
				C=C.spielen();
				System.out.println("Der Hund ist" + B.toString()+ "und" + C.toString());
				break;
			case 2:
				B=B.gassi();
				C=C.gassi();
				System.out.println("Der Hund ist" + B.toString()+ "und" + C.toString());
				break;
			case 3:
				B=B.fuettern();
				C=C.fuettern();
				System.out.println("Der Hund ist" + B.toString()+ "und" + C.toString());
				break;
			case 4:
				B=B.ignorieren();
				C=C.ignorieren();
				System.out.println("Der Hund ist" + B.toString()+ "und" + C.toString());
				break;
			}
			}
			a=false;
			
		}
			
			System.out.println("Adios  mon wauzi");
			a= false;
			}
	}

}
