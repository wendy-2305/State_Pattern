package SWTTTT;

public class Deprimiert extends Zustand_6 {

	public Deprimiert() {
		zustand= "Deprimiert";
	}

	@Override
	public Zustand_6 spielen() {
		// TODO Auto-generated method stub
		return new Traurig();
	}

	@Override
	public Zustand_6 gassi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zustand_6 fuettern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zustand_6 ignorieren() {
		// TODO Auto-generated method stub
		return new Weggelaufen();
	}

	

}
