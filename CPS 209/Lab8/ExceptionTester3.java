/**
   Practicing with throwing exceptions.  In this exercise you throw an 
   exception in the BankAccount class if 
   1) the constructor receives an initial balance that is negative, or 
   2) the deposit method receives a negative amount, or 
   3) the withdraw method receives a negative amount 
 */
public class ExceptionTester3
{
	public static void main(String[] args)
	{
		String[] expect = {
				"Deposit 0, expect 1000.0", 
				"Initialize -500, expect exception and no change to balance.", 
				"Withdraw 300, expect 700.0", 
				"Withdraw -300, expect exception.", 
				"Deposit 300, expect 1000.", 
				"Deposit -300, expect exception.", 
				"Withdraw 2000, expect exception." 
		} ;
		BankAccount account = new BankAccount(1000) ;
		for (int i = 0 ; i < expect.length ; i++ ) {
			try {
				System.out.println("Case " + i + ": -------------") ;
				switch (i)  {
				case 0 : account.deposit(0) ; break ;
				case 1 : account = new BankAccount(-500) ; break ;
				case 2 : account.withdraw(300) ; break ;
				case 3 : account.withdraw(-300) ; break ;
				case 4 : account.deposit(300) ; break ;
				case 5 : account.deposit(-300) ; break ;
				case 6 : account.withdraw(2000) ; break ;
				}
				System.out.println(expect[i]) ;
				System.out.println(account.getBalance()) ;
			}
			catch (IllegalArgumentException e) {
				System.out.println(expect[i]) ;
				System.out.println("IllegalArgumentException was caught") ;
				System.out.println("Balance is: " + account.getBalance()) ;
			}
		}
	}
}
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals. This version only has a balance variable.

   This version throws an exception in the constructor.
 */
class BankAccount
{  
	//instance variables
	private double balance; //the money in the account
	/**
       Initializes balance variable with a zero balance.
	 */
	public BankAccount()
	{   
		balance = 0;
	}
	/**
       Initializes balance with a given parameter value aBalance.
       @param aBalance the initial balance
	 */
	public BankAccount(double aBalance)
	{   
		//-----------Start below here. To do: approximate lines of code = 2
		// 1. Throw an IllegalArgumentException if the initial balance is negative
		if (aBalance < 0)
		{
			throw new IllegalArgumentException();
		}
		//2. otherwise do the usual thing
		balance = aBalance;
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
	/**
       Deposits money into the bank account.
       @param amount the amount to deposit, which cannot be negative
	 */
	public void deposit(double amount)
	{  
		//-----------Start below here. To do: approximate lines of code = 1
		// 3. Throw an IllegalArgumentException if the amount is negative
		// set the message in the exception to: "Deposit amount is negative!"
		if (amount < 0)
		{
			throw new IllegalArgumentException("Deposit amount is negative!");
		}
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		double newBalance = balance + amount;
		balance = newBalance;
	}
	/**
       Withdraws money from the bank account.
       @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{   
		//-----------Start below here. To do: approximate lines of code = 1
		// 4. Throw an IllegalArgumentException if the amount is too much or if amount is negative
		// set the message in the exception to: "withdrawal amount is negative or greater than balance!"
		if (amount < 0 || amount > balance)
		{
			throw new IllegalArgumentException ("withdrawal amount is negative or greater than balance!");
		}
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
		balance -= amount ;
	}
	/**
       Gets the current balance of the bank account.
       @return the current balance
	 */
	public double getBalance()
	{   
		return balance;
	}
	/**
       Gives a string representation of the bankaccount,
       but in this case the string is just the balance.
       @return the balance as a string
	 */
	public String toString()
	{   
		return "" + balance ;
	}
}



