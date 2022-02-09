import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a method removeBadPairs that accepts an ArrayList of integers and removes any adjacent pair
 * of integers in the list if the left element of the pair is larger than the right element of the pair. 
 * Every pair's left element is an even-numbered index in the list, and every pair's right element is an odd index in the list.
 * For example, suppose arraylist called list stores the following element values:
 * [3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1]
 * We can think of this list as a sequence of pairs: (3, 7), (9, 2), (5, 5), (8, 5), (6, 3), (4, 7), (3, 1). 
 * The pairs (9,2), (8, 5), (6, 3), and (3, 1) are "bad" because the left element is larger than the right one, so these pairs
 * should be removed. So the call of removeBadPairs(list); would change the list to store the following element values:
 * [3, 7, 5, 5, 4, 7]
 * If the list has an odd length, the last element is not part of a pair and is also considered "bad;" it should
 * therefore be removed by your method.
 * If an empty list is passed in, the list should still be empty at the end of the call. 
 * You may assume that the list passed is not null. 
 */


public class RemoveBadPairs
{
	public static void main(String[] args)
	{
		int[] values = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < values.length; i++)
		{
			list.add(values[i]);
		}

		list = removeBadPairs(list);
		System.out.println(list);
		System.out.println("Expected:\n[3, 7, 5, 5, 4, 7]");

		int[] values2 = {8, 1, 9, 2, 1, 2, 3, 3, 7, 4, 5};
		list.clear();
		for (int i = 0; i < values2.length; i++)
		{
			list.add(values2[i]);
		}
		list = removeBadPairs(list);
		System.out.println(list);
		System.out.println("Expected:\n[1, 2, 3, 3]");
		list.clear();
		list = removeBadPairs(list);
		System.out.println(list);
		System.out.println("Expected:\n[]");

	}
	/*
	 * Loop through a list of integers (pairs) and remove "bad" pairs
	 * Return a new list containing only "good" pairs
	 */
	static ArrayList<Integer> removeBadPairs(ArrayList<Integer> pairs)
	{
		//-----------Start below here. To do: approximate lines of code = 8
		//
		//1. Create a new array list of integers, initially empty
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		//2. Check to see if the given array list pairs has an odd number of integer elements
		//   If so, remove the last integer
		
		if (pairs.size() % 2 != 0) {
			pairs.remove(pairs.size() - 1);
		}
		
		
		//3. use a for loop to go through the given array list pairs
		// if a pair is "good" add the pair of numbers to the new list
		// Hint: increment your loop index by 2 and make sure your loop index is < size()-1 
		
		for (int i = 0; i < pairs.size() - 1; i += 2) {
			if (pairs.get(i) <= pairs.get(i + 1)) {
				newList.add(pairs.get(i));
				newList.add(pairs.get(i + 1));
			}
		}
		
		//4. return a reference to the new list of "good" pairs
		return (newList);
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}	
