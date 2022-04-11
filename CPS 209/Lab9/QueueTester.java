import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTester
{
	static Queue<String> queue = new LinkedList<String>();
	
	public static void main(String [] args)
	{
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("Will Grace");
		groups.add("Rachel Ross Phoebe Chandler Monica Joey");
		groups.add("Jerry Elaine Kramer George");
		groups.add("Beth");
		
		for (int i = 0; i < groups.size(); i++)
		{
			String group = groups.get(i);
			Scanner scanner = new Scanner(group);
			while (scanner.hasNext())
			{
				queue.add(scanner.next());
			}
		}
		
		System.out.println(getNextGroup(2));
		System.out.println(getNextGroup(6));
		System.out.println(getNextGroup(4));
		System.out.println(getNextGroup(1));
		System.out.println(getNextGroup(3));
		System.out.println("Expected:\n[Will, Grace]\n[Rachel, Ross, Phoebe, Chandler, Monica, Joey]");
		System.out.println("[Jerry, Elaine, Kramer, George]\n[Beth]\n[]");
	}
	
	/*
	 * Removes a group of people from a queue. 
	 * The integer parameter groupMemberSize indicates how many people should be removed from the queue
	 * Returns a list of the people in the group 
	 */
	static LinkedList<String> getNextGroup(int groupMemberSize)
	{
		//-----------Start below here. To do: approximate lines of code = 1
		// Create an empty Linked List of Strings to hold the group members
		LinkedList<String> groupMembers = new LinkedList<String>();
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		
		//-----------Start below here. To do: approximate lines of code = 6
		// Remove groupMemberSize strings (representing the names of people in the group) from the queue 
		// and add each name string to the list
		// Hint: if the queue is empty then return an empty group list
		
		if(queue.isEmpty()){
            return groupMembers;
        }

        for (int i = 0; i < groupMemberSize; i++){
            groupMembers.add(queue.poll());
        }
		
        return groupMembers;

		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
