import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/**
   This problem illustrates the method list.listIterator(n), which returns
   a list iterator where the iterator starts after the n'th element in the 
   list.  It also uses hasPrevious to check for a previous item and
   previous() for moving the iterator backwards in the list and returning the
   element traversed.

   The effect is to print the elements in reverse order.
   The expected output is 

98 96 94 92 90 88 86 84 82 80 78 76 74 72 70 68 66 64 62 60 58 56 54 52 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0 

*/
public class LinkedListTester7
{
	public static void main(String [] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0 ; i < 100 ; i = i + 2)
		    list.add(i) ;
		//-----------Start below here. To do: approximate lines of code = 3
		// 1. make a list iterator that starts at the end of the list ; 
		// Hint: lookup the documentation for the listIterator() method - you can pass to it a starting point
		ListIterator<Integer> listIterator = list.listIterator(list.size());
		//2.  while hasPrevious ; 
		while (listIterator.hasPrevious())
		{
		    //3. print what is returned by previous() followed by a blank without a newline
			System.out.print(listIterator.previous() + " ");
		}
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println() ;
		System.out.println("Expected:\n98 96 94 92 90 88 86 84 82 80 78 76 74 72 70 68 66 64 62 60 58 56 54 52 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0");
	}
}
