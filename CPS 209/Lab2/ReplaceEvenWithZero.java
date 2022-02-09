/**
  Replace even numbers in an integer array with 0 
  Difficulty: Easy
*/
public class ReplaceEvenWithZero 
{
	public static void main(String[] args)
	{
	   int[]a = new int[]{14, 2, 19, 3, 15, 22, 18, 7, 44, 39, 51, 78} ;

	   // Print array a
	   System.out.println("Before replacing even numbers with 0:");
	   for (int i = 0; i < a.length; i++)
	   {
	      System.out.print(a[i] +  " ");
	   }
	   System.out.println();
	   	   
	   // Replace the even elements.
	   replaceEven(a);

	   // Print array a again to see new elements.
	   System.out.println("After replacing even numbers with 0:");
	   for (int i = 0; i < a.length; i++)
	   {
	      System.out.print(a[i] +  " ");
	   }
	   System.out.println();
	   System.out.println("Expected:\n0 0 19 3 15 0 0 7 0 39 51 0");
	}
    /**
       Replace the even elements in the given array with 0 
       @param arr the array to use for the replacements
       
     */
	public static void replaceEven(int[] arr)
	{
	   //-----------Start below here. To do: approximate lines of code = 2
	   // Write a for loop to go through each element, determine if it is even
	   //If so, replace with 0. Hint: use the modulus operator % to determine if an integer is even
	   
	   for (int i = 0; i < arr.length; i++) {
	
	      if (arr[i] % 2 == 0) // Number is even
		  	{
				arr[i] = 0;  
			}	
	   }
		
	   
	   
	   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
