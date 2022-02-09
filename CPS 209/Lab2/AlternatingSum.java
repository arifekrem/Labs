/* 
 *  This program generates the alternating sum of double numbers stored in an array
 *  For example, if the array contains 5 3 8 4 then the alternating sum is:  5-3+8-4 = 6
 *  the elem = 5 is at index 0 in the array (even index), elem 3 is at index 1 (odd index) etc
 *  
 *  Difficulty: Easy
 */
public class AlternatingSum
{
   /**
      Computes the alternating sum of the values in an array list
      @param data an array list of values
      @return the alternating sum of the values in data
   */
   public static int alternatingSum(int[] data)
   {
  	  //-----------Start below here. To do: approximate lines of code = 1
  	  // Declare an integer variable sum to hold the sum and initialize it
  	  int sum = 0;
  	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      
      //-----------Start below here. To do: approximate lines of code = 5
      // Use a for loop to go through each integer element in the array data[]
      // if the element is in an even location in the array (i.e. index 0 2 4 6 8 ...) then add it to sum
      // else subtract it from sum
      
      for (int i = 0; i < data.length; i++) {
         if (i % 2 == 0) {
            sum += data[i];
         }
         else {
            sum -= data[i];
         }
      }
      
      
      
      
      
      
      
      
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      return sum;
   }

   public static void main(String[] args)
   {
      int[] data = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
      int total = alternatingSum(data);
      System.out.println("Alternating sum: " + total);
      System.out.println("Expected:\nAlternating sum: -2");
      
      int[] data1 = { 5, 3, 8, 4 };
      total = alternatingSum(data1);
      System.out.println("Alternating sum: " + total);
      System.out.println("Expected:\nAlternating sum: 6");
      
      int[] data2 = { 0 };
      total = alternatingSum(data2);
      System.out.println("Alternating sum: " + total);
      System.out.println("Expected:\nAlternating sum: 0");
   }
}