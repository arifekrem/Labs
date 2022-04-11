/**
   CreditCardTester -- to test the CreditCard class in which you have to write
   a default constructor, a constructor with parameters and a toString method.
   Change nothing here.
 */
public class CreditCardTester
{
    public static void main(String[] args)
    {
	IDCard card ;

	card = new CreditCard() ;
    // NOTE: this will automatically execute the toString() method of class CreditCard
	System.out.println(card) ;
	System.out.println("CreditCard[name = unknown][id = 000000, expires 0] WAS EXPECTED.") ;
	System.out.println(card.isExpired()) ;
	System.out.println("true WAS EXPECTED.") ;

	card = new CreditCard("Jane Doe", "123456", 1996) ;
	System.out.println(card) ;
	System.out.println("CreditCard[name = Jane Doe][id = 123456, expires 1996] WAS EXPECTED.") ;
	System.out.println(card.isExpired()) ;
	System.out.println("true WAS EXPECTED.") ;

	card = new CreditCard("Justin Time", "11223344", 2022) ;
	System.out.println(card.isExpired()) ;
	System.out.println("false WAS EXPECTED.") ;
    }
}
/**
   IDCard.java
   A IDCard object has a name and a few methods to get the name
   and format the card.  It never expires.

   There are two todo regions ... one for the default constructor and 
   one for the toString method.
 */
class IDCard
{
    private String name;
    /**
       A default constructor method that initializes name to "unknown"
    */
    public IDCard()
    {
	name = "unknown";
    }
    /**
       A constructor method that initializes name to the given parameter name1
       @param name1 the given name
    */
    public IDCard(String name1)
    {
	name = name1 ;
    }
    /**
       Accessor method for the name
       @return the name
    */
    public String getName()
    {
	return name;
    }
    /**
       Tests whether the card is expired.  
       @return false, since this type of card is never expired
    */
    public boolean isExpired()
    {
	return false;
    }
    /**
       Produces a string representation of the object
       Note: use getClass().getName() for "IDCard" so that the subclass name
       will be correct.
       @return a string representation
    */
    public String toString()
    {
	//-----------Start below here. To do: approximate lines of code = 1
	//-----------Start below here. To do: approximate lines of code = 1
	// 1. something like: "IDCard[name = Joe Turner]"
        return getClass().getName() + "[name = " + name + "]";
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
/**
   CreditCard.java
   A CreditCard object is a specialized IDCard that has an ID number
   and an expiration year.
   This contains three todo regions: one for each constructor and one for 
   the toString method.
 */
//-----------Start below here. To do: approximate lines of code = 1
//-----------Start below here. To do: approximate lines of code = 1
// 2. class CreditCard ... so that CreditCard is a subclass of IDCard
class CreditCard extends IDCard
//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
{
    private String id ;
    private int expirationYear ;
    /**
       A default constructor method to initialize  id to "000000" and expiration year to 0
    */
    public CreditCard()
    {
	super() ;
	id = "000000" ;
	expirationYear = 0 ;
    }
    /**
       A constructor method that initializes name, id and expiryYear with given values
       @param name1 the given name
       @param id1 the given id
       @param expiryYear the year the card expires
    */
    public CreditCard(String name1, String id1, int expiryYear)
    {
	//-----------Start below here. To do: approximate lines of code = 3
	//-----------Start below here. To do: approximate lines of code = 3
	// 3-5. fill in this constructor and use the super call to initialize the inherited variables - see class IDCard
	
    super(name1);
    this.id = id1;
    this.expirationYear = expiryYear;
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    /**
       Tests whether the card is expired.  
       @return true if the current year is after the expiration year
    */
    public boolean isExpired()
    {
	java.util.Calendar calendar = java.util.Calendar.getInstance() ;
	int currentYear = calendar.get(java.util.Calendar.YEAR) ;
	return expirationYear < currentYear ;
    }
    /**
       Gives a String representation for the card and instance variables
       @return the String representing this card
    */
    public String toString()
    {  
	//-----------Start below here. To do: approximate lines of code = 1
	//-----------Start below here. To do: approximate lines of code = 1
	// 6. something like: "CreditCard[name = Joe Turner][id = 1342343, expires 1999]" and use the super call
        return getClass().getName() + "[name = " + super.getName() + "]" + "[id = " + this.id + ", expires " + this.expirationYear + "]"  ;
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
