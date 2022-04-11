
/**
   A class to demo the employee classes.
*/
public class EmployeeTester
{
   public static void main(String[] args)
   {
      Employee e1 = new Employee("Jeff", 30000);
      Employee e2 = new Manager("Larry", 80000, "Sales");
      Employee e3 = new Executive("Jayne", 800000, "Regional VP",20000);

      System.out.println(e1);
      System.out.println(e2);
      System.out.println(e3);
      System.out.println("Expected:\nEmployee Name: Jeff Salary: 30000.0");
      System.out.println("Manager Name: Larry Salary: 80000.0 Department: Sales");
      System.out.println("Executive Name: Jayne Salary: 800000.0 Department: Regional VP Bonus: 20000");
   }
}
