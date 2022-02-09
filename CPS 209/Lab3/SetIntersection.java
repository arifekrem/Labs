import java.util.ArrayList;
/*
 * This program takes two string array lists and finds all the elements in common (i.e. the intersection set)
 * For example:
 * If list1 contains words: bear porcupine beaver moose wolf
 * and list2 contains:      beaver otter wolf squirrel
 * then the intersection set is:
 * beaver wolf
 */
public class SetIntersection
{
	/*
	 * Given two string array lists (a and b) find all string words in common and return
	 * a new array list containing these words (i.e. the intersection set). If the lists
	 * have no words in common, then return an empty array list  
	 */
	public static ArrayList<String> intersection(ArrayList<String> a, ArrayList <String> b)
	{
		//-----------Start below here. To do: approximate lines of code = 8
		// Find all common strings between array list a and array list b and store them
		// into a new array list. Return a reference to the new array list
		// Hint: make use of the method equalsIgnoreCase of class String to test if two strings are equal 
		// regardless of case e.g.  "green" is equal to "Green" 
		
		ArrayList<String> c = new ArrayList<String>();

		for (int i = 0; i < a.size() - 1; i++) {
			for (int i2 = 0; i2 < a.size() - 1; i2++) {
				if (a.get(i).equalsIgnoreCase(b.get(i2))) {
					c.add(a.get(i));
				}
			}
		}

		return (c);
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	public static void main(String[] args)
	{
		ArrayList <String>  a = new ArrayList<String>();
		ArrayList <String>  b = new ArrayList<String>();

		// Initialize array lists a and b to some values
		a.add("John"); a.add("Paul"); a.add("George"); a.add("Ringo"); a.add("Mick"); a.add("Pete");   
		b.add("Mick"); b.add("Paul"); b.add("Angus"); b.add("Sting"); b.add("phil"); 

		ArrayList<String> intersectionList = intersection(a,b);
		System.out.println(intersectionList);
		System.out.println("Expected:\n[Paul, Mick]");
		a.set(1,"Jon"); a.set(4,"Michael"); 
		intersectionList.clear();
		System.out.println(intersectionList);
		System.out.println("Expected:\n[]");
	}
}
