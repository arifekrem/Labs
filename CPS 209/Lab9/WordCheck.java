import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
   This program checks to see what percent of the unique words in one
   file are used in another file.
   The program is based on the SpellCheck example in Big Java.

Expected output:
21 percent of the words in Cat in the Hat are in the paper.
 */
public class WordCheck
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Read the two files, storing the words in sets

		Set<String> set1 = readWords("catInHat.txt");
		Set<String> set2 = readWords("paper.txt");

		int count = 0 ;
		//-----------Start below here. To do: approximate lines of code = 3
		// 1. for each word in set1
		for (String word : set1)
		{
		
			//2. If set2 also contains that word
			if (set2.contains(word))
			{
				count++ ; //}
			}
		} //
		//3. calculate percent: per cent of words in set1 that you counted
		double percent = 100 * count / (double) set1.size();
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		System.out.printf("%.0f percent of the words in Cat in the Hat are in the paper.\n", percent) ;
		System.out.println("Expected:") ;
		System.out.printf("%.0f percent of the words in Cat in the Hat are in the paper.\n", 21.0) ;
		
	}
	/**
       Reads all words from a file and puts them into a set (a hash set)
       @param filename the name of the file
       @return a set with all lowercase words in the file. Here, a 
       word is a sequence of upper- and lowercase letters.
	 */
	//-----------Start below here. To do: approximate lines of code = 4
	// 4. a static method readWords returning a set of Strings ... FileNotFoundException
	public static Set<String> readWords(String filename) throws FileNotFoundException 
	{
	
		//5. let 'words' be a set of Strings, constructed as a TreeSet
		Set<String> words = new TreeSet<String>();
		Scanner scanner = new Scanner(new File(filename)); //
		//scanner.useDelimiter("[^a-zA-Z]+"); // Use this line to set the delimiter
		scanner.useDelimiter("[^a-zA-Z]+"); //
		//6. while scanner has another word
		while (scanner.hasNext())
		{
			//7. Put the lower case version of that word into 'words'.
			words.add(scanner.next().toLowerCase());
		}
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		return words;
	}
}

