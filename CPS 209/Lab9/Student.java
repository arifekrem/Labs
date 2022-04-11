import java.util.ArrayList;

/**
   A student has a name and a list of courses with grades
 */
public class Student
{  
	private String name ; // the name of the student
	private String id;
	private ArrayList<String> courses = new ArrayList<String>();
	private ArrayList<String> grades  = new ArrayList<String>();

	public Student(String name, String id)
	{   
		this.name = name ;
		this.id = id;
	}

	
	/**
       Adds another course and grade to the courses and grades array lists
      
	 */
	public void addCourseAndGrade(String course, String letterGrade)
	{   
		courses.add(course);
		grades.add(letterGrade);
	}

	public void updateGrade(String course, String newGrade)
	{
		for (int i = 0; i < courses.size(); i++)
		{
			if (courses.get(i).equals(course))
			{
				grades.set(i,newGrade);
				return;
			}
		}
	}
	public String getName() 
	{   
		return name ;
	}
	
	public String getId() 
	{   
		return id ;
	}
	
	public String toString()
	{
		String courseAndGrade = "";
		for (int i = 0; i < courses.size(); i++)
		{
			courseAndGrade += courses.get(i) + " " + grades.get(i) + " "; 
		}
		courseAndGrade.trim();
		return name + " " + id + " " + courseAndGrade;
	}
	
	
}



