package decoratorPattern;

public class Restaurant {

	public static void main(String[] args) {
		Pizza pizza = new Chicken();
		System.out.println(pizza.getDescription()
				+ " $" +pizza.cost());
		
		Pizza pizza2 = new Tuna();
		pizza2 = new Tomato(pizza2);
		pizza2 = new Pepper(pizza2);
		System.out.println(pizza2.getDescription()
				+ " $" + pizza2.cost());
	}

}
