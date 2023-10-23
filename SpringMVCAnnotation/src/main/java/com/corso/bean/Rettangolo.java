package com.corso.bean;


import org.springframework.stereotype.Component;

@Component
public class Rettangolo {
	
	private double a; 
	private double b;
	
	public Rettangolo(double base, double altezza) {
		super();
		this.a = base;
		this.b = altezza;
	}
	@Override
	public String toString() {
		return "Rettangolo [a=" + a + ", b=" + b + "]";
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	} 
	public double area() {
		return this.b*this.a;
	}
	
	
}
