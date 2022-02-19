public class Province
{
   
    String name;
    int population;
    double area;
   
   /**
      Create a constructor method that has 3 parameters,
      one to initialize the name, one to initialize the 
      population and one to initialize the area 
   */
   //-----------Start below here. To do: approximate lines of code = 4
   //
   
   public Province(String n, int p, double a) {
      name = n;
      population = p;
      area = a;
   }
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   
     
   /**
      Create a public method called getProvinceStats() that returns a String
      containing the name of the province followed by " Population: " followed by
      the population followed by " Area: " followed by the area
   */
   //-----------Start below here. To do: approximate lines of code = 2
   //
   
   public String getProvinceStats() {
      return name + " Population: " + population + " Area: " + area;
   }
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   
   
   
   /**
      Create a public method getPopulationDensity() that returns a double
      number representing the population density. 
   */
   //-----------Start below here. To do: approximate lines of code = 2
   //
   
   public double getPopulationDensity() {
      return population / area;
   }
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   
   // Create a public method int compareDensity(Province other) that returns 
   // +1 if the this province density is > than the other province density
   // -1 if the this province density is < than the other province density
   // 0 if the densities are the same
   //-----------Start below here. To do: approximate lines of code = 4
   //
   int compareDensity(Province other) {
      if (this.getPopulationDensity() > other.getPopulationDensity()) {
         return +1;
      }
      else if (this.getPopulationDensity() < other.getPopulationDensity()) {
         return -1;
      }
      else {
         return 0;
   }
   }  
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
