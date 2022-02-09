/*
 * 
 * Append one array list onto the end of another 
 * e.g. if the first array list contains  17 63 41 29 and the second contains 23 99 then
 * after the append the first array list should contain 17 63 41 29 23 99 
 * Difficulty: Easy
 */

import java.util.ArrayList;

public class AppendArrayLists 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int i;

		for (i = 0; i < 5; i++)
		{
			/* Initialize array list a to some values */
			a.add(i + 3);

		}
		System.out.print("a: ");
		for (i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) + " ");
		}
		System.out.println();


		for (i = 0; i < 3; i++)
		{
			/* Initialize array list b to some values */
			b.add(i + 2);
		}
		System.out.print("b: ");
		for (i = 0; i < b.size(); i++)
		{
			System.out.print(b.get(i) + " ");
		}
		System.out.println();


		// Append b to the end of a
		append(a, b);

		System.out.println("Result of append of a and b is: ");

		for (i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
		System.out.println("Expected:\n3 4 5 6 7 2 3 4");

		a.clear();
		for (i = 0; i < 4; i++)
		{
			/* Initialize array list a to some values */
			a.add(i + 7);

		}
		System.out.print("a: ");
		for (i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) + " ");
		}
		System.out.println();

		b.clear();
		System.out.print("b: ");
		for (i = 0; i < b.size(); i++)
		{
			System.out.print(b.get(i) + " ");
		}
		System.out.println();


		// Append b to the end of a
		append(a, b);

		System.out.println("Result of append of a and b is: ");

		for (i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
		System.out.println("Expected:\n7 8 9 10");
	}

	/**
            Append the given ArrayList b to the end of the given ArrayList a 
            @param integer ArrayList a
			@param integer ArrayList b
	 */
	public static void append(ArrayList<Integer> a, ArrayList<Integer> b)
	{
		//-----------Start below here. To do: approximate lines of code = 3
		// append the integer elements in ArrayList b to the end of ArrayList a
		// Hint: use a for loop that goes through each element of ArrayList b
		// Hint: google "java ArrayList" to see all the methods you can use. Use the add() method
		// Hint: the size() method tells you how many elements are stored in the array list			  
		
		for (int i = 0; i < b.size(); i++) {
			a.add(b.get(i));
		}
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}

