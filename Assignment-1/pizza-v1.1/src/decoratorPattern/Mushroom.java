package decoratorPattern;

public class Mushroom extends ToppingDecorator{
	Pizza pizza;
	
	public Mushroom(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.description + ", With Mushroom"; 
	}
	
	@Override
	public double cost() {
		return 1.30 + pizza.cost(); 
	}
	
}