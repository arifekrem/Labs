import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a method removeBadPairs that accepts an ArrayList of integers and removes any adjacent pair
 * of integers in the list if the left element of the pair is larger than the right element of the pair. 
 * Every pair's left element is an even-numbered index in the list, and every pair's right element is an odd index in the list.
 * For example, suppose a variable called list stores the following element values:
 * [3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1]
 * We can think of this list as a sequence of pairs: (3, 7), (9, 2), (5, 5), (8, 5), (6, 3), (4, 7), (3, 1). 
 * The pairs (9,2), (8, 5), (6, 3), and (3, 1) are "bad" because the left element is larger than the right one, so these pairs
 * should be removed. So the call of removeBadPairs(list); would change the list to store the following element values:
 * [3, 7, 5, 5, 4, 7]
 * If the list has an odd length, the last element is not part of a pair and is also considered "bad;" it should
 * therefore be removed by your method.
 * If an empty list is passed in, the list should still be empty at the end of the call. You may assume that the
 * list passed is not null. 
 * 
 * You may not use any additional arrays or arraylists to solve this problem!! 
 */


public class RemoveBadPairs2
{
	public static void main(String[] args)
	{
		int[] values = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < values.length; i++)
		{
			list.add(values[i]);
		}
		removeBadPairs(list);
		System.out.println(list);
		System.out.println("Expected:\n[3, 7, 5, 5, 4, 7]");

		int[] values2 = {8, 1, 9, 2, 1, 2, 3, 3, 7, 4, 5};
		list.clear();
		for (int i = 0; i < values2.length; i++)
		{
			list.add(values2[i]);
		}
		removeBadPairs(list);
		System.out.println(list);
		System.out.println("Expected:\n[1, 2, 3, 3]");
		list.clear();
		removeBadPairs(list);
		System.out.println(list);
		System.out.println("Expected:\n[]");

	}

	/*
	 *  remove "bad" pairs of numbers from a list of numbers
	 *  you may assume the given array list pairs is not null 
	 *  Follow the instructions at the top
	 *  NOTE: You may not use any other arrays or arraylists in this method other than pairs!!
	 *  You may use additional variables of other primitive types
	 */
	static void removeBadPairs(ArrayList<Integer> pairs)
	{
		//-----------Start below here. To do: approximate lines of code = 9
		//
		
		if (pairs.size() % 2 != 0) {
			pairs.remove(pairs.size() - 1);
		}

		for (int i = 0; i < pairs.size(); i += 2) {
			if (pairs.get(i) > pairs.get(i + 1)) {
				pairs.remove(i);
				pairs.remove(i);
				i -= 2;
			}
		}		

		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}