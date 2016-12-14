import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

/**
 * 
 * @author Dhanish Ashraf 
 * Class parity defines two methods, addParity and checkParity.
 * addParity takes an nxm array and returns an (n+1)x(m+1) array.
 * checkParty checks whether the extended array follows the rules. 
 *
 */
		

public class Parity 
{
	/**
	 * @param a is an mxn matrix with elements as int.
	 * @return newArray is an (m+1)x(n+1) matrix with elements as int.
	 */
	public static int[][] addParity(int[][] a) {
	
		// Creating a new array with 1 more row and column than a. 
		int[][] newArray = new int[a.length + 1][a[0].length + 1];
		//Copying the elements of a over to the new array by going through each element of a.
		for (int i = 0; i < a.length ; i++)
			{ for (int j = 0; j < a[0].length; j++)
				{ newArray[i][j] = a[i][j];
				}
			}
	
		/** Going through each row of a and keeping the total of each row.
		* If the sum or the row is odd, add a 1 to the end of the row.
		* If the sum of the row is even, add a 0 to the end of the row.
		*/
		for (int row = 0; row < a.length; row++)
		{	int totalRow = 0;		
			for (int column = 0; column < a[0].length; column++)
			{	
				totalRow += a[row][column];
				if(totalRow % 2 == 1)
					newArray[row][a[0].length] = 1;
				else 
					newArray[row][a[0].length] = 0;
			}
					
		}
		
		/** Going through each column of a and keeping the total of each column.
		* If the sum or the column is odd, add a 1 to the end of the row.
		* If the sum of the column is even, add a 0 to the end of the row.
		*/		
	for (int row = 0; row < a[0].length; row++)
		{	int totalColumn = 0;
		
			for (int column = 0; column < a.length; column++)
			{	
				totalColumn += a[column][row];
				if(totalColumn % 2 == 1)
					newArray[a.length][row] = 1;
				else 
					newArray[a.length][row] = 0;
			}	
		}		
		//returning the  new Array with the parity bits. 
		return newArray;
}
	
	/**
	 * @param a is an (m+1)x(n+1) matrix with elements as int
	 * @return is true or false on whether a follows the parity rules.
	 */
	public static boolean checkParity(int[][] a) {
		
		// Creating a new temporary array with 1 less row and column than a.
		int[][] tempArray = new int[a.length -1][a[0].length - 1];
		
		//Copying the elements of a over to the temporary array.
		for (int i = 0; i < a.length -1 ; i++)
		{ for (int j = 0; j < a[0].length -1; j++)
			{ tempArray[i][j] = a[i][j];
			}
		}
		//Adding the correct parity bits to the temporary array and assigning it to 'expectedA' array.
		int [][] expectedA = addParity(tempArray); 
		
		System.out.println(Arrays.deepToString(expectedA));
		//Checking if the expected array is equal to a and returning true or false accordingly.
		return Arrays.deepToString(expectedA).equals(Arrays.deepToString(a));
	
} 

}