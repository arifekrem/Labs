import java.util.ArrayList;
import java.util.Collections;

public class CarSorter 
{
	public static void main(String[] args)
	{
		ArrayList<Car>  list = new ArrayList<Car>();

		Car car;

		car = new Car("BMW",5/100.0); // 5 Liters per 100 KM
		car.addGas(20.0); // 20 Liters
		list.add(car);

		car = new Car("Audi",12/100.0); // 5 Liters per 100 KM
		car.addGas(10.0); // 20 Liters
		list.add(car);

		car = new Car("Mercedes",1/100.0); // 5 Liters per 100 KM
		car.addGas(50.0); // 20 Liters
		list.add(car);

		car = new Car("Prius",25/100.0); // 5 Liters per 100 KM
		car.addGas(25.0); // 20 Liters
		list.add(car);

		car = new Car("Corolla",17/100.0); // 5 Liters per 100 KM
		car.addGas(43.0); // 20 Liters
		list.add(car);

		for (Car c: list)	
		{
			System.out.println(c);
		}
		System.out.println("After sorting based on fuel efficiency:");
		Collections.sort(list);
		for (Car c: list)	
		{
			System.out.println(c);
		}
		System.out.println("Expected:");
		System.out.println("Name: Mercedes Gas Level: 50.0 FuelEfficiency: 0.01");
		System.out.println("Name: BMW Gas Level: 20.0 FuelEfficiency: 0.05");
		System.out.println("Name: Audi Gas Level: 10.0 FuelEfficiency: 0.12");
		System.out.println("Name: Corolla Gas Level: 43.0 FuelEfficiency: 0.17");
		System.out.println("Name: Prius Gas Level: 25.0 FuelEfficiency: 0.25");
	
	}



}
