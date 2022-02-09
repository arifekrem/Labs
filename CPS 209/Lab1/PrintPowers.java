/*
 * This program calculates the powers of 2 from power = 0 to power = 20 and adds them together
 * For example, to add all powers of 2 from power = 2 to power = 4 then the result is:
 * 2^2 = 4 plus 2^3 = 8 plus 2^4 = 16 so the final result is: 4+8+16 = 28
 * 
 * 
 */
public class PrintPowers 
{
	public static void main(String[] args)
	{
		//-----------Start below here. To do: approximate lines of code = 1
		// Create an integer variable called sum and initialize it to 0
		int sum = 0;
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		
	  //-----------Start below here. To do: approximate lines of code = 2
	  // Write a for loop that counts from 0 to 20 (inclusive). Declare and use a variable called power as the loop variable
	  // Inside the loop use the Math.pow(double a, double b) function compute 2^power and add it to the sum variable
	  for (int power = 0; power <= 20; power++){
		sum += Math.pow(2, power);
	  }
	  
	  
	  
	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	  System.out.println("Sum = " + sum ) ;
	  System.out.println("Expected: ") ;
	  System.out.println("Sum = " + 2097151) ;
	 
	
    //-----------Start below here. To do: approximate lines of code = 6
    // Reset sum variable to 0 and then repeat the loop as above
    // Inside the loop, instead of calling Math.pow, use an inner loop to calculate 2^power and add the result to the sum variable
	  sum = 0;
	  sum++;
	  for (int power = 0; power < 20; power++){
		sum *= 2;
	  }
	  sum *= 2;
	  sum--;
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    System.out.println("Sum = " + sum ) ;
    System.out.println("Expected: ") ;
    System.out.println("Sum = " + 2097151) ;
  }
}