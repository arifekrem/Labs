
public class MenuTester
{
  public static void main(String[] args)
  {
  	 Menu menu = new Menu();
  	 
  	 menu.addOption("Lasagna");
  	 menu.addOption("Pizza Diavolo");
  	 menu.addOption("Pizza Magherita");
  	 menu.addOption("Pizza Sicilian");
  	 menu.addOption("Chicken Parmigiana");
  	 menu.addOption("Chicken Linguine");
  	 
  	 menu.print();
  	 System.out.println("Expected:\n1. Lasagna\n2. Pizza Diavolo\n3. Pizza Magherita\n4. Pizza Sicilian\n5. Chicken Parmigiana\n6. Chicken Linguine");
  	 
  	 
  	 System.out.println(menu.getOption(2));
  	 System.out.println("Expected:\nPizza Diavolo");
  	 
  	 System.out.println(menu.getOption(8));
  	 System.out.println("Expected:\n");
  	 
  }
}
