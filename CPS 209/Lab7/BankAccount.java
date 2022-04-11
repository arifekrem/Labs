public class BankAccount implements Filter
{
	private long   accountNumber;    
	private double balance;
  private static int numberOfAccounts = 0;
	
	public BankAccount()
	{
	    accountNumber = 0;
	    balance = 0;
	    numberOfAccounts++;
	}
	
	public BankAccount(long accountNumber)
	{
	    this.accountNumber = accountNumber;
	    balance = 0;
	    numberOfAccounts++;
	}
	
	public BankAccount(long accountNumber, double initialBalance)
	{
	    this.accountNumber = accountNumber;
	    balance = initialBalance;
	    numberOfAccounts++;
	}
	public BankAccount(int accountNumber, double initialBalance)
	{
	    this.accountNumber = accountNumber;
	    balance = initialBalance;
	    numberOfAccounts++;
	}
	
	public static int getNumberOfAccounts()
	{
		return numberOfAccounts;
	}

	public double getBalance() 
	{
	  return balance;
	}
	
	public void deposit(double amount) 
	{
	   this.balance += amount;
	}

	public void withdraw(double amount) 
	{
	   this.balance -= amount;
	}

	public void transfer(double amount, BankAccount targetAccount)
	{
		this.withdraw(amount); 
		targetAccount.deposit(amount);
	}
	
	public String toString()
	{
		return "Account Number: " + accountNumber + " Balance: " + balance; 
	}
	
  //-----------Start below here. To do: approximate lines of code = 4
  // Implement the necessary method such that class BankAccount implements the Filter interface
	// check the balance instance variable of this bank account object to see if it is in range specified by
	// the parameters. See Filter.java 
  
  class BankAccount extends Filter
  {
	for (int i = 0; i < accounts.size(); i++)
	{
		if (accounts.get(i).getBalance().inRange(100,  1000))
		{
			return accounts.get(i);
		}
	}
  }
  
  
  
  
  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
