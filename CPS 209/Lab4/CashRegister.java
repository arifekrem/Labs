/**
   A cash register totals up sales of several items purchased by a customer and computes change due.
   See class CashRegisterTester to help you understand the methods in this class
*/
public class CashRegister
{
   private double totalOfItemsPurchased;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      totalOfItemsPurchased = 0;
      payment = 0;
   }

   /**
      Records the sale of another item.
      @param itemPrice the price of the item
   */
   public void recordPurchase(double itemPrice)
   {
    //-----------Start below here. To do: approximate lines of code = 2
    // add the price of the item to the total of items purchased so far 
    totalOfItemsPurchased += itemPrice;
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   /**
      Enters the payment received from the customer; should be called once
      for each coin type
      @param coinCount the number of coins (e.g. 3 dimes)
      @param coinType the type of the coins in the payment (e.g. value of a coin)
   */
   public void enterPayment(int coinCount, Coin coinType)
   {
  	 //-----------Start below here. To do: approximate lines of code = 1
  	 // add to the payment variable the number of coins * the value of the given coins
  	 // Hint: see class Coin 
  	 payment += coinCount * coinType.getValue();
  	 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }

   /**
      Computes the change due and resets the cash register for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
  	 //-----------Start below here. To do: approximate lines of code = 4
  	 // compute the change to return to the customer , then reset payment and totalOfItemsPurchased to 0 then return the change
  	 
    double change = payment - totalOfItemsPurchased;
    payment = 0;  
  	 totalOfItemsPurchased = 0;
  	 return change;
  	 
  	 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
   }
}
