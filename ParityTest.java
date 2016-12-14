import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Dhanish Ashraf
 * 6 tests to check whether the addParity and checkParity methods works.
 * Each test has an 2 dimensional array of integers, a.
 * The tests use assertArrayEquals to determine whether addParity works 
 * and assertTrue and assertFalse to determine whether checkParity works.
 */

public class ParityTest {

	@Test
	public void test1() {
		  int[][] a = {{1,1,1,1,1},
                           {0,0,0,0,0},
                           {1,1,1,0,0}};
		  
		 
		  //expected array after adding parity bits
		  int [][] expected = {{1, 1, 1, 1, 1, 1},
		                       {0, 0, 0, 0, 0, 0},
		                       {1, 1, 1, 0, 0, 1},
		                       {0, 0, 0, 1, 1, 0}};
		  
		  int [][] actual = Parity.addParity(a);
		  assertArrayEquals("The correct array was not returned.", expected, actual);
	}

	
	@Test
	public void test2() {
		  int[][] a = {{0,0,1,0,0},
                       {1,0,0,0,0},
                       {1,0,1,0,1}};
		  
		assertFalse("The correct array was not returned.", Parity.checkParity(a));
	}


	@Test
	public void test3() {
		  int[][] a = {{0,1,0,1,0},
                       {1,0,1,1,1},
                       {1,0,0,0,1}};
		  
		  assertTrue("The correct array was not returned.", Parity.checkParity(Parity.addParity(a)));
	}


	@Test
	public void test4() {

		  int[][] a = {{0,0,0,0,0},
	                       {0,0,0,0,0},
	                       {0,0,0,0,0}};
		  
		  //expected array after adding parity bits
		  int [][] expected = {{0,0,0,0,0,0},
		                       {0,0,0,0,0,0},
		                       {0,0,0,0,0,0},
		                       {0,0,0,0,0,0}};
		  
		
		 int  [][] actual = Parity.addParity(a);
		 assertArrayEquals("The correct array was not returned.", expected, actual);
	}

	@Test
	public void test5() {

		  int[][] a = {{1,1,1,1,1},
	                           {1,1,1,1,1},
	                           {1,1,1,1,0}};
		  
		 assertFalse(Parity.checkParity(a));
	}
	
	@Test
	public void test6() {

		  int[][] a = {{1,1,1,1,0},
	                       {1,1,1,1,1},
	                       {1,1,1,1,1}};
		  
		 assertTrue("The correct array was not returned.", Parity.checkParity(Parity.addParity(a)));
	
	}	
	
}