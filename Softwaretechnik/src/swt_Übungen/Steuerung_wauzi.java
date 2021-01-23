package swt_Übungen;

import java.util.Scanner;
public class Steuerung_wauzi {
	public Wauzi wauzi;
	
	public Steuerung_wauzi() {
		int eingabe=-1;
		wauzi= new Wauzi();
		
		while(eingabe!=0 && wauzi.lebt()) {
			System.out.println("was wollen sie mit wauzi machen? \n"
				+"(0)verschenken \n"
				+"(1)mit ihm spielen \n"
				+"(2)mit ihm Gassi gehen \n"
				+"(3)ihn fuettern \n"
				+"(4)ihn ignorieren und lernen \n"); eingabe=new Scanner(System.in).nextInt();
			
		}
		switch(eingabe) {
		case 1:{
			wauzi.spielen();
			break;
		}
		case 2:{
			wauzi.gassi();
			break;
		}
		case 3:{
			wauzi.fuettern();
			break;
		}
		case 4:{
			wauzi.ignorieren();
			break;
		}
		
		}
	}
	public static void main(String[] args) {
		new Steuerung_wauzi();
		}

}
