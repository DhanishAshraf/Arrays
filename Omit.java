import java.util.ArrayList;

/**
 * @author Dhanish Ashraf
 * @param from is the number to start the array list from, as int.
 * @param to is the number to end the array list at, as int.
 * @param ommittedDigit is the digit to omit from the array list, as int.
 * @return intArray as an ArrayList of integers.
 * Class Omit contains a method allIntegersWithout that displays all integers between
 * two specified numbers ('from' and 'to') that do not contain a specified digit (ommittedDigit).
 * Throughout the method we convert all integers to a string so that we can call on the Java
 * '.contain' method to omit any numbers.
 */

public class Omit 
{	// Here we define that the return type will be an array list containing integers.
	public static ArrayList<Integer> allIntegersWithout(int from, int to, int ommittedDigit)
	{ // Here we convert the integer ommittedDigit to a string for use later on.
		String ommittedString = Integer.toString(ommittedDigit);
		
		// Defining a new ArrayList called stringArray which contains strings. Initially the array is empty.
		ArrayList<String> stringArray = new ArrayList<>();  
		
		/** Adding the elements between 'from' and 'to' to stringArray by taking each integer, 
		 * converting to a string and then using the ArrayList '.add' method. */
		for (int i = from; i <= to; i++) 
		{
			String iString = Integer.toString(i);
			stringArray.add(iString);
		}	
		
		/** Removing ommittedDigit by starting from the end of the ArrayList and going 
		 * through each index of the array and using the '.contain' method to check if
		 * the ommittedString (defined at the beginning) is present and if it is
		 * present, remove it using the ArrayList '.remove' method.
		 */
		for (int j = (stringArray.size() - 1); j >= 0; j--)
		{	if (stringArray.get(j).contains(ommittedString))
				{
					stringArray.remove(j);
				}
		}
		
		/** Here we define a new ArrayList called 'intArray' which contains only Integers.
		 * intArray has been defined to be the same size at stringArray using the ArrayList
		 * '.size' method. */
		ArrayList<Integer> intArray = new ArrayList<>(stringArray.size());
		
		/** We now go through each index of intArray and for each index we convert the corresponding
		 * element in stringArray to an integer and add it to intArray using the ArrayList '.add' method.
		 */
		for (int i = 0; i < stringArray.size(); i++) 
		{
			intArray.add(Integer.parseInt(stringArray.get(i)));
		
		}
		
		// We return intArray.
		return intArray;
		
	}
}