import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
/*
 * 
 * Simple program demonstrating the use of a stack for undo operations
 */
public class StackUndo
{
	static LinkedList<String> list = new LinkedList<String>();
	static Stack<String> actions = new Stack<String>();
	
	public static void main(String [] args)
	{
		// Build a list of words by performing a sequence of actions, where each action has a word parameter
		String commands = "addLast cat addLast bear addLast porcupine addFirst lion addFirst eagle";
		String action = "";
		String word = "";
		
		Scanner scanner = new Scanner(commands);
		while (scanner.hasNext())
		{
			action = scanner.next();
			
			if (action.equals("addLast"))
			{
				word = scanner.next();
				list.addLast(word);
				actions.push(action);
			}
			if (action.equals("addFirst"))
			{
				word = scanner.next();
				list.addFirst(word);
				actions.push(action);
			}
			System.out.println(list);
		}
		System.out.println("Undo");
		undo();
		System.out.println(list);
		System.out.println("Undo");
		undo();
		System.out.println(list);
		System.out.println("Undo");
		undo();
		System.out.println(list);
		System.out.println("Undo");
		undo();
		System.out.println(list);
		System.out.println("Undo");
		undo();
		System.out.println(list);
		undo();
		
		System.out.println("Expected:\nUndo\n[lion, cat, bear, porcupine]\nUndo\n[cat, bear, porcupine]\nUndo\n[cat, bear]");
		System.out.println("Undo\n[cat]\nUndo\n[]");
	}
		
	/*
	 * Undo the last action performed on a list. Possible actions are "addFirst" and "addLast" 
	 */
	static void undo()
	{
		//-----------Start below here. To do: approximate lines of code = 6
		// Use the actions stack to undo the last action applied to the list of words
		//an action is either "addFirst" or "addLast"  Hint: check to ensure the stack is not empty 
		
		if(actions.isEmpty() == false)
		{
			String wish = actions.pop();
			
			if(wish.equals("addLast"))
			{
				list.removeLast();
			}
			
			if(wish.equals("addFirst"))
			{
				list.removeFirst();
			}
		}
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
