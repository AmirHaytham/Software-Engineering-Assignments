package decoratorPattern;

public class Olive extends ToppingDecorator{
	Pizza pizza;
	
	public Olive(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.description + ", With Olive";
	}
	
	@Override
	public double cost() {
		return .90 + pizza.cost();
	}
}