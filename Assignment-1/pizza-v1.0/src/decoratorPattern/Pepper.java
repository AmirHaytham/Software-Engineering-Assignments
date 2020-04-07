package decoratorPattern;

public class Pepper extends ToppingDecorator{

	Pizza pizza;
	
	public Pepper(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,With Pepper";
	}

	@Override
	public double cost() {
		return 0.08 + pizza.cost();
	}

}
