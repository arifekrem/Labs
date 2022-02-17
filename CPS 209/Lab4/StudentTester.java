/**
   A class to test the Student class.
   Solution to Exercise P3.8
*/
public class StudentTester
{
   /**
      Tests the methods of the Student class.
      @param args not used
   */
   public static void main(String[] args)
   {
      Student student = new Student("Jane Doe");
      student.addQuiz(8);
      student.addQuiz(6);
      student.addQuiz(10);
      student.addQuiz(8);
      System.out.println("Total score for " + student.getName() 
			 + " = " + student.getTotalScore());
      System.out.println("Expected:");      
      System.out.println("Total score for Jane Doe = 32.0");      
      System.out.println("Average score for " + student.getName() 
			 + " = " + student.getAverageScore());
      System.out.println("Expected:");      
      System.out.println("Average score for Jane Doe = 8.0");      
      student.addQuiz(18);
      System.out.println("Total score for " + student.getName() 
			 + " = " + student.getTotalScore());
      System.out.println("Average score for " + student.getName() 
			 + " = " + student.getAverageScore());
      System.out.println("Expected:\nTotal score for Jane Doe = 50.0\nAverage score for Jane Doe = 10.0");   
   }
}


