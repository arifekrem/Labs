/**
   A class representing a person.
*/
public class SchoolPerson
{
   protected String name;
   protected int yearOfBirth;

   /**
      Create a person with a given name and date of birth.
      @param name the name
      @param yearOfBirth the date of birth
   */
   public SchoolPerson(String name, int yearOfBirth)
   {
      this.name = name;
      this.yearOfBirth = yearOfBirth;
   }

   /**
      Convert person to string form.
   */
   public String toString()
   {
      return this.getClass().getName() + " Name: " + name + " Year of Birth: " + yearOfBirth;
   }
}