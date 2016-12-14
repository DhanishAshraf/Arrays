/**
 * 
 * @author Dhanish Ashraf
 * @param numbers is the set of numbers to sort as 1 dimensional int array.
 * @return is numbers, which has now been sorted as as 1 dimensional int array.
 * The class BubbleSort implements a method that will take an integer array 
 * called numbers and then go through the array and arrange the elements
 * in ascending order.
 */


public class BubbleSort 
{
	public static int[] bubbleSort(int[] numbers)
	{
		int l = numbers.length; //Storing the length of the array, numbers, in the variable l. 
		int temp = 0; // Creating a temporary variable, temp, (with the value 0) for use later on.
		
		for (int iteration = 0; iteration < l-1; iteration++) // go through the array up to (l-1) times
		{// For each time we go through the array, starting from the back of the array, do the following:
			for (int p = l-1; p > 0; p-- ) 
			{ // Starting from the last index, up to the first element, do the following:
				if (numbers[p] < numbers[p - 1])
				{ // if the element at index p is less than the element at index (p-1), do:
					temp = numbers[p]; // Assign the element at index p to the variable 'temp'.
					numbers[p] = numbers[p-1]; // Assign the element at index (p-1) to to the index p.
					numbers[p-1] = temp; // Assign the value of the 'temp' variable to the index p.
				} // All we have done is swap any elements which which are less than its preceding element.
			} 
		/**
		 *  The for statements will terminate when the if statement returns false.
		 *  i.e. when no element is less than its preceding element.
		 */
		}
		
		for (int i = 0; i < numbers.length; i++)
		{ //for each index of the array, numbers, do the following:
			System.out.print(numbers[i] + " "); //print the corresponding element at that index.
		}
		
		// Return the array, numbers.
		return numbers;
	}	
}
