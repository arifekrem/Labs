import java.util.Scanner;
/*
 * This program counts the number of 'a' , 'e', 'i', 'o', 'u' characters
 * that occur in a sentence string  
 * 
 * For example, if the sentence string is "hello how are you" 
 * the output should be: 
 * a 1  
 * e 2
 * i 0
 * o 3
 * u 1
 * 
 */
public class VowelFrequency
{
   public static void main(String[] args)
   {
      String sentence = "The quick brown fox jumps over the lazy dog";
      
      //-----------Start below here. To do: approximate lines of code = 5
      // Create a separate integer variable for each vowel. 
      // (for example eCount) and initialize each to 0
      int aCount = 0;
      int eCount = 0;
      int iCount = 0;
      int oCount = 0;
      int uCount = 0;
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      
      //-----------Start below here. To do: approximate lines of code = 13
      // Write a for loop that counts from 0 to the length-1 of the string variable sentence (see above)
  	   // Inside the loop use the charAt() method of the String class and check if the current character of the sentence is a 
      // one of 'a' 'e' 'i' 'o' 'u'. 
      // If it is, increment the appropriate count variable by 1
      
      for (int i = 0; i < sentence.length(); i++) {
         if (sentence.charAt(i) == 'a') {
            aCount++;
         }
         else if (sentence.charAt(i) == 'e') {
            eCount++;
         }
         else if (sentence.charAt(i) == 'i') {
            iCount++;
         }
         else if (sentence.charAt(i) == 'o') {
            oCount++;
         }
         else if (sentence.charAt(i) == 'u') {
            uCount++;
         }
      }
      
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      System.out.println("a = " + aCount);
      System.out.println("e = " + eCount);
      System.out.println("i = " + iCount);
      System.out.println("o = " + oCount);
      System.out.println("u = " + uCount);
      System.out.println("Expected: ") ;
      System.out.println("a = 1");
      System.out.println("e = 3");
      System.out.println("i = 1");
      System.out.println("o = 4");
      System.out.println("u = 2");
   }
}
