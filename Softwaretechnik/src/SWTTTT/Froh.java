package SWTTTT;

public class Froh extends Zustand_6 {
	
	public Froh() {
		zustand="froh";
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
		
		return new Deprimiert();
	}

	@Override
	public String toString() {
		
		return zustand;
	}

}
