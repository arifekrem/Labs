/*
 * 
 * Append one integer array onto the end of another 
 * e.g. if the first array contains  17 63 41 29 and the second contains 23 99 then
 * after the append the first array should contain 17 63 41 29 23 99 
 * 
 */

public class AppendArrays 
{
	public static void main(String[] args)
	{
		int[] a = new int[5];
		int[] b = new int[3];
		int i;

		for (i = 0; i < 5; i++)
		{
			/* Initialize array list a to some values */
			a[i] = i + 3;
		}
		System.out.print("a: ");
		for (i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();


		for (i = 0; i < 3; i++)
		{
			/* Initialize array list b to some values */
			b[i] = i + 2;
		}
		System.out.print("b: ");
		for (i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();

		// Append b to the end of a
		int[] ab = append(a, b);

		System.out.println("Result of append of a and b is: ");
		for (i = 0; i < ab.length; i++)
		{
			System.out.print(ab[i] + " ");
		}
		System.out.println();
		System.out.println("Expected:\n3 4 5 6 7 2 3 4");

		// Append a to the end of b
		int[] ba = append(b, a);

		System.out.println("Result of append of b and a is: ");

		for (i = 0; i < ba.length; i++)
		{
			System.out.print(ba[i] + " ");
		}
		System.out.println();
		System.out.println("Expected:\n2 3 4 3 4 5 6 7");

	}

	/**

            Return a new array that contains the array elements from array a followed by the array elements of array b
            @param int[] a
			@param int[] b
	 */
	public static int[] append(int[] x, int[] y)
	{
		//-----------Start below here. To do: approximate lines of code = 6
		// append the integer elements in array y to the end of array x
		// Hint: first create a new array that can hold all of the integers in array x and array y
		// then use a for loop that goes through each element of array x and adds it to the new bigger array 
		// then use a for loop that goes through each element of array y and adds it to the end of the new bigger array
		
		int[] z = new int[x.length + y.length];

		for (int i = 0; i < x.length; i++) {
			if (z[i] == 0){
				z[i] = x[i];
			}
			else {
				z[y.length + i] = y[i];
			}
		}

		for (int i = 0; i < y.length; i++) {
			if (z[i] == 0){
				z[i] = y[i];
			}
			else {
				z[x.length + i] = y[i];
			}
		}
		
		return (z);
	

		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}

