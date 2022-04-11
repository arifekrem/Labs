/**
   A class to keep track of a single appointment.
*/
public class Appointment
{
   private String description;
   private int year;
   private int month;
   private int day;

   /**
      Initializes appointment for a given date.
      @param year the year
      @param month the month
      @param day the day
      @param description the text description of the appointment
   */
   public Appointment(int year, int month, int day, String description)
   {
      this.year = year;
      this.month = month;
      this.day = day;
      this.description = description;
   }

   /**
      Returns the year of the appointment.
      @return the year
   */
   public int getYear()
   {
      return year;
   }

   /**
      Returns the month of the appointment.
      @return the month
   */
   public int getMonth()
   {
      return month;
   }

   /**
      Returns the day of the appointment.
      @return the day
   */
   public int getDay()
   {
      return day;
   }

   /**
      Determines if the appointment is on the date given.
      @param year the year to check
      @param month the month to check
      @param day the day to check
      @return true if the appointment matches all three parameters
   */
   public boolean occursOn(int year, int month, int day)
   {
      return (year == this.year) && (month == this.month) && (day == this.day);
   }

   /**
      Converts appointment to string description.
   */
   public String toString()
   {
      return description;
   }
}

