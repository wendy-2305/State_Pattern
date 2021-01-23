package SWTTTT;

public class Abgemagert extends Zustand_6 {
	public Abgemagert() {
		zustand="Abgemagert";
	}

	@Override
	public Zustand_6 spielen() {
		// TODO Auto-generated method stub
		return new Verhungert();
	}

	@Override
	public Zustand_6 gassi() {
		// TODO Auto-generated method stub
		return new Verhungert();
	}

	@Override
	public Zustand_6 fuettern() {
		// TODO Auto-generated method stub
		return new Hungrig();
	}

	@Override
	public Zustand_6 ignorieren() {
		// TODO Auto-generated method stub
		return null;
	}

}
