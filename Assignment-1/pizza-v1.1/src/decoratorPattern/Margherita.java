package decoratorPattern;

public class Margherita extends Pizza{

	public Margherita() {
		description = "Margherita Pizza";
	}

	@Override
	public double cost() {
		return 8.00;
	}

}
