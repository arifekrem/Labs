
import java.util.Scanner;

/**
   Demonstration of the appointment classes
 */
public class AppointmentTester
{

	public static void main(String[] args)
	{
		Appointment[] appointments = new Appointment[2];
		appointments[0] = new Daily(2000, 8, 13, "Brush your teeth");
		appointments[1] = new Monthly(2003, 5, 20, "Visit grandma");

		String dates0 = "2000 9 13 2000 6 13 2001 8 13 2000 8 14";
		String dates1 = "2003 4 20 2003 7 20 2004 5 20 2002 5 20";
		Scanner in = new Scanner(dates0);
		int year, month, day;

		while (in.hasNextInt())
		{
			year = in.nextInt();
			month = in.nextInt();
			day = in.nextInt();

			if (appointments[0].occursOn(year, month, day))
			{
				System.out.println(appointments[0]);
			}
		}
		System.out.println("Expected:\nBrush your teeth\nBrush your teeth\nBrush your teeth");
		
		in = new Scanner(dates1);
		while (in.hasNextInt())
		{
			year = in.nextInt();
			month = in.nextInt();
			day = in.nextInt();
			
			if (appointments[1].occursOn(year, month, day))
				System.out.println(appointments[1]);
		}
		System.out.println("Expected:\nVisit grandma\nVisit grandma");
	}
}


