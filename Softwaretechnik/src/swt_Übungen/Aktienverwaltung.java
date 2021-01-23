package swt_Übungen;
import java.util.ArrayList;

public class Aktienverwaltung {

  private String aktienname;
  private ArrayList<Haendlerinterface> haendler=new ArrayList<>();
  
protected Aktienverwaltung(String aktienname) {
	this.aktienname = aktienname;
}
  
public void anmelden(Haendlerinterface h) {
	
	haendler.add(h);
}

  public void benachrichtigen() {
	  for (Haendlerinterface i: haendler) {
		  i.aktualisieren(aktienname);
	  }
	
	}

public String getAktienname() {
	return aktienname;
}

public void setAktienname(String aktienname) {
	this.aktienname = aktienname;
}
  
  }
