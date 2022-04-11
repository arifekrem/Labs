import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Random ;
import java.util.TreeMap;
/**
   You are given a map of names to scores.
   Your job is to find the name corresponding to the highest score.
*/
public class FindMax
{
   public static void main(String[] args)
   {
      Map<String, Integer> scores = new TreeMap<String, Integer>();
      Random random = new Random(1) ;
      scores.put("Dmytro", random.nextInt(100)) ;
      scores.put("Stefan", random.nextInt(100)) ;
      scores.put("Usman", random.nextInt(100)) ;
      scores.put("Rabib", random.nextInt(100)) ;
      scores.put("Chang", random.nextInt(100)) ;
      scores.put("Carlos", random.nextInt(100)) ;
      scores.put("Matthew", random.nextInt(100)) ;
      scores.put("Andrew", random.nextInt(100)) ;
      scores.put("Syeda", random.nextInt(100)) ;
      scores.put("Sundar", random.nextInt(100)) ;
      scores.put("Minesh", random.nextInt(100)) ;
      scores.put("Atoosa", random.nextInt(100)) ;
      scores.put("Shah", random.nextInt(100)) ;

      //For this problem we will assume scores are from 0 to 99
      int maxScore = -1 ;
      String maxName = "" ;
      //-----------Start below here. To do: approximate lines of code = 5
      // 1-5. find the name (maxName) of the person with the highest score

      for (String name : scores.keySet())
      {
         if (scores.get(name) > maxScore)
         {
            maxScore = scores.get(name);
            maxName = name;
         }
      }
      
      //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
      System.out.println(maxName) ;
	  System.out.println("Expected:\nStefan") ;
   }
}
