/**
 *
 * Removes all 0 elements from an integer ArrayList
 */
import java.util.ArrayList;

public class RemoveZeroes 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();

		// Add some integers to the array list
		a.add(14); a.add(0); a.add(19); a.add(3);
		a.add(15); a.add(0); a.add(18); a.add(0);
		a.add(44); a.add(0); a.add(51); a.add(78);
		// You can also create an Integer wrapper explicitly and add to the array list
		a.add(new Integer(83));

		// Print the array list - Note the use of the size() method and the get() method
		System.out.println("Before removing the 0 elements:");
		for (int i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) +  " ");
		}
		System.out.println();

		// Remove the 0 elements
		ArrayList<Integer> aNoZeros = removeZeros(a);

		// Print ArrayList a again to see new elements.
		System.out.println("After removing the 0 elements:");
		for (int i = 0; i < aNoZeros.size(); i++)
		{
			System.out.print(aNoZeros.get(i) +  " ");
		}
		System.out.println();
		System.out.println("Expected:\n14 19 3 15 18 44 51 78 83");
	}

  
	// return a new list that contains all the non zero elements of the list p
	public static ArrayList<Integer> removeZeros(ArrayList<Integer> p)
	{
		// Hint: Create a new empty integer array list and
		// only copy the non-zero numbers of the given array list p into it. 
		// Use a for loop
		//-----------Start below here. To do: approximate lines of code = 5
		//
		
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i) != 0) {
				newArray.add(p.get(i));
			}
		}

		return newArray;
		
		// Return the reference to the newly created array list
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
