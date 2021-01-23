package swt_Übungen;

public class Wauzi {
	 Zustand A;
	 Zustand B;
	 Zustand C;
	 
	 public Wauzi() {
		 A= Zustand.LEBENDIG;
		 B=Zustand.FIT;
		 C=Zustand.FROH;
	 }
	 public void spielen() {
		 switch(B) {
		 case FETT:
			B=Zustand.FIT;
			break;
			
		 case FIT:
			 B=Zustand.HUNGRIG;
			 break;
		 
		 case HUNGRIG:
			 B=Zustand.ABGEMAGERT;
			 break;
		 
		 case ABGEMAGERT:
			 A=Zustand.VERHUNGERT;
			 break;
		 
		  }
		 switch(C) {
		 case DEPRIMIERT:{
			 C=Zustand.TRAURIG;
			 break;
		 }
		 case TRAURIG:{
			 C=Zustand.FROH;
			 break;
		 }
		 case FROH:{
			 C=Zustand.GLÜCKLICH;
			 break;
		 }
		 case GLÜCKLICH:{
			 C=Zustand.GLÜCKLICH;
			 break;
		 }
		 }
		 auswerten();
	 }
	 
	 public void gassi() {
		 switch(B) {
		 case FETT:{
			 B=Zustand.FIT;
			 break;
		 }
		 case FIT:{
			 B=Zustand.HUNGRIG;
			 break;
		 }
		 case HUNGRIG:{
			 B=Zustand.ABGEMAGERT;
			 break;
		 }
		 case ABGEMAGERT:{
			 A=Zustand.VERHUNGERT;
		 }
		 }
		 auswerten();
	 }
	 
	 public void fuettern() {
		 switch(B) {
		 case ABGEMAGERT:{
			 B=Zustand.HUNGRIG;
			 break;
		 }
		 case HUNGRIG:{
			 B=Zustand.FIT;
			 break;
		 }
		 case FIT:{
			 B=Zustand.FETT;
			 break;
		 }
		 case FETT:{
			 A=Zustand.GEPLATZT;
			 break;
		 }
		 }
		 auswerten();
	 }
	 
	 public void ignorieren() {
		 switch(C) {
		 case DEPRIMIERT:
			 A=Zustand.WEGGELAUFEN;
			 break;
			 case TRAURIG:
			 C=Zustand.DEPRIMIERT;
			 break;
			 case FROH:
			 C=Zustand.DEPRIMIERT;
			 break;
			 case GLÜCKLICH:
			 C=Zustand.FROH;
			 break;
			 }
          auswerten();
		 }
	 
	 public void auswerten() {
		 if(lebt())
		 System.out.println("DER HUND IST" + B + C);
		 else System.out.println("DER HUND IST" + A);
	 }
	 
	 public boolean lebt(){
		 return A==Zustand.LEBENDIG;
		 } 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

