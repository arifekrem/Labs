/**
   Practice using the iterator in a loop and possibly removing 
   elements from the list using the iterator.

   Use an iterator to remove all elements containing '3'.
   Expected output:

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
[1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 40, 41, 42, 44, 45, 46, 47, 48, 49, 50]
 */
import java.util.LinkedList ;
import java.util.ListIterator ;
import java.util.Scanner ;

public class LinkedListTester10
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>() ;
		for (int i = 1 ; i <= 50 ; i++) {
			list.add(i + "") ;
		}
		System.out.println(list) ;
		//-----------Start below here. To do: approximate lines of code = 4
		// 1-4. Use an iterator to remove all elements containing "3"
		
		LinkedList<String> toRemove = new LinkedList<String>();
		for (String s : list)
		{
			if(s.contains("3"))
			{
				toRemove.add(s);
			}
		}
		list.removeAll(toRemove);
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println(list) ;
		System.out.println("Expected:\n[1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 40, 41, 42, 44, 45, 46, 47, 48, 49, 50]");
	}
}