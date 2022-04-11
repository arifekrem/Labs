/**
   A class to model an employee.
*/
public class Employee
{
   protected String name;
   protected double salary;

   /**
      Make an employee with a given name and salary.
      @param aName the name
      @param aSalary the salary
   */
   public Employee(String aName, double aSalary)
   {
      name = aName;
      salary = aSalary;
   }

   /**
      Provide a string description of an employee.
   */
   public String toString()
   {
      return this.getClass().getName() + " Name: " + name + " Salary: " + salary;
   }
}
