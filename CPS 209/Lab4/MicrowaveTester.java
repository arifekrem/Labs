public class MicrowaveTester 
{
    public static void main(String[] args) 
    {
       
        Microwave appliance = new Microwave();
        
        appliance.increaseTime();
        appliance.increaseTime();
        appliance.increaseTime();
        appliance.switchPower();
        
        appliance.start();
        System.out.println("Expected:\nCooking for 90 seconds at power HIGH");
        
        appliance.reset();
        
        appliance.increaseTime();
        appliance.switchPower();
        appliance.switchPower();
        appliance.start();
        System.out.println("Expected:\nCooking for 30 seconds at power LOW");
        
    }
}
