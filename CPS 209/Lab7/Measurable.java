public interface Measurable
{
	double getMeasure();

	/**
   Computes the smallest of the measures of the given objects.
   @param objects an array of Measurable objects
   @return the object with the smallest measure, null if array is empty
	 */
	static Measurable smallest(Measurable[] objects)
	{
		if (objects.length == 0)
		{
			return null;
		}
		Measurable min = objects[0];
		for (Measurable obj : objects)
		{
			if (obj.getMeasure() < min.getMeasure())
			{
				min = obj;
			}
		}
		return min;
	}

	/**
   Computes the largest of the measures of the given objects.
   @param objects an array of Measurable objects
   @return the object with the largest measure, null if array is empty
	 */
	static Measurable largest(Measurable[] objects)
	{
		if (objects.length == 0)
		{
			return null;
		}
		Measurable max = objects[0];
		for (Measurable obj : objects)
		{
			if (obj.getMeasure() > max.getMeasure())
			{
				max = obj;
			}
		}
		return max;
	}
}
