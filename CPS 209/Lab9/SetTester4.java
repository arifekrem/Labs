import java.util.TreeSet;
import java.util.Stack ;
import java.util.Set;
import java.util.Iterator ;
import java.util.Random ;

/**
   Illustrates basic operations of an iterator on a set.  Notice that
   the iterator for a set differs from the iterator for a list (i.e.,
   a list iterator), in that the set iterator has no previous method
   (since the set has no order it does not makes sense to ask to go
   backwards), and the set iterator has no add method (since the set
   has no order it makes no sense to try to add an element at a
   particular position).

   The part that you write adds 1000 random letters a-z to a set, then puts
   them in a stack, then pops and prints them.

   Expected output:
A-B-D-F-G
zyxwvutsrqponmlkjihgfedcba
*/
public class SetTester4
{
    public static void main(String[] args) 
    {
	//This first part is just an example of set operations.
	Set<String> set = new TreeSet<String>() ;
	set.add("A") ;
	set.add("B") ;
	set.add("C") ;
	set.add("D") ;
	set.add("F") ;
	set.add("G") ;
	//The following line shows how to make an iterator for a set.
	Iterator<String> iterator = set.iterator() ;
	//The following loop shows how to go through the set with the iterator
	while (iterator.hasNext()) {
	    String element = iterator.next() ;
	    if (element.equals("C"))
		iterator.remove() ;
	    else if (iterator.hasNext())
		System.out.print(element + "-") ;
	    else 
		System.out.print(element) ;
	}
	System.out.println() ;
	
	set = new TreeSet<String>() ;
	Random random = new Random() ;
	char ch = 'a' ;
	for (int i = 0 ; i < 1000 ; i++) 
	{
	    //-----------Start below here. To do: approximate lines of code = 6
	    // 1. add a randomly selected letter "a" to "z" to set ; 
	    set.add(String.valueOf((char)(random.nextInt(26) + ch)));
	}//
	//2. iterator = ... an iterator on set ; 
	iterator = set.iterator();
	//3. make a stack for strings 
	Stack<String> stack = new Stack<String>();
	//4-5. use the iterator to put all of the letters into the stack ; 
	while (iterator.hasNext())
	{
		stack.add(iterator.next());
	}	    
	//6. while there are letters on the stack
	while (stack.isEmpty() == false)
	{
	    System.out.print(stack.pop()) ;//
		System.out.println() ;//
	}
	    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	System.out.println("Expected:\nA-B-D-F-G\nzyxwvutsrqponmlkjihgfedcba");
    }
}
