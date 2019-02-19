// Filename: Die.java
// Author: 
// Date: 
// Class defines a single 6-sided die, generating a random value from 1 to 6. Also contains a method to access that value.

public class Die{
	// Instance variables for the Die class
	private int randomValue;
	private static final int HIGHEST_DIE_VALUE = 6;
	private static final int LOWEST_DIE_VALUE = 1;
	
	// Constructor method
	public Die(){
		randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	// Accessor method to get a die's value (getter)
	public int getValue(){
		return randomValue;
	}
	
}