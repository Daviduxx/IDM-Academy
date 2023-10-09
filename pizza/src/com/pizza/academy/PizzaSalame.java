package com.pizza.academy;

public class PizzaSalame extends PizzaDecorator{
	
	private Ingrediente ingrediente;

	public PizzaSalame(Pizza pizza, Ingrediente ingrediente) {
		super(pizza);
		this.ingrediente = ingrediente;
	}

	@Override
	public double prezzoIngrediente() {
		return 2;
	}
	
//	@Override
//	public double prezzo() {
//		return  0;
//	}
	
	// In pizzaDecorator questo metodo è dichiarato final, quindi non è possibile sovrascriverlo

	@Override
	public String toString() {
		return "PizzaSalame [ingrediente=" + ingrediente + ", pizza=" + this.getPizza() + ", prezzoIngrediente()="
				+ prezzoIngrediente() + ", prezzo()=" + prezzo() + "]";
	}
	
	

}
