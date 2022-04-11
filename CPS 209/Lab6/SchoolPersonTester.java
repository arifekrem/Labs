/**
  A class to demo the student and instructor subclasses.
 */
public class SchoolPersonTester
{
	public static void main(String[] args)
	{
		SchoolPerson person = new SchoolPerson("Jeff", 2001);
		SchoolPerson student = new Student("Ali",2002, "CS");
		SchoolPerson instructor = new Instructor("Yeganeh", 1991, 120000);

		System.out.println(person);
		System.out.println(student);
		System.out.println(instructor);
		System.out.println("Expected:\nSchoolPerson Name: Jeff Year of Birth: 2001");
		System.out.println("Student Name: Ali Year of Birth: 2002 Major: CS");
		System.out.println("Instructor Name: Yeganeh Year of Birth: 1991 Salary: 120000");
	}
}

