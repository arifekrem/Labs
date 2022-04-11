import java.util.ArrayList;

class RangeFilterTester
{
	public static void main( String[] args)
	{
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(new BankAccount(1398723,900));
		accounts.add(new BankAccount(1432561,9900));
		accounts.add(new BankAccount(1584624,52));
		accounts.add(new BankAccount(1856210,2300));
		accounts.add(new BankAccount(1745382,213));
		accounts.add(new BankAccount(1965432,603));
		accounts.add(new BankAccount(1234567,12));
		
    for (int i = 0; i < accounts.size(); i++)
    {
    	System.out.println(accounts.get(i));
    }
    System.out.println("After Filtering:");
    
    for (int i = 0; i < accounts.size(); i++)
    {
    	if (accounts.get(i).inRange(100,  1000))
			  System.out.println(accounts.get(i));
    }
    
    System.out.println("Expected:\nAccount Number: 1398723 Balance: 900.0");
    System.out.println("Account Number: 1745382 Balance: 213.0");
    System.out.println("Account Number: 1965432 Balance: 603.0");
	}
}
