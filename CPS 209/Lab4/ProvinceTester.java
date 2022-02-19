public class ProvinceTester 
{
	public static void main(String[] args)
	{
		Province ontario = new Province("Ontario",13600000,1076000);
		Province pei = new Province("PEI",146283,5660);

		// Expected Output:
		// Name: Ontario Population 13600000 Area 1076000.0 Density 12.639405204460967
		// Name: PEI Population 146283 Area 5660.0 Density 25.845053003533568 
		System.out.printf("%s Density: %2.2f", ontario.getProvinceStats(), ontario.getPopulationDensity());
		System.out.println();
		System.out.printf("%s Density: %2.2f", pei.getProvinceStats(), pei.getPopulationDensity());
		System.out.println("\nExpected:\nOntario Population: 13600000 Area: 1076000.0 Density: 12.64\nPEI Population: 146283 Area: 5660.0 Density: 25.85");
	
		if (ontario.compareDensity(pei) > 0)
			System.out.println("Ontario has a population density greater than PEI");
		else if (ontario.compareDensity(pei) < 0) 
			System.out.println("Ontario has a population density less than PEI");
		else 
			System.out.println("Ontario has a population density equal to PEI");
		System.out.println("Expected:\nOntario has a population density less than PEI");
	}
}
