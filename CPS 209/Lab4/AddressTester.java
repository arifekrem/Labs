import java.util.ArrayList;

public class AddressTester
{
	public static void main(String[] args)
	{
		ArrayList<Address> addresses = new ArrayList<Address>();

		addresses.add(new Address("314", "Yonge Street", "Toronto", "ON", "M5B 2K3"));
		addresses.add(new Address("13", "Jarvis Street", "Toronto", "ON", "M4X 1H1"));
		addresses.add(new Address("26", "Avenue Road", "Toronto", "ON", "M5C 2H4"));
		addresses.add(new Address("67", "Bay Street", "Toronto", "ON", "M5X 2B1"));
		addresses.add(new Address("314", "Yonge Street", "Toronto", "ON", "M5B 2K3"));
		addresses.add(new Address("666", "501", "Spadina Avenue", "Toronto", "ON", "M53 2K3"));

		Address addr = new Address("26", "Avenue Road", "Toronto", "ON", "M5C 2H4");

		boolean found = false;
		//-----------Start below here. To do: approximate lines of code = 4
		// search through the list of adddresses to see if Address addr is in there.
		// If so , set found = true and break
		
		for (int i = 0; i < addresses.size(); i++) {
			if (addresses.get(i).equals(addr)) {
				found = true;
				break;
			}
		}
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		if (found)
			System.out.println(addr.toString() + " is in the list of addresses");
		else
			System.out.println(addr.toString() + " is not in the list of addresses");	

		System.out.println("Expected:\n" + addr.toString() + " is in the list of addresses");
	}
}
