/*
 * This program searches a 2D array for the first occurrence of a target value
 * e.g. if the 2D array is
 * 3  22 85 43 91
 * 54 38 74 1  13
 * 65 27 99 17 7
 * 
 *  and the target value is 17, then the program returns the row (2) and column (3)
 *  where 17 is stored
 */

public class Search2DArray
{
	/**
		Searches a 2D array for the first occurrence of a target value
		@param values two-dimensional array to be searched
		@param target number to be searched for
		@return an integer array of length 2 containing the (zero-indexed) row and column
				index of the target, or return a null if the target is not found in the array
	 */
	public static int[] findValue(int[][] values, int target)
	{
		//-----------Start below here. To do: approximate lines of code = 13
		// Write the method
		
		for (int a = 0; a < values.length; a++) {
			for (int b = 0; b < values[a].length; b++) {
			    if (values[a][b] == target) {
					
					return new int[] {a,b};
			    }   
			}   
		}

		return null;
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	public static void main(String[] args)
	{
		int[][] array = { {0, 4, 5}, {2, 4, 9}, {0, 2, 7}, {7, 3, 6} };

		for (int target = 0; target < 10; target++)
		{
			int[] location = findValue(array, target);
			System.out.print(target);
			if (location == null)
			{
				System.out.println(" not found");
			}
			else
			{
				System.out.println(" found at row " + location[0]	 + " and column " + location[1]);
			}
		}
		System.out.println("Expected:\n0 found at row 0 and column 0\n1 not found\n2 found at row 1 and column 0\n3 found at row 3 and column 1");
		System.out.println("4 found at row 0 and column 1\n5 found at row 0 and column 2\n6 found at row 3 and column 2");
		System.out.println("7 found at row 2 and column 2\n8 not found\n9 found at row 1 and column 2");
	}
}
