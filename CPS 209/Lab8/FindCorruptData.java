import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FindCorruptData
{
	/**
		Reads a set of floating-point values from a string. The first number is an integer that indicates how
		many floating point numbers follow. Some of the floating point numbers may be corrupt. This program uses exceptions
		to count the number of bad floating (i.e. double) numbers and prints them.
	 */
	public static void printCorruptDataValues()
	{
		String numbers = "6 3.14 7.25 8,23 6.99 9.2w 6.34";
		Scanner console = new Scanner(numbers);
    int numDoubles = console.nextInt();
    		
		//-----------Start below here. To do: approximate lines of code = 5
		// Use a for loop to loop through numDoubles double number strings.
		// Get the next double number string using the scanner then use Double.parseDouble() to determine 
    // if the current double number string is corrupt in some way. If it is, print "Corrupt Double Number: " 
    // followed by the number string.
    // Hint: use try{..} catch{..} such that you catch any NumberFormatException and print out the bad double number
    // making use of the getMessage() method of the exception class to print the corrupt number string.
	
		for (int i = 0; console.hasNext(); i++)
		{
			try 
			{
				Double.parseDouble(console.next());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Corrupt Double Number: " + e.getMessage()); 
			}
		}
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	public static void main(String[] args)
	{
		printCorruptDataValues();
		System.out.println("Expected:");
		System.out.println("Corrupt Double Number: For input string: \"8,23\"");
		System.out.println("Corrupt Double Number: For input string: \"9.2w\"");
	}
}
