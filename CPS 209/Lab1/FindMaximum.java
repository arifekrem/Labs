import java.util.Scanner;

import javax.imageio.stream.IIOByteBuffer;
/*
 * This program finds the maximum number from a list of positive double numbers and prints it
 * 
 * For example, if the list is: 22.3 47 3.14 77.8 then the maximum is 77.8
 */
public class FindMaximum
{
   public static void main(String[] args)
   {
  	  String values = "32.5 217.3 12.98 63.44 77.4 185.2";
      Scanner in = new Scanner(values);
      
      //-----------Start below here. To do: approximate lines of code = 1
      // 1. Create a double variable called max and initialize it to -1.0
      // We know the list contains positive numbers only so every number in the list
      // is bigger than -1.0
      double max = -1.0;
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      
      // 2. Write a while loop that reads values from scanner in (see above). 
    	// Assume you do not know how many values there will be, so use the hasNextDouble() method  in the loop condition
    	// Inside the loop, read the next double number (NOTE: never call in.nextDouble() 
      // more than once inside the loop so use a temporary variable)
      // If this number is greater than max then update max to the value
      //-----------Start below here. To do: approximate lines of code = 4
      //
      
      while (in.hasNextDouble()) {
         Double i = in.nextDouble();
         if (max < i) {
               max = i;
         }
      }
      
      
      
      
      
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      System.out.println("The maximum value was: " + max);
      System.out.println("Expected:") ;
      System.out.println("The maximum value was: 217.3") ;
   }
}
