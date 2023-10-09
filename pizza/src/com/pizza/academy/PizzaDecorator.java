package com.pizza.academy;

public abstract class PizzaDecorator extends Pizza{
	
	// questa classe è astratta perché non vogliamo implementazioni di questa classe
	// inoltre il metodo prezzoIngrediente() deve essere astratto, perché vogliamo che
	// venga implementato dai singoli decoratori
	
	private Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	public Pizza getPizza() {
		return pizza;
	}

	@Override
	public final double prezzo() { // la keyword final è fondamentale
		return pizza.prezzo() + prezzoIngrediente();		// senza si potrebbe traznquillamente sovrascrivere questo metodo, facendo ritornare 0, ad esempio
	} 								// senza questa accortezza si possono potenzialmente creare moltissimi problemi
	
	
	protected abstract double prezzoIngrediente();
	// questo metodo è definito protected perché sfrutta il design pattern template method.
	// con protected si evita che che il metodo venga implementato in maniera inaspettata da classi non figlie,
	// in questo modo si sfrutta l'incapsulamento, e le classi figlie sono libere di implementare il metodo personalizzando una porzione dell'algoritmo, senza però dover reimplementare l'intero metodo, evitando la ridondanza
}
