import java.util.Scanner;
/*
 * Write a program to find the average number of words in an array of sentence strings
 */
public class AverageWordCount
{
   public static void main (String[] args)
   {
      // array of sentences
      String sentences[] = {"Yeah, I'm gonna take my horse", "To the old town road", "I'm gonna ride til I can't no more",
                            "I'm gonna take my horse to the old town road", "I'm gonna ride til I can't no more"};
      int totalWords = 0;
      double averageWords = 0.0;
		 
      for (int i = 0; i < sentences.length; i++)
      {
         totalWords +=  wordCount(sentences[i]);
      }
      //-----------Start below here. To do: approximate lines of code = 2
      // compute the average number of words in a sentence and store in the variable averageWords
      // Hint: test make sure you do not divide by 0. You will need to cast
      
      averageWords = totalWords / sentences.length;

      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      System.out.println("Average number of words per sentence: " + averageWords);
      System.out.println("Expected:\nAverage number of words per sentence: 7.4");
   }
	
   // Calculate the number of words in the input String sentence. Return the number of words.
   static int wordCount(String sentence)
   {
      //-----------Start below here. To do: approximate lines of code = 7
      // There are several ways to solve this. One basic way is to use a Scanner, then in a while loop read the words one by 
      // one and increase the word count. Another way is to use the StringTokenizer class. 
      // A third way is to use the split() method in class String
      
      Scanner sc = new Scanner(sentence);
      int count = 0;

      while (sc.hasNext()) { 
         count++;
      }
      return (count);
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
}
