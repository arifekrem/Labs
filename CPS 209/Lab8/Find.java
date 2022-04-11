import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
   Searches all files for the specified word and prints out all lines     
   containing the specified word.
*/
public class Find
{
   /**
      Searches for word in line.
      @param line the line to search
      @param word the word to search for
      @return true if word is in line, false otherwise
   */
   public static boolean containsWord(String line, String word)
   {
      for (int i = 0; i < line.length() - word.length(); i++)
      {
         // Search all word-length substrings of line
         if (line.substring(i, i + word.length()).equals(word))
         {
            return true;
         }
      }
      return false;
   }

   /**
	Searches file for a word, prints out all lines containing that word.
	@param wordToFind the word to find
	@param filename the filename for the file to search
   */
   public static void findAndPrint(String wordToFind, String filename)
   { 
  	 //-----------Start below here. To do: approximate lines of code = 8
  	 // fill in the method. Make use of the containsWord() method above. Or use the contains() method of class String
  	 // If you find the word in a line of a file, print the file name followed by a ": " followed by the line
  	 // Hint: use a try{..}catch(){...} block.
  	 
   try 
   {
      Scanner in = new Scanner(new File(filename));
      while (in.hasNextLine())
      {
         String nxtline = in.nextLine();
         if (nxtline.contains(wordToFind))
         {
            System.out.println(filename + ": " + nxtline);
         }
      }
   } 
   catch (FileNotFoundException e)
   {
      e.printStackTrace();
   }
  	 
  	 
  	 
  	 
  	 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   public static void main(String[] args)
   {
      String wordToFind = "sandwich";
      String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};
      for (int i = 0; i < fileNames.length; i++)
      {
         findAndPrint(wordToFind, fileNames[i]);
      }
      System.out.println("\nExpected:");
      System.out.println("file1.txt: I love a good sandwich");
      System.out.println("file1.txt: A sandwich can be very healty.");
      System.out.println("file2.txt: I love to eat a sandwich at lunch.");
      System.out.println("file2.txt: A sandwich is very filling.");
      System.out.println("file2.txt: One of my favorite type of sandwich is gilled cheese.");
      System.out.println("file2.txt: I like a peanut butter and jelly sandwich too.");
      System.out.println("file3.txt: If you buy a sandwich at a restaurant they can be quite expensive.");
      System.out.println("file3.txt: That's why I often make a sandwich at home.");
   }
}
