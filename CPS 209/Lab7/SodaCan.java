/**
   Class to get surface area and volume of a soda can.
 */
public class SodaCan implements Measurable
{
   private double height;
   private double radius;

   /**
      Initializes a can with given height and radius.
      @param height the height
      @param radius the radius
   */
   public SodaCan(double height, double radius)
   {
      this.height = height;
      this.radius = radius;
   }

   /**
      Calculates the surface area of the soda can.
      @return the surface area of the soda can
   */
   public double getSurfaceArea()
   {
      return 2 * Math.PI * radius * (radius + height);
   }

   /**
      Calculates the volume of the soda can.
      @return the volume of the soda can
   */
   public double getVolume()
   {
      return Math.PI * radius * radius * height;
   }

   /**
      Returns the area of the soda can.
      @return the area of the soda can
   */
   //-----------Start below here. To do: approximate lines of code = 2
   // write a method that correctly implements the Measurable interface
   // The method should return the surface area of the sodaCan object
   
   
   public double returnSurfaceArea()
   {
      return getSurfaceArea();
   }
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
