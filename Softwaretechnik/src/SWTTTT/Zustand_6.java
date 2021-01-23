package SWTTTT;

public abstract class Zustand_6  {
	
	String zustand;
	public abstract Zustand_6 spielen();
	public abstract Zustand_6 gassi();
	public abstract Zustand_6 fuettern();
	public abstract Zustand_6 ignorieren();
	public String toString() {
		return zustand;
	};

}
