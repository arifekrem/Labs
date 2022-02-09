import javax.lang.model.element.Element;

/* 
 * This program determines if all integer elements in a two-dimensional array are identical
 *  
 * For example, in the 2D array ( 3 rows X 4 columns) :
 * 
 *  7 7 7 7
 *  7 7 7 7
 *  7 7 7 7
 * 
 *  all elements are equal to 7 
 *  
 *  In the 2D array (3 rows X 2 columns):
 *  
 *  3 3
 *  3 5
 *  3 3
 *  
 *  one element is 5 and the others are 3 therefore the array is not all equal
 */
public class AllEqual2D
{
   /**
		Determines if all integer elements in a two-dimensional array are identical
		@param values two-dimensional array to be examined
		@return true if all values identical, false otherwise
   */
   public static boolean equalValues(int[][] values)
   {
     boolean ok = true;
  	
  	 
  	 //-----------Start below here. To do: approximate lines of code = 1
  	 // Declare an int variable called elem and initialize it to values[0][0];
  	   int elem = values[0][0];
  	 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      
      //-----------Start below here. To do: approximate lines of code = 6
      // Use a nested for loop (i.e. two for loops, one inside the other) that goes through
      // each integer element stored in the 2D array values[][] and compares each to elem
      // As soon as one comparison is false then return false. If all comparisons are true then
      // the loops finish and outside of the nested loops, return true.
      // Hint: values.length stores the number of rows in the 2D array, values[i].length stores the 
      // number of elements in row i
      
      for (int a = 0; a < values.length; a++) {
         for (int b = 0; b < values[a].length; b++) {
            if (values[a][b] != elem) {
               return false;//ok = false;
            }   
         }   
      }
      return true;
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   public static void main(String[] args)
   {
      int[][] array1 = { {0, 4, 5}, {2, 4, 9}, {0, 2, 7}, {7, 3, 6} };
      int[][] array2 = { {4, 4, 4}, {4, 4, 4}, {4, 4, 4}, {4, 4, 4} };
            
      if (equalValues(array1))
      {
         System.out.println("All values in array1 are identical");
      }
      if (equalValues(array2))
      {
         System.out.println("All values in array2 are identical");
      }
      System.out.println("Expected:\nAll values in array2 are identical");
   }
}
