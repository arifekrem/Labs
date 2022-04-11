/**
   Basic person with name and height.
*/
public class APerson implements Measurable
{
   private String name;
   private int height;

   /**
      Create a person with a given name and height in centimeters.
      @param name person's name
      @param height person's height in centimeters
   */
   public APerson(String name, int height)
   {
      this.name = name;
      this.height = height;
   }

   /**
      A person is measured by their height.
   */
   public double getMeasure()
   {
      return height;
   }
}
