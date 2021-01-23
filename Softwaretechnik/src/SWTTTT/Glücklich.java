package SWTTTT;

public class Glücklich extends Zustand_6 {

	public Glücklich() {
		zustand="Glücklich";
	}
	@Override
	public Zustand_6 spielen() {
		
		return new Glücklich();
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
