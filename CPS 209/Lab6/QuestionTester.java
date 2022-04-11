import java.util.Scanner;
/**
   This class tests the Question classes and subclasses.
   It is an example in Big Java.
   If you want to try it interactively, run Questioner.java.

   Your work is in the todo region in FillInQuestion.java.
   Nothing to change here.
 */
public class QuestionTester
{
   public static void main(String[] args)
   {
      // An array of Question references - no Question objects yet
      Question[] quiz = new Question[3];
      // create a Question object and insert in index 0 of array
      quiz[0] = new Question("Who was the inventor of Java?");
      quiz[0].setAnswer("James Gosling");    
      // Add another Question object	  
      quiz[1] = new FillInQuestion("The inventor of Java was _James Gosling_.") ;

      String response ;
      Question q ;
      System.out.println("The first question is simply using Question.") ;
      q = quiz[0] ;
      q.display();
      response = "Larry Wall" ;
      System.out.println(response + "?");      
      System.out.println(q.checkAnswer(response));      
      System.out.println(false + " WAS EXPECTED.") ;
      response = "James Gosling" ;
      System.out.println(response + "?");      
      System.out.println(q.checkAnswer(response));      
      System.out.println(true + " WAS EXPECTED.") ;
      System.out.println("------------------------------------") ;
      System.out.println("The second question is using FillInQuestion.") ;

      q = quiz[1] ;
      q.display();
      System.out.println("The inventor of Java was _______________.    WAS EXPECTED.") ;

      response = "Niklaus Wirth" ;
      System.out.println(response + "?");      
      System.out.println(q.checkAnswer(response));      
      System.out.println("false WAS EXPECTED.") ;
      response = "James Gosling" ;
      System.out.println(response + "?");      
      System.out.println(q.checkAnswer(response));      
      System.out.println("true WAS EXPECTED.") ;
   }
}
/**
   A question class with a text and an answer.
   This is an example in Big Java.
*/
class Question
{
    //instance variables
    private String text;
    private String answer;
    /**
       A default constructor method that initializes text and answer 
    */
    public Question()
    {
	text = "1 + 1 = " ;
	answer = "2" ;
    }
    /**
       A constructor method to initialize text to parameter questionText, set answer to empty String
       @param questionText the text of this question
    */
    public Question(String questionText) 
    {
	text = questionText;
	answer = "";
    }
    /**
       Sets the answer for this question.
       @param correctResponse the answer
    */
    public void setAnswer(String correctResponse)
    {
	answer = correctResponse;
    }
    /**
       Gets the answer for this question.
       @return the correct answer
    */
    public String getAnswer()
    {
	return answer ;
    }
    /**
       Checks a given response for correctness.
       @param response the response to check
       @return true if the response was correct, false otherwise
    */
    public boolean checkAnswer(String response)
    {
	return response.equals(answer);
    }
    /**
       Sets the question text
       @param questionText the text of this question
    */
    public void setQuestion(String questionText) 
    {
	text = questionText;
    }
    /**
       Displays this question.
    */
    public void display()
    {
	System.out.println(text);
    }
}
/**
   A FillInQuestion is a type of question where the responder 
   has to fill in the blanks.  
   This is an example in Big Java.
   An object of this class is constructed with 
   a string that contains the question and the answer.
   The answer is marked by underscores at the start and end, 
   for example:

   "The inventor of Java was _James Gosling_".  

   The question should be displayed as

    The inventor of Java was _______________.

    Note the number of underscores in the question is 
    2 plus the length of the answer string, in this case, 
    2 + 13 = 15.
*/
class FillInQuestion extends Question
{
   /**
      A constructor method to initialize the inherited text and answer variables (of type string)
      For example, if parameter questionText is:
      "The inventor of Java was _James Gosling_".  
      then text should be set to
      "The inventor of Java was _______________".  
      and the answer should be set to
      "James Gosling"
      The answer string may be in the middle, as in questionText:
      "A Canadian, _James Gosling_, invented Java".
      in which case text should be:
      "A Canadian, _______________, invented Java".
      and the answer should be:
      "James Gosling"
      @param questionText the text of this question, also containing answer surrounded by one underscore on each end of the answer
   */
   public FillInQuestion(String questionText)
   {
       char underscore = '_' ;       
       //-----------Start below here. To do: approximate lines of code = 7
       //-----------Start below here. To do: approximate lines of code = 7
       // 1. find position of first underscore, hint indexOf(char)
       //Note, indexOf(char) and indexOf(char, from) can be used here
       int firstunderscore = questionText.indexOf(underscore);
       //2. second underscore, hint indexOf(char, from)
       int secondunderscore = questionText.indexOf(underscore);
       //3. extract the answer string Hint: use substring 
       String answer = getAnswer();
       //4. setAnswer (see superclass Question - remember you inherit all variables and methods
       setAnswer(answer);
       //5. String underscores = ... underscores string as long as answer string is
       //replaceAll() method of class String helps, or you can do it in a loop
       String underscores = "";
       String answertext = ""; 

       for (int i = 0; i < secondunderscore; i++) {
       //6. replace answer embedded in questionText with the underscores before setting text string
         if (i >= firstunderscore){
            underscores += "_";
            answertext += questionText.charAt(i);
         }
       }
       System.out.println(answertext);
       System.out.println(underscores);
       questionText = questionText.replace(answertext, underscores);

       //7. setQuestion to set text variable
       setQuestion(questionText);
       //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
       //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
}
