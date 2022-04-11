import java.util.Calendar ;
/**
   RaceHorseTester -- to test the RaceHorse class in which you have to write
   a default constructor, a constructor with parameters and a toString method.
   Change nothing here.
 */
public class RaceHorseTester
{
    public static void main(String[] args)
    {
	RaceHorse horse ;

	horse = new RaceHorse() ;
	System.out.println(horse) ;
	java.util.Calendar rightNow = java.util.Calendar.getInstance() ;
	int year = rightNow.get(java.util.Calendar.YEAR) ;
	System.out.println("RaceHorse[name = Horse, year = "
			   + year + "][trainer = tbd, wins = 0, places = 0, losses = 0] WAS EXPECTED") ;

	horse = new RaceHorse("Blaze", 2009, "Charles Chase") ;
	horse.record(2) ;
	horse.record(0) ;
	horse.record(0) ;
	horse.record(2) ;
	horse.record(2) ;
	horse.record(1) ;
	System.out.println(horse) ;
	System.out.println("RaceHorse[name = Blaze, year = 2009][trainer = Charles Chase, wins = 1, places = 3, losses = 2] WAS EXPECTED") ;
    }
}
/**
   A Horse object has a name and a year of birth.
   The day of birth is always January 1.

   There are two todo regions ... one for the default constructor and 
   one for the toString method.

   Note: a nice way to get the current year is:
	java.util.Calendar calendar = java.util.Calendar.getInstance() ;
	year = calendar.get(java.util.Calendar.YEAR) ;
   or if you import java.util.Calendar:
	Calendar calendar = Calendar.getInstance() ;
	year = calendar.get(Calendar.YEAR) ;

   Similarly for the current month.
 */
class Horse
{
    private String name ;
    private int year ;
    /**
       A default constructor method to initialize name and year with default name and year
    */
    public Horse()
    {
	name = "Horse";
	java.util.Calendar calendar = java.util.Calendar.getInstance() ;
	year = calendar.get(java.util.Calendar.YEAR) ;
    }
    /**
       A default constructor method that initializes name and year with given name and year of birth
       @param name1 the given name
       @param year the year of birth
    */
    public Horse(String name1, int year)
    {
	name = name1 ;
	this.year = year ;
    }
    /**
       Produces a string representation of the object
       Note: use getClass().getName() rather than "Horse", so that the 
       subclass name will be correct.
       @return a string representation
    */
    public String toString()
    {
	//-----------Start below here. To do: approximate lines of code = 1
	//-----------Start below here. To do: approximate lines of code = 1
	// 1. something like: "Horse[name = Lucky Star, year = 2014]"
	    return getClass().getName() + "[name = " + name + ", year = " + year + "]";
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
/**
   A RaceHorse is a specialized horse that has a trainer.
   A Horse object has a name and a year of birth.
   The day of birth is always January 1.

   Find the todo regions below.
 */
//-----------Start below here. To do: approximate lines of code = 1
//-----------Start below here. To do: approximate lines of code = 1
// 2. class ... so that class RaceHorse is a subclass of Horse
class RaceHorse extends Horse
//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
{
    private String trainer ;
    private int wins ;
    private int places ;
    private int losses ;
    /**
       A default constructor method that initializes inherited variables as well as added variables trainer, wins, places, losses
       The default trainer is "tbd".
       The wins, places, and  losses start at zero.
    */
    public RaceHorse()
    {
	super() ;
	trainer = "tbd" ;
	wins = places = losses = 0 ;
    }
    /**
       A constructor method to initialize inherited name variable and variables year and trainer with given parameter variables
       and sets the wins places and losses to zero.
       @param name1 the given name
       @param year the year of birth
       @param trainer the name of the trainer
    */
    public RaceHorse(String name1, int year, String trainer)
    {
	//-----------Start below here. To do: approximate lines of code = 2
	//-----------Start below here. To do: approximate lines of code = 2
	// 3. super call to initialize inherited name (HINT: use super() call with appropriate parameter )
	    super(name1, year);
	//4. trainer
        this.trainer = trainer;
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	wins = places = losses = 0 ;
    }
    /**
       Records result of a race, incrementing one of wins, places, losses
       @param code the result of the race: 1 = win, 2 = place, 0 = loss
     */
    public void record(int code) 
    {
	if (code == 0)
	    losses ++ ;
	else if (code == 1)
	    wins ++ ;
	else
	    places ++ ;
    }
    /**
       Produces a string representation of the object
       @return a string representation
    */
    public String toString()
    {
	//-----------Start below here. To do: approximate lines of code = 2
	//-----------Start below here. To do: approximate lines of code = 2
	// 5-6. something like: "RaceHorse[name = Lucky Star, year = 2011][trainer = Billy Wonder, wins = 1, places = 2, losses = 10]" and use super call
        return super.toString() + "[trainer = " + trainer + ", wins = " + wins + ", places = " + places + ", losses = " + losses + "]";
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
