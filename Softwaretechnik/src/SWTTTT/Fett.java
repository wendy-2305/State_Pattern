package SWTTTT;

public class Fett extends Zustand_6 {

	public Fett() {
		zustand="Fett";
	}
	@Override
	public Zustand_6 spielen() {
		
		return new Fitt();
	}

	@Override
	public Zustand_6 gassi() {
		
		return new Fitt();
	}

	@Override
	public Zustand_6 fuettern() {
		
		return new Geplatz();
	}

	@Override
	public Zustand_6 ignorieren() {
		return null;
	}

}
