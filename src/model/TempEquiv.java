package model;

public class TempEquiv {
	private int degF;
	private int degC;
	
	// constructors
	public TempEquiv(int f) {
		this.degF = f;
		this.degC = (f - 32) * 5 / 9;
	}
	
	public TempEquiv(int f, int c) {
		this.degF = (c * 9 / 5) + 32;
		this.degC = c;
	}

	public int getDegF() {
		return degF;
	}

	public int getDegC() {
		return degC;
	}
	
}
