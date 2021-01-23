package SWTTTT;

public class Fitt extends Zustand_6 {
	
	public Fitt() {
		zustand="Fitt";
	}

	@Override
	public Zustand_6 spielen() {
		return new Hungrig();
	}

	@Override
	public Zustand_6 gassi() {
		return new Abgemagert();
	}

	@Override
	public Zustand_6 fuettern() {
		return new Fett();
	}

	@Override
	public Zustand_6 ignorieren() {
		
		return null;
	}

	@Override
	public String toString() {
		return zustand;
	}
	

	
}
