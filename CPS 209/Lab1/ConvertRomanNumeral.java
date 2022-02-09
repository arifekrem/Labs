/**
   Converts Roman numerals to decimal value. 
   For example, if the Roman numeral is X then the valueOf method returns 10
   The valueOf method assumes the parameter is one of the characters 'I' 'X' 'L' 'C' 'D' 'M'
*/
import java.util.Scanner;

public class ConvertRomanNumeral
{
	public static void main(String[] args)
	{
	   Scanner in = new Scanner("I C X D M L");

	   char romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 1") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 100") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 10") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 500") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 1000") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 50") ;
	}
	
    /**
      Returns the integer value of the given Roman numeral 
      @param numeral a single Roman numeral character (i.e. char) (one of 'I' 'X' 'L' 'C' 'D' 'M')
      @return the integer value of numeral. 
    */
    //-----------Start below here. To do: approximate lines of code = 14
    // write a static method valueOf with the appropriate parameters and return type.
    // see how this static method is called above in main() inside the println statements 	
   
    public static int valueOf(char numeral) {
		if (numeral == 'I') {
			return 1;
		}
		else if (numeral == 'C') {
			return 100;
		}
		else if (numeral == 'X') {
			return 10;
		}
		else if (numeral == 'D') {
			return 500;
		}
		else if (numeral == 'M') {
			return 1000;
		}
		else if (numeral == 'L') {
			return 50;
		}
		return 0;
    }
   

      // must be an M
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
