import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author Dhanish Ashraf
 * 4 tests to check the Omit.allIntegersWithout method.
 * For each test I have: 
	 * Defined the expected array as a list.
	 * Defined the actual array by calling the method from the Omit file.
	 * Checking expected and actual are equal by using the assertEquals method. 
	 * I've also included an error message explaining the problem should the test fail.
 */

public class OmitTest 
{

	@Test
	public void test1() 
	{ // Here we test the method by omitting all digits containing a 1 between 11 and 22.
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(20, 22));
		ArrayList<Integer> actual = Omit.allIntegersWithout(11, 22, 1);
		
		assertEquals("The ArrayList contained the ommittedDigit.", expected, actual);
	}
	
	@Test
	public void test2()
	{ // Here we test the method by omitting all digits containing a 1 between 0 and 20.
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 2, 3, 4, 5, 6, 7, 8, 9, 20));
		ArrayList<Integer> actual = Omit.allIntegersWithout(0, 20, 1);
		
		assertEquals("The ArrayList contained the ommittedDigit.", expected, actual);
	}
	
	@Test 
	public void test3()
	{ // Here we test the method by omitting all digits containing a 2 between 5 and 30.	
		ArrayList<Integer> expected = new ArrayList<>
		(Arrays.asList(5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 30));
		ArrayList<Integer> actual = Omit.allIntegersWithout(5, 30, 2);
		
		assertEquals("The ArrayList contained the ommittedDigit.", expected, actual);
	}
	
	@Test 
	public void test4()
	{ // Here we test the method by omitting all digits containing a 5 between 50 and 59.
		ArrayList<Integer> expected = new ArrayList<>
		(Arrays.asList());
		ArrayList<Integer> actual = Omit.allIntegersWithout(50, 59, 5);
		
		assertEquals("The ArrayList contained the ommittedDigit.", expected, actual);
	}

}
