import java.util.ArrayList;
import java.util.Scanner;
/*
 * This program finds the largest and smallest numbers in an arraylist of integers
 */
public class FindMinAndMax
{
	public static void main(String[] args)
	{
		String data = "45 72 35 90 12 3 204 317 684 23 44";
		ArrayList<Integer> values = new ArrayList<Integer>();

		Scanner in = new Scanner(data);
		while (in.hasNextInt())
		{
			values.add(in.nextInt());
		}

		// Find the largest and smallest value in array list values
		int largest  = values.get(0);
		int smallest = values.get(0);
		//-----------Start below here. To do: approximate lines of code = 5
		// Loop through the remaining integer elements in values and update largest and smallest
		

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) > largest) {
				largest = values.get(i);
			}
			else if (values.get(i) < smallest) {
				smallest = values.get(i);
			}
		}
	
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println("Largest = " + largest + " Smallest = " + smallest);
		System.out.println("Expected:\nLargest = 684 Smallest = 3");
	}
}


