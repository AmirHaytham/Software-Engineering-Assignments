package decoratorPattern;

public class Tuna extends Pizza{

	public Tuna() {
		description = "Tuna Pizza";
	}

	@Override
	public double cost() {
		return 9.50;
	}

}
