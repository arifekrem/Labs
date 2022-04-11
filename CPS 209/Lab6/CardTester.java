/**
   CardTester -- to test the Card class in which you have to write
   a default constructor and a toString method.
   Change nothing here.
 */
public class CardTester
{
    public static void main(String[] args)
    {
	Card card ;

	card = new Card() ;
	System.out.println(card) ;
	System.out.println("Card[name = unknown] WAS EXPECTED") ;

	card = new Card("Jane Doe") ;
	System.out.println(card) ;
	System.out.println("Card[name = Jane Doe] WAS EXPECTED") ;
    }
}

/**
   A Card object has a name and a few methods to get the name
   and format the card.  It never expires.

   There are two todo regions ... one for the default constructor and 
   one for the toString method.
 */
class Card
{
    private String name;
    /**
       A default constructor method that initializes name to "unknown"
    */
    //-----------Start below here. To do: approximate lines of code = 2
    //-----------Start below here. To do: approximate lines of code = 2
    // 1-2. write a default constructor which sets name to "unknown"
    Card() {
        this.name = "unknown";
    }
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    /**
       A constructor method that initializes name to the given parameter name1
       @param name1 the given name
    */
    public Card(String name1)
    {
	//-----------Start below here. To do: approximate lines of code = 1
	//-----------Start below here. To do: approximate lines of code = 1
	// 3. fill in this constructor method
	    this.name = name1;
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    /**
       Accessor method for the name
       @return the name
    */
    public String getName()
    {
        return this.name;
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
       Note: use getClass().getName() for "Card" so that the subclass name
       will be correct.
       @return a string representation
    */
    //-----------Start below here. To do: approximate lines of code = 2
    //-----------Start below here. To do: approximate lines of code = 2
    // 4-5. write a toString method that produces something like: "Card[name = Joe Turner]" using getClass().getName() 
    
    public String toString() {
        return getClass().getName() + "[name = " + name + "]";
    }
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
