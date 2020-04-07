package decoratorPattern;

public class Tomato extends ToppingDecorator{
	Pizza pizza;
	
	public Tomato(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.description + ", With Tomato";
	}

	@Override
	public double cost() {
		return 0.30 + pizza.cost();
	}

}
