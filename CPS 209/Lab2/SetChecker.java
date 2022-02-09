/**
  Given two sets of strings (stored in two arrays), determine if they are the same set 
  i.e. contain the same set of strings
*/
public class SetChecker
{
   
   public static void main(String[] args)
   {
      String[] setA = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      String[] setB = {"January", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

      System.out.print("The elements of the arrays setA and setB ");

      if (!sameSet(setA, setB))
      {
         System.out.print("do not ");
      }
      System.out.println("form the same set.");
      System.out.println("Expected:\nThe elements of the arrays setA and setB do not form the same set." );
      
      
      String[] setWinterA = {"Jan", "Feb", "Mar", "Apr"};
      String[] setWinterB = {"Jan", "Mar", "Apr", "Feb"};

      System.out.print("The elements of the arrays setWinterA and setWinterB ");

      if (!sameSet(setWinterA, setWinterB))
      {
         System.out.print("do not ");
      }
      System.out.println("form the same set.");
      System.out.println("Expected:\nThe elements of the arrays setWinterA and setWinterB form the same set." );
   }
   
      
   public static boolean sameSet(String[] a, String[] b)
   {
      for (int i = 0; i < a.length; i++)
      {
         if (!isIn(a[i], b))
         {
            return false;
         }
      }
      for (int i = 0; i < b.length; i++)
      {
         if (!isIn(b[i], a))
         {
            return false;
         }
      }
      return true;
   }
   
   /**
   Determines if a string is part of a set of strings
   @param String elem - the element to search for
   @param String[] set - the set of strings stored in an array
   @return true or false
   */
   public static boolean isIn(String elem, String[] set)
   {
	   //-----------Start below here. To do: approximate lines of code = 4
	   // go through the parameter array named set and check if an element (string) in the array
	   // is equal to the given string parameter elem. If elem is in the set, return true
	   // After checking through the entire set, if the method hasn't already returned, then return false
	   // Hint: don't forget to use .equals() method to compare two strings!!
	   
	   for (int i = 0; i < set.length; i++) {
         if (elem == set[i]) {
            return true;
         }
      }
      return false;
	   
	   
	   
	   
	   
	   
	   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
}

