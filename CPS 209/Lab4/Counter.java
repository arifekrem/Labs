/**
   This class models a tally counter.
*/
public class Counter
{
   private int value;
   private int max;

   public void setLimit(int maximum)
   {
      max = maximum;
   }

   /**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void count() 
   {
  	 //-----------Start below here. To do: approximate lines of code = 4
  	 // increments value by 1. if value exceeds limit, print "Limit Exceeded" and reset value to 0
  	 
   value++;
   if (value > max) {
      System.out.println("Limit Exceeded");
      value = 0;
   }

  	 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
}
