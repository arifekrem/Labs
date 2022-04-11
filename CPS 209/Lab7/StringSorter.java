import java.util.Collections ;
import java.util.ArrayList ;
import java.util.Arrays ;
/**
   Sorting a list of strings alphabetically, using the Collections sort method.

   The Comparable interface is a commonly used interface in Java. Look
   up the Comparable interface in the API documentation.  It requires 
   a compareTo method, such that

   a.compareTo(b)

   returns

   1 if a is larger than b
   -1 if a is smaller than b
   0 if a and b are the same 

   Since compareTo determines which of two objects is larger, this
   interface is used to decouple sorting methods from the classes that
   are sorted.  The String class implements Comparable<String>, so we
   can sort strings alphabetically using a sort method that sorts 
   Comparable objects.
   The Collections.sort method is one such method.

   Here we make a list of strings and print the list and then print it
   after sorting.

 */
public class StringSorter
{
	public static void main(String[] args)
	{
		String[] array = {"blue", "red", "yellow",  "cyan",  "orange",  "purple",  "mauve",  "brown"} ;
		ArrayList<String> list = new ArrayList<String>() ;

		for (int i = 0; i < array.length; i++)
			list.add(array[i]);	

		System.out.println("--------------original array/list:") ; 
		System.out.println(Arrays.toString(array));
		
		
		//-----------Start below here. To do: approximate lines of code = 1
		//-----------Start below here. To do: approximate lines of code = 1
		// 1. sort the array called array using Arrays.sort
		Arrays.sort(array);
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println("-------------sorted  array:") ; //
		System.out.println(Arrays.toString(array));
		
		System.out.println("Expected:\n[blue, brown, cyan, mauve, orange, purple, red, yellow]");
		
		//-----------Start below here. To do: approximate lines of code = 1
		//-----------Start below here. To do: approximate lines of code = 1
		// 2. Sort the arrayList called list using Collections.sort()
		Collections.sort(list);
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println("-------------sorted  list:") ; //
		System.out.println(list);
		
		System.out.println("Expected:\n[blue, brown, cyan, mauve, orange, purple, red, yellow]");
	}
}
