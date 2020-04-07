package decoratorPattern;

public class Chicken extends Pizza{

	public Chicken() {
		description = "Chicken Pizza";
	}

	@Override
	public double cost() {
		return 11.25;
	}
	

}
