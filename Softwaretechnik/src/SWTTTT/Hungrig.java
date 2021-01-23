package SWTTTT;

public class Hungrig extends Zustand_6 {
	public Hungrig() {
		zustand="Hungrig";
	}

	@Override
	public Zustand_6 spielen() {
		// TODO Auto-generated method stub
		return new Abgemagert();
	}

	@Override
	public Zustand_6 gassi() {
		// TODO Auto-generated method stub
		return new Abgemagert();
	}

	@Override
	public Zustand_6 fuettern() {
		// TODO Auto-generated method stub
		return new Fitt();
	}

	@Override
	public Zustand_6 ignorieren() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
