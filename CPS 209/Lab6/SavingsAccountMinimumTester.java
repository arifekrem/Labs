/**
   SavingsAccountMinimumTester -- to test the SavingsAccountMinimum class.
   See the SavingsAccountMinimum.java for the code that your write.
   Change nothing here.
 */
public class SavingsAccountMinimumTester
{
    public static void main(String[] args)
    {
	SavingsAccountMinimum account ;

	account = new SavingsAccountMinimum(10) ;
	account.deposit(1000) ;
	//addInterest after first deposit to initilize minimumBalance
	account.addInterest() ;
	System.out.println(account.getBalance()) ;
	System.out.println("1000.0 WAS EXPECTED") ;

	//this time the addinterest works with 1000 min balance
	account.addInterest() ;
	System.out.println(account.getBalance()) ;
	System.out.println("1100.0 WAS EXPECTED") ;

	account.withdraw(600) ;
	//this time the addinterest works with 500 min balance
	account.addInterest() ;
	System.out.println(account.getBalance()) ;
	System.out.println("550.0  WAS EXPECTED") ;

	account = new SavingsAccountMinimum(10) ;
	account.deposit(1000) ;
	//addInterest after first deposit to initilize minimumBalance
	account.addInterest() ; 

	account.withdraw(800) ;
	account.deposit(800) ;
	account.withdraw(0) ;
	//this time addInterest will work with min balance of 200
	account.addInterest() ;
	System.out.println(account.getBalance()) ;
	System.out.println("1020.0  WAS EXPECTED") ;
	
	account = new SavingsAccountMinimum(10) ;
	account.deposit(550) ;
	//addInterest after first deposit to initilize minimumBalance
	account.addInterest() ; 

	account.deposit(300.33) ;
	account.withdraw(257.57) ;
	account.withdraw(37.22) ;
	account.addInterest() ;
	System.out.printf("%.2f\n", account.getBalance()) ;
	System.out.println("610.54 WAS EXPECTED") ;
	
    }
}
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals. 
   NOTE: this simple version does not have an accountNumber variable
*/
class BankAccount
{  
    //instance variables
    protected double balance; //the money in the account
    /**
       A default constructor method
    */
    public BankAccount()
    {   
	balance = 0;
    }
    /**
       A constructor method that initializes the balance
       @param aBalance the initial balance
    */
    public BankAccount(double aBalance)
    {   
	balance = aBalance;
    }
    /**
       Deposits money into the bank account.
       @param amount the amount to deposit
    */
    public void deposit(double amount)
    {  
	double newBalance = balance + amount;
	balance = newBalance;
    }
    /**
       Withdraws money from the bank account.
       @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {   
	double newBalance = balance - amount;
	balance = newBalance;
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
/**
   A savings account is a special bank account 
   that has an interest rate.  The interest is calculated on a monthly
   basis (that is when addInterest() is called, and it uses the current
   balance at the end of the month for calculating the interest.)

   Note: interestRate is "protected" here so that it is directly accessible to the
   subclass.
*/
class SavingsAccount extends BankAccount
{  
    //instance variables
    protected double interestRate ;
    /**
       A constructor method to initialize interest rate
       @param rate the interest rate
    */
    public SavingsAccount(double rate)
    {   
	interestRate = rate ;
    }
    /**
       Adds the earned interest to the account balance.
    */
    public void addInterest()
    {  
	double interest = getBalance() * interestRate / 100 ;
	deposit(interest) ;
    }
}
/**
   A SavingsAccount is a special BankAccount with an interest rate.
   A SavingsAccountMinimum is a subclass of SavingsAccount
   where the interest is computed on the minimum balance 
   since the last call to addInterest.  Therefore,
   you have to modify SavingsAccountMinimum so that
   it has an instance variable to remember the minimum balance, and
   it has a different addInterest method (from the one in SavingsAccount).
   You need to modify the withdraw method as well, since that is where
   the balance goes down, which might affect the minimum balance.

   Note that interestRate has access specifier "protected"
   in SavingsAccount so that it is accessible in this subclass.
*/
class SavingsAccountMinimum extends SavingsAccount
{  
    //-----------Start below here. To do: approximate lines of code = 1
    //-----------Start below here. To do: approximate lines of code = 1
    //  1. add a new instance variable called minimumBalance to store the minimum balance
    double minimumBalance = 0;
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    /**
       A constructor method to initialize the inherited interestRate variable and set minimum balance to 0
       @param rate the interest rate
    */
    public SavingsAccountMinimum(double rate)
    {   
	// Note how we use super() to initialize inherited variables
	super(rate) ;
	minimumBalance = 0 ;
    }
    
    /**
       Adds the earned interest to the account balance, 
       based on the MINIMUM balance (not the regular balance!!).
    */
    public void addInterest()
    {  
	//-----------Start below here. To do: approximate lines of code = 3
	//-----------Start below here. To do: approximate lines of code = 3
	// 2. double interest = ...
	//note: interestRate is a percent and is "protected" in supeclass SavingsAccount
	//note: the interest depends on the minimum balance not on the inherited balance variable
	// see the addInterest() method in the superclass
	double interest = minimumBalance * interestRate / 100;
	//3. somehow add the computed interest to the balance (use an inherited method!), 
	deposit(interest);
	//4. make minimumBalance be equal to the current balance, since starting fresh 
	// i.e. use an inherited method to get updated balance!
	minimumBalance = super.getBalance();
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    /**
       Withdraws money from the account and updates minimum balance
       @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
	//-----------Start below here. To do: approximate lines of code = 2
	//-----------Start below here. To do: approximate lines of code = 2
	// Override the withdraw method. 
	//5. somehow to decrease balance by amount - hint: use super. 
    balance = super.getBalance() - amount;
    //6. update minimumBalance only when the updated (regular) balance is less
    if (balance < minimumBalance) {
    minimumBalance = balance;
    }
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}



