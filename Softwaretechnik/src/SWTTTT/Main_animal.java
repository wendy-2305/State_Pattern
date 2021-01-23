package SWTTTT;
import java.util.Scanner;
public class Main_animal {
	public static void main (String[] args) {
		 Animal animal= new Animal();
		boolean a=true;
		while(a) {
		
		while(animal.getA()==Enum.LEBENSDIG) {
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
			animal.spielen();
			break;
		case 2:
			animal.gassi();
			break;
		case 3:
			animal.futtern();
			break;
		case 4:
			animal.ignorieren();
			break;
		}
		}
		a=false;
		animal.tostring2();
		
	}
}
}