// interface Filter filters out objects based on whether an (double) attribute of the object
// is within a specified range
public interface Filter
{
	// method inRange returns true if the attribute is >= low and <= high, returns false otherwise
	boolean inRange(double low, double high);
}
