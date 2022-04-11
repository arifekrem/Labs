import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentGrades
{
	public static void main(String[] args)
	{
		//-----------Start below here. To do: approximate lines of code = 1
		// Create a map called students with key of type String (student id) and value of type Student
		Map<String, Student> students = new TreeMap<>();
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		
		try
    {
        File studentData = new File("students.txt");
        Scanner in = new Scanner(studentData);
        Scanner inputLine;
        
        while (in.hasNextLine())
        {
           String line = in.nextLine();
           inputLine = new Scanner(line);
           String name = inputLine.next();
           String id   = inputLine.next();
           Student student = new Student(name,id);
           while (inputLine.hasNext())
           {
          	 String course = inputLine.next();
          	 String grade = inputLine.next();
          	 student.addCourseAndGrade(course, grade);
           }
           //-----------Start below here. To do: approximate lines of code = 1
           // Add the student to the students map
           students.put(id, student);
           //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        }
        
    }
    catch (IOException exception)
    {
        System.out.println("Error processing file: " + exception);
        System.exit(0);
    }
	
		//-----------Start below here. To do: approximate lines of code = 3
		// Print all the info for all students in the map
		
		for (Student s: students.values()) {
            System.out.println(s);
        }
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		
		//-----------Start below here. To do: approximate lines of code = 8
		// Update the course grade of a student with given id
		//ID: "DD1234" CPS209 update grade to B+
		//ID: "JJ2345" CPS209 update grade to A-
		//ID: "HH2123" CPS209 update grade to B+
		
		students.get("DD1234").updateGrade("CPS209", "B+");
		students.get("JJ2345").updateGrade("CPS209", "A-");
		students.get("HH2123").updateGrade("CPS209", "B+");

		
		// Print all the info for all students in the map
		
		for (Student s: students.values()) {
            System.out.println(s);
        }
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		
		System.out.println("Expected:\nJoe DD1234 CPS209 B- CPS109 A-");
		System.out.println("Adam HH2123 CPS209 B CPS109 D+");
		System.out.println("James JJ2345 CPS209 B+ CPS109 C+");
		System.out.println("Miriam MM3456 CPS209 A+ CPS109 A+");
		System.out.println("Joe DD1234 CPS209 B+ CPS109 A-");
		System.out.println("Adam HH2123 CPS209 B+ CPS109 D+");
		System.out.println("James JJ2345 CPS209 A- CPS109 C+");
		System.out.println("Miriam MM3456 CPS209 A+ CPS109 A+");
	}
}
