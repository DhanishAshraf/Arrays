import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Dhanish Ashraf
 * 6 tests to check whether interpret performs correctly.
 * For each test, I have:
 	* Defined an rating, rating, of type double.
 	* Defined the expected result, expected as a string.
 	* Ran the rating through the interpret method in the StarRating class and stored the result in the variable 'actual'.
 	* I then used assertEquals to check is actual is equal to expected and defined an error message to display
 	* if the test fails.
 */

public class StarRatingTest {

	@Test
	public void testCrap() 
	{
		double rating = 0.0;
		
		String expected = "CRAP";
		String actual = StarRating.interpret(rating);
		
		assertEquals("Failure in testCrap: The rating 0 should return ''CRAP''.", expected, actual);
	}
	
	@Test
	public void testNotRated()
	{
		double rating = -1.0;
		
		String expected = "not rated";
		String actual = StarRating.interpret(rating);
		
		assertEquals("Failure in testNotRated: The rating -1 should return 'not rated'.", expected, actual);
	}
	
	@Test
	public void testOK()
	{
		double rating = 4.47;
		
		String expected = "OK";
		String actual = StarRating.interpret(rating);
		
		assertEquals("Failure in testOK: The rating 4.47 should return 'OK'.", expected, actual);
	}
	
	@Test
	public void testExcellent()
	{
		double rating = 4.9999;
		
		String expected = "EXCELLENT";
		String actual = StarRating.interpret(rating);
		
		assertEquals("Failure in testExcellent: The rating 4.9999 should return 'EXCELLENT'.", expected, actual);
	}
	
	@Test
	public void testAbove5()
	{
		double rating = 5.0;
		
		String expected = "[HAS ONLY ONE REVIEW]";
		String actual = StarRating.interpret(rating);
		
		assertEquals("Failure in testAbove5: The rating 5.0 should return '[HAS ONLY ONE REVIEW]'.", expected, actual);
	}
	
	@Test
	public void testHigh()
	{
		double rating = 550.67;
		
		String expected = "[HAS ONLY ONE REVIEW]";
		String actual = StarRating.interpret(rating);
		
		assertEquals("Failure in testHigh: The rating 550.67 should return '[HAS ONLY ONE REVIEW]'.", expected, actual);
	}
}
