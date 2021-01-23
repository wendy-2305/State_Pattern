package SWTTTT;

public class Animal {
  Enum A=Enum.LEBENSDIG;
  Enum B= Enum.FITT;
  Enum C= Enum.FROH;
  
  public void spielen() {
	 switch(B) {
	 case FETT:
		 B=Enum.FITT;
		 break;
	 case FITT:
		 B=Enum.HUNGRIG;
		 break;
	 case HUNGRIG:
		 B=Enum.ABGEMAGERT;
		 break;
	 case ABGEMAGERT:
		 A=Enum.VERHUNGERT;
		 break;
		 
	 }
	 switch(C) {
	 case DEPRIMIERT:
		 C=Enum.TRAURIG;
		 break;
	 case TRAURIG:
		 C=Enum.FROH;
		 break;
	 case FROH:
		 C=Enum.GLÜCKLICH;
		 break;
	 case GLÜCKLICH:
		 C=Enum.GLÜCKLICH;
		 break;
	 }
	 tostring();
  }
  
  public void gassi() {
	  switch(B) {
		 case FETT:
			 B=Enum.FITT;
			 break;
		 case FITT:
			 B=Enum.HUNGRIG;
			 break;
		 case HUNGRIG:
			 B=Enum.ABGEMAGERT;
			 break;
		 case ABGEMAGERT:
			 A=Enum.VERHUNGERT;
			 break;
		
		 }
	  tostring();
	  }
  
  public void futtern() {
	  switch(B) {
		 case FETT:
			 A=Enum.GEPLATZ;
			 break;
		 case FITT:
			 B=Enum.FETT;
			 break;
		 case HUNGRIG:
			 B=Enum.FITT;
			 break;
		 case ABGEMAGERT:
			 B=Enum.HUNGRIG;
			 break;
				
		 } tostring();
  }
  public void ignorieren() {
	  switch(C) {
		 case GLÜCKLICH:
			 C=Enum.FROH;
			 break;
		 case FROH:
			 C=Enum.DEPRIMIERT;
			 break;
		 case DEPRIMIERT:
			 A=Enum.WEGGELAUFEN;
			 break;
		 case TRAURIG:
			 C=Enum.DEPRIMIERT;
			 break;
		
		 } tostring();
}
  public void tostring() {
	  System.out.println("der Hund ist" + B + "und" + C);
  }
  
  public void tostring2() {
	  System.out.println("der Hund ist" +A );
  }

public Enum getA() {
	return A;
}

public void setA(Enum a) {
	A = a;
}

public Enum getB() {
	return B;
}

public void setB(Enum b) {
	B = b;
}

public Enum getC() {
	return C;
}

public void setC(Enum c) {
	C = c;
}
  }

