
/** A class for representing a microwave oven.
 */
public class Microwave {
    
   
    int timer;
    String power; //"HIGH" or "LOW"
    
    /** Creates a microwave with 0 seconds on the timer and at LOW power.
     */
    public Microwave()
    {
        //-----------Start below here. To do: approximate lines of code = 2
        // Complete this constructor to initialize instance variables
        
        timer = 0;
        power = "LOW";
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    
    /** Increases the time on the timer by 30 seconds.
     */
    public void increaseTime()
    {
       //-----------Start below here. To do: approximate lines of code = 1
       // complete the method
       timer += 30;
       //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    
    /** Switches the power level from LOW to HIGH, or vice versa.
     */
    public void switchPower()
    {
       //-----------Start below here. To do: approximate lines of code = 4
       // Complete this method. 
       
       if (power == "LOW") {
          power = "HIGH";
       }
       else {
          power = "LOW";
       }
       
       //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    
    /** Resets the microwave to its initial state.
     */
    public void reset()
    {
      //-----------Start below here. To do: approximate lines of code = 2
      // Complete this method. 

      timer = 0;
      power = "LOW";

      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    
    public void start()
    {
       System.out.println("Cooking for " + timer + " seconds at power " + power);  
    }
   
}
