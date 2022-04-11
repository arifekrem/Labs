
/**
   A class to model a manager.
 */
public class Manager extends Employee
{
	protected String department;

	/**
      Make a manager with a given name, salary, and department.
      @param name the name
      @param salary the salary
      @param department the department
	 */
	public Manager(String name, double salary, String dept)
	{
		//-----------Start below here. To do: approximate lines of code = 2
		// Initialize the inherited variables name and salary using the super() keyword
		// initialize the new instance variable department
		super(name, salary);
		department = dept;
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	/**
      Provide a string description of a manager.
	 */
	
	public String toString()
	{
	//-----------Start below here. To do: approximate lines of code = 1
	// Override the method toString() from super class Employee
		//Hint: use the super. (see toString() method in Employee)
		// and add " Department: " followed by the department name to the returned string
		return this.getClass().getName() + " Name: " + name + " Salary: " + salary + " Department: " + department;
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
	
}
