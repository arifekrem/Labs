import java.util.Scanner;

// Calculates the sum of even digits of the input integer number
// Example: number = 12345   Sum = 6 (2+4)
//          number = 248     Sum = 14 (2+4+8
//          number = 65732098 Sum = 16 (6+2+8)


public class ComputeSumofEvenDigits 
{
   public static void main(String[] args) 
   {
     String digits = "48596732 273457 135798 24680 3";    
     Scanner in = new Scanner(digits);

     while (in.hasNextInt())
     {
       int num = in.nextInt();

       int sum = 0;
       int digit;

       //-----------Start below here. To do: approximate lines of code = 5
       // Use a while loop. 
       // While num is greater than 0, use the modulus operator to strip off the next digit.
       // Check if this digit is even, if so add it to the sum variable
       // Finally, divide the num by 10 to throw away the current digit
 
     while (num > 0) {
      digit = num % 10;
      num = num / 10; 
      if (digit % 2 == 0) {
        sum += digit;   
      }
     }  

     // Only add digit if it is even (hint: use modulo 2)
       
       //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
       System.out.println("The sum is " + sum);
     }
     System.out.println("Expected:");
     System.out.println("The sum is 20");
     System.out.println("The sum is 6");
     System.out.println("The sum is 8");
     System.out.println("The sum is 20");
     System.out.println("The sum is 0");
   }
}