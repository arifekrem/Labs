import java.util.ArrayList;

import javax.xml.validation.Validator;

/**
   A class that keeps track of a dynamic menu.
 */
public class Menu
{
	private ArrayList<String> menuItems;


	/**
      Constructs a menu with no options.
	 */
	public Menu()
	{
		//-----------Start below here. To do: approximate lines of code = 1
		// initialize menuItems to an empty array list of Strings
		menuItems = new ArrayList<String>();
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	/**
      Adds a new menu item to the end of this menu.
      @param item the menu item to add
	 */
	public void addOption(String item)
	{
		//-----------Start below here. To do: approximate lines of code = 1
		// simply add the given item to the end of the array list
		menuItems.add(item);
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	/**
      Displays the menu, with options numbered starting with 1. (i.e. not 0)

      @return the number that the user supplied
	 */
	public void print()
	{
		//-----------Start below here. To do: approximate lines of code = 3
		// for each item in the menu, print the menu item number (add 1 to the item number index in the array list) 
		// followed by a ". " followed by the item name. 
		
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.print(i+1);
			System.out.print(".");
			System.out.print(menuItems.get(i));
		}
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	public String getOption(int itemNum)
	{
		//-----------Start below here. To do: approximate lines of code = 3
		// given an item number (indexed from 1) if it is a valid item number,
		// return the item in the menu corresponding to this item number.
		// If the item number is not valid, return a ""
		
		if (itemNum - 1 < menuItems.size()) {
			return menuItems.get(itemNum - 1);
		}
		else {
			return "";
		}
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
