/**
   This is a simple program to count the lines in a data file

 */
import javax.swing.* ;
import java.util.* ;
import java.io.* ;

public class LineCount
{
	public static void main(String[] args) 
	{
		//-----------Start below here. To do: approximate lines of code = 10
		// Use a try{...}catch(){...} block and open a file "data.txt" using the File class. 
		// Create a Scanner object and pass in the File reference. Read the lines one at a time from the file
		// and count them. Print "Number of lines: " followed by the line count

		int count = 0;

		try 
		{
			File file = new File("data.txt");
			Scanner in = new Scanner(file);
			while (in.hasNext())
			{
				count++;
				String line = in.nextLine();
			}
			System.out.println("Number of lines: " + count);
		}	
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println("Expected:\nNumber of lines: 13");
	}
}
