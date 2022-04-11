
/**
   A class to model an executive.
*/
public class Executive extends Manager
{
	 private int bonus;
	 
   /**
      Make an executive with a given name, salary, department and bonus.
      @param name the name
      @param salary the salary
      @param department the department
      @param bonus the bonus
   */
   public Executive(String name, double salary, String department, int bonus)
   {
  	  //-----------Start below here. To do: approximate lines of code = 2
  	  // Initialize the inherited variables using the super() keyword
  	  // also initialize the new instance variable bonus
  	   super(name, salary, department);
      this.bonus = bonus;
  	  
  	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   /**
      Provide a string description of an executive.
   */
   public String toString()
   {
  	//-----------Start below here. To do: approximate lines of code = 1
  	// Override the method toString() from super class Manager
  		//Hint: use the super. (see toString() method in Manager)
  		// and add " Bonus: " followed by the bonus value to the returned string
        return this.getClass().getName() + " Name: " + super.name + " Salary: " + super.salary + " Department: " + super.department  + " Bonus: " + bonus;
     	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
  
}
