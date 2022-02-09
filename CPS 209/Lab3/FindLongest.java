import java.util.List;
import java.util.ArrayList;

/*
 * 
 *  This program loops through an array list of strings and finds the longest string
 */
public class FindLongest
{
	/*
	 * Given the array list of strings, return the longest string
	 */
	public static String findLongest(ArrayList<String> list)
	{
		//-----------Start below here. To do: approximate lines of code = 8
		// loop through the list of strings and check to see if 
		// the string length is > the current longest string. If so, update the
		// longest string length. Be sure to create a variable to hold the longest string itself
		// as well as its length
		// Note: the method should return the empty string if the arraylist is empty
		
		String longestStr = "";
		int lenLongest = 1;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() >lenLongest) {
				longestStr = list.get(i);
				lenLongest = list.get(i).length();
			}
		}
		return (longestStr);
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	public static void main(String[] args)
	{
		ArrayList<String> elems = new ArrayList<String>();
		String[] words = {"singapore", "cattle", "metropolitan", "turnstile", "city", "deviation"};
		for (int i = 0; i < words.length; i ++)
		{
			elems.add(words[i]);
		}
		System.out.println(findLongest(elems));
		System.out.println("Expected:\nmetropolitan");
		elems.clear();
		System.out.println(findLongest(elems));
		System.out.println("Expected:\n");
	}
}
