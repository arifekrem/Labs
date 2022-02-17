/**
   A class to test the Automobile class.
*/
public class AutomobileTester
{
   /**
      Tests the methods of the Automobile class.
      @param args not used
   */
   public static void main(String[] args)
   {
      Automobile myHybrid = new Automobile(15);
      myHybrid.addGas(20);
      myHybrid.drive(150);
      System.out.printf("%.2f\n", myHybrid.getGasInTank());
      System.out.println("Expected:");
      System.out.println("10.00");
      //More driving and fueling
      System.out.println("After more driving and fueling:");
      myHybrid.addGas(50);
      myHybrid.drive(69);
      myHybrid.drive(49);
      System.out.printf("%.2f\n", myHybrid.getGasInTank());
      System.out.println("Expected:");
      System.out.println("52.13");
   }
}



