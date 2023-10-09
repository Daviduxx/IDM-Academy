package com.pizza.academy;

public class PizzaFunghi extends PizzaDecorator{
	
	private Ingrediente ingrediente;
	
	public PizzaFunghi(Pizza pizza, Ingrediente ingrediente) {
		super(pizza);
		this.ingrediente = ingrediente;
	}

	@Override
	public double prezzoIngrediente() {
		return 3;
	}

	@Override
	public String toString() {
		return "PizzaFunghi [ingrediente=" + ingrediente + ", prezzoIngrediente()=" + prezzoIngrediente()
				+ ", prezzo()=" + prezzo() + "]";
	}


	

}
