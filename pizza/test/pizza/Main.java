package pizza;

import com.pizza.academy.Ingrediente;
import com.pizza.academy.Margherita;
import com.pizza.academy.PizzaFunghi;
import com.pizza.academy.PizzaSalame;

public class Main {

	public static void main(String[] args) {
		
		Ingrediente i1 = new Ingrediente("Salame");
		Ingrediente i2 = new Ingrediente("Funghi");
		Ingrediente i3 = new Ingrediente("Prosciutto");
		
		Margherita m = new Margherita();
		System.out.println(m);
		
		PizzaSalame ps = new PizzaSalame(m, i1);
		System.out.println(ps);
		
		PizzaFunghi pf = new PizzaFunghi(ps, i2);
		System.out.println(pf);
	}

}
