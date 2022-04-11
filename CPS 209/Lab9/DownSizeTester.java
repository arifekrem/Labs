import java.util.Iterator;
import java.util.LinkedList ;
import java.util.ListIterator ;
/**
   Based on a Big Java problem

   You have to write a static method that removes every other 
   element from a linked list.  
   Expected output:

[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
[Monday, Wednesday, Friday]
[Wednesday]
[]
 */

public class DownSizeTester
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>() ;
		list.add("Sunday") ;
		list.add("Monday") ;
		list.add("Tuesday") ;
		list.add("Wednesday") ;
		list.add("Thursday") ;
		list.add("Friday") ;
		list.add("Saturday") ;
		System.out.println(list) ;
		downsize(list) ;
		System.out.println(list) ;
		downsize(list) ;
		System.out.println(list) ;
		downsize(list) ;
		System.out.println(list) ;
		System.out.println("Expected:\n[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]");
		System.out.println("[Monday, Wednesday, Friday]");
		System.out.println("[Wednesday]");
		System.out.println("[]");
	}
	/**
       Removes the first, third, fifth, ... elements from a list (i.e. the elements at the odd indices).
       @param list a linked list of String elements 
	 */
	public static void downsize(LinkedList<String> list) 
	{
		//-----------Start below here. To do: approximate lines of code = 6
		// Remove the first, third, fifth, ... elements from list
		
			for(int i = 0; i < list.size(); i++)
			{
				list.remove(i);
			}
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
