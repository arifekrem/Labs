import java.time.chrono.ThaiBuddhistChronology;

/**
   A class to keep track of, print, and compare addresses with and 
   without apartment numbers.
 */
public class Address
{
	private String streetNumber;
	private String apartment;
	private String street;
	private String city;
	private String province;
	private String postalCode;

	/**
      Constructs an address with everything but an apartment number.
      @param streetNumber the house number as a string
      @param street the street as a string
      @param city the city as a string
      @param state the state as a string
      @param postalCode the postal code as a string
      
	 */
	public Address(String streetNumber, String street, String city, String province, String postalCode)
	{
		this.streetNumber = streetNumber;
		this.apartment = "";
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	/**
      Constructs an address with an apartment number
      @param streetNumber the house number as a string
      @param apartment the apartment number as a string
      @param street the street as a string
      @param city the city as a string
      @param state the state as a string
      @param postalCode the postal code as a string
	 */
	public Address(String streetNumber, String apartment, String street,
			String city, String province, String postalCode)
	{
		this.streetNumber = streetNumber;
		this.apartment = apartment;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	public String toString()
	{
		return "[" + streetNumber + " " + street + " " + apartment + city + ", " + province + " " + postalCode + "]";
	}

	/**
      Compares two addresses by first comparing province, then city, street, streetNumber, apartment
      This method must have the given signature as it is inherited from superclass Object
      @param other the other address
      @return true if the addresses are equal, false otherwise
	 */
	public boolean equals(Object other)
	{
		Address otherA = (Address) other;
		//-----------Start below here. To do: approximate lines of code = 3
		// compare the province, city, street, streetNumber, and apartment of this address and the other address otherA. If all are equal, return true
		// else return false. We will study the inherited equals method in class this week 
		
		if (this.streetNumber.equals(otherA.streetNumber) && this.apartment.equals(otherA.apartment) && this.street.equals(otherA.street) && this.city.equals(otherA.city) && otherA.province.equals(otherA.province) && this.postalCode.equals(otherA.postalCode)) {
			return true;	
		}
		return false;
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
}
