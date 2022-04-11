
import java.util.ArrayList;
import java.util.Scanner;

/**
   A class to read and calculate the average height of many people.
*/
public class AveragePersonHeights
{
   /**
      Calculates the average measure from a collection of Measurable object
      @param objects the objects
      @return the average measure of objects
   */
   public static double average(Measurable[] objects)
   {
  	  //-----------Start below here. To do: approximate lines of code = 6
  	  // loop through the array of Measurable objects and add their measure to a total
  	  // compute and return the average measure
  	  // Hint: check to see if the length of the array is > 0 first. If it is == 0, return 0.0
  	  
      double total = 0.0;
      if (objects.length == 0)
      {
         return 0.0;
      }
      else
      {
         for (int i = 0; i < objects.length; i++)
         {
            total += objects[i].getMeasure();
         }
		   return total / objects.length;
      }
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   public static void main(String[] args)
   {
      APerson[] people = new APerson[4];
      people[0] = new APerson("Larry", 65);
      people[1] = new APerson("Susan", 45);
      people[2] = new APerson("Joe", -45);
      people[3] = new APerson("", 0);
      System.out.println("The average height is: " + average(people));
      System.out.println("Expected:\nThe average height is: 16.25");
   }
}
