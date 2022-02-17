
public class CounterTester
{
	public static void main(String[] args)
  {
		  Counter c1 = new Counter();
		  c1.setLimit(100);
		  
		  for (int i = 0; i < 50; i++)
		  {
		  	c1.count();
		  }
		  System.out.println("Tally: " + c1.getValue());
		  System.out.println("Expected:\nTally: 50");
		  
		  for (int i = 0; i < 51; i++)
		  {
		  	c1.count();
		  }
		  System.out.println("Tally: " + c1.getValue());
		  System.out.println("Expected:\nLimit Exceeded");
		  System.out.println("Tally: 0");
		  
		  Counter c2 = new Counter();
		  c2.setLimit(0);
		  
		  for (int i = 0; i < 5; i++)
		  {
		  	c2.count();
		  }
		  System.out.println("Tally: " + c2.getValue());
		  System.out.println("Expected:\nLimit Exceeded\nLimit Exceeded\nLimit Exceeded\nLimit Exceeded\nLimit Exceeded");
		  System.out.println("Tally: 0");
  }
}
