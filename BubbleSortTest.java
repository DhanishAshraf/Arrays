import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Dhanish Ashraf
 * 4 tests to check whether bubbleSort performs correctly.
 * For each test, I have:
 	* Defined an array, a, of integers.
 	* Defined the expected result, expected.
 	* Ran the array, a, through the bubbleSort method in the BubbleSort class and stored the result 
 	* in the variable 'actual'.
 	* I then used assertEquals to check is actual is equal to expected and defined an error message to display
 	* if the test fails.
 */

public class BubbleSortTest {
	
	@Test 
	public void test1() 
	{
		
		int [] a = {8, 6, 4, 2, 1};
		int[] expected = {1, 2, 4, 6, 8};
		int [] actual = BubbleSort.bubbleSort(a);
		
		assertArrayEquals("The array is not in ascending order", expected, actual);
	}

	@Test 
	public void test2() {
		
		int[] a = {5, 10, 5, 20, 5, 10, 5, 20, 5, 30};
		
		
		int[] expected = {5, 5, 5, 5, 5, 10, 10, 20, 20, 30};
		int[] actual = BubbleSort.bubbleSort(a);
		
		assertArrayEquals("The array is not in asscending order", expected, actual);
	}
	
	@Test 
	public void test3() {
		
		int[] a = {1, 5, 6, 3, 2, 7, 9, 6, 8, 4, 3, 8, 5, 4, 9, 0, 2};
		
		
		int[] expected = {0, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9};
		int[] actual = BubbleSort.bubbleSort(a);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test 
	public void test4() {
		
		int[] a = {0, 98, 91, 84, 77, 70, 63, 56, 49, 42, 35, 28, 21, 14, 7, 0};
		
		
		int[] expected = {0, 0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98};
		int[] actual = BubbleSort.bubbleSort(a);
		
		assertArrayEquals(expected, actual);
	}
}
