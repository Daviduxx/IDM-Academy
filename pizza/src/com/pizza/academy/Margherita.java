package com.pizza.academy;

public class Margherita extends Pizza {
	
	private double pomodoro;
	private double mozzarella;

	public Margherita() {
		super();
		this.pomodoro = 2;
		this.mozzarella = 3;
	}


	@Override
	public double prezzo() {
		return this.pomodoro + this.mozzarella;
	}


	@Override
	public String toString() {
		return "Margherita [pomodoro=" + pomodoro + ", mozzarella=" + mozzarella + ", prezzo()=" + prezzo() + "]";
	}
	

}
