/*
 * Abstract class for all beverages.
 * Includes a description and a cost amount 
 */
public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() 
	{
		return description;
	}

	public abstract double cost();

}
