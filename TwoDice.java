import java.util.Scanner;

// Filename: TwoDice.java
// Author: 
// Date: 
// Application that generates two Die objects and displays their value at the command prompt.

public class TwoDice{
	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		boolean noMore = true;    
		
		while(noMore == true) {
		// Create two Die objects
		Die die1 = new Die();
		Die die2 = new Die();
		
		// Save the Die values in variables
		int value1 = die1.getValue();
		int value2 = die2.getValue();
		String choice;
		
		
		// Output the values through println
		System.out.println("Die 1 value: " + value1);
		System.out.println("Die 2 value: " + value2);
		
		// Decide what the outcome of the two dice should be
		if(value1 == value2){
			System.out.println("The dice are a match!");
		
		}else{
			if(value1 > value2){
				System.out.println("Die 1 is the winner!");
				System.out.println("Would you like to continue? (yes or no)");
    			choice = kbd.nextLine();
    			if(choice.equals("no")) {
					noMore = false;
				
			}else{
				System.out.println("Die 2 is the winner!");
				System.out.println("Would you like to continue? (yes or no)");
    			choice = kbd.nextLine();
    			if(choice.equals("no")) {
        			noMore = false;
    			}
			}	
		}
		
	}
  }
 }
}


