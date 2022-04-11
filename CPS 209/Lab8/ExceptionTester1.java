import java.util.* ;
import java.io.* ;
/*
 * 
 * Simple program to test FileNotFoundException 
 */
public class ExceptionTester1
{
	public static void main(String[] args) 
	{
		//-----------Start below here. To do: approximate lines of code = 6
		// Use a try{...}catch(){..} block and open a file "input.txt" (use the File class)
		// read in one word from the file (use a Scanner) and print the length of the word
		// The file "input.txt" does not exist so you should catch FileNotFoundException and print:
		// "File not found"

		try
		{
			Scanner in = new Scanner(new File("input.txt"));
			int wordlength = in.next().length();
			System.out.println(wordlength);
		}
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
		
		
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.println("Expected:\nFile not found") ;
	}
}
