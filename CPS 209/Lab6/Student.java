
/**
   A class representing a student.
*/
public class Student extends SchoolPerson
{
   private String major;

   /**
      Create a student with a given name and date of birth and major.
      @param name the name
      @param yearOfBirth the date of birth
      @param major the major
   */
   public Student(String name, int yearOfBirth, String maj)
   {
  	  //-----------Start below here. To do: approximate lines of code = 2
  	  // Initialize the inherited variables using super() and initialize
  	  // the new variable major
  	  super(name, yearOfBirth);
     major = maj;
  	  
  	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   /**
      Convert student to string form
   */
   public String toString()
   {
  	  //-----------Start below here. To do: approximate lines of code = 1
  	  // override the method toString() and return a string
  	  // containing the values of the inherited variables followed by
  	  // " Major: " followed by major. Hint: make use of super.  
       return this.getClass().getName() + " Name: " + super.name + " Year of Birth: " + super.yearOfBirth + " Major: " + major;
  	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
}

