package SWTTTT;

public class Gl�cklich extends Zustand_6 {

	public Gl�cklich() {
		zustand="Gl�cklich";
	}
	@Override
	public Zustand_6 spielen() {
		
		return new Gl�cklich();
	}

	@Override
	public Zustand_6 gassi() {
		
		return null;
	}

	@Override
	public Zustand_6 fuettern() {
		
		return null;
	}

	@Override
	public Zustand_6 ignorieren() {
		// TODO Auto-generated method stub
		return new Froh();
	}

}
