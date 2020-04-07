//Give me 2-pizza with all toppings -Tomato, Pepper, Olive and Mushroom- u have 

package decoratorPattern;

public class Restaurant {
 
	public static void main(String[] args) {
		Pizza pizza = new Chicken();
		pizza = new Tomato(pizza);
		pizza = new Pepper(pizza);
		pizza = new Olive(pizza);
		pizza = new Mushroom(pizza);
		System.out.println(pizza.getDescription()
				+ " $" +pizza.cost());
		
		Pizza pizza2 = new Tuna();
		pizza2 = new Tomato(pizza2);
		pizza2 = new Pepper(pizza2);
		pizza2 = new Olive(pizza2);
		pizza2 = new Mushroom(pizza2);
		
		System.out.println(pizza2.getDescription()
				+ " $" + pizza2.cost());
	}

}
