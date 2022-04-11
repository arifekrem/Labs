import java.lang.reflect.Method;

public class Country implements Measurable
{
   private String name;
   private double area;

   /**
      Construct a country with name and area.
      @param name country's name
      @param area total area of country
   */
   public Country(String name, double area)
   {
      this.name = name;
      this.area = area;
   }

   /**
      Measurable interface method to retrieve measure.
      @return the measured area
   */
   //-----------Start below here. To do: approximate lines of code = 2
   //
   public double getMeasure()
   {
      return this.area;
   }
   
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
