import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
   Removes blank lines from a file
*/
public class DeleteBlankLines
{
	/**
      Removes blank lines from the file given as argument and writes the non-blank lines
      back to the file.
      @param fileName the name of the file to be processed.
    */
    public static void removeLines(String fileName)
    {
      // list to hold the non-blank lines
    	ArrayList<String> lines =  new ArrayList<String>();
    	
      //-----------Start below here. To do: approximate lines of code = 8
      // In a try {..} block, create a File object using the fileName parameter,
    	// then create a Scanner object passing in the File reference
    	// then read the lines one by one. Check if the line string is non-blank by making use of the String class trim()
    	// method. After trimming, check the size of the string to see if it is > 0 (or use isEmpty() method)
    	// If it is > 0, add the line to the lines array list
      
      try
      {
        Scanner in = new Scanner(new File(fileName));
          while (in.hasNextLine())
          {
            String nxtln = in.nextLine();
            if (!nxtln.trim().isEmpty())
            {
              lines.add(nxtln);
            }
          }
      }
      catch (FileNotFoundException e)
      {
        e.printStackTrace();
      }
      
      
      
      
      
      
      
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      
      //-----------Start below here. To do: approximate lines of code = 7
      // In a try {..} block, create a file for writing using the PrintWriter class and the same parameter fileName
    	// as above. Then output the lines in the array list to this file. Don't forget to close the file!!
      
      
      
      
      
      
      
      
      
      
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
   
    public static void main(String[] args)
    {
      removeLines("lines.txt");
      int count = 0;
      try (Scanner in = new Scanner(new File("lines.txt")))
      {
         while (in.hasNextLine())
         {
            in.nextLine();
            count++;
         }
      } 
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      System.out.println("Number of non-blank lines: " + count);
      System.out.println("Expected:\nNumber of non-blank lines: 3");
    }
}
