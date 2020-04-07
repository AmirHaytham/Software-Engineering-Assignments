package decoratorPattern;

public abstract class Pizza {
	String description = "Just 3agena";
	  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
