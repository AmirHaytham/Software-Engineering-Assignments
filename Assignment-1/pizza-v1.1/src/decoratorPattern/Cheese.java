package decoratorPattern;

public class Cheese extends Pizza{

	public Cheese() {
		description = "Cheese Pizza";
	}

	@Override
	public double cost() {
		return 7.88;
	}

}
