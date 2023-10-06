package com.figure.academy;

public class Colore {
	
	private java.awt.Color c; 
	private int R;
	private int G;
	private int B;
	
	public Colore(int R, int G, int B) {
		this.c = new  java.awt.Color(R,G,B);
	}

	public int getR() {
		return c.getRed();
	}

	public int getG() {
		return c.getGreen();
	}

	public int getB() {
		return c.getBlue();
	}

	@Override
	public String toString() {
		return "Colore [R=" + getR() + ", G=" + getG() + ", B=" + getB() + "]";
	}
	
	
	
	

}
