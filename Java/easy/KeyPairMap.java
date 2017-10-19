/*
 * This is free to use as it was only made for practice.
 */

package easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/key-pair/0" target="_blank">GeeksForGeeks Easy Key Pair</a>
 * 
 * To summarize the practice:
 * Given an array of numbers, and another number X, determine if two numbers in the array sum to X.
 * This solution uses a hash map with a time complexity of O(n) if the range is known.
 * 
 * I finally understand this solution. This trick is used in a bunch of different challenges.
 * Technically, there is no HashMap anywhere in the solution.
 * What is happening is an array of booleans is created with the same size as the maximum number of inputs.
 * When an integer is given for the array, that means that that integer is present - this is the key.
 * So use that element's value as the index to the boolean array and set that to true - because this element exists within the array.
 * Now, to find the actual pair...
 * Loop through the array of inputs as you go, subtract the element from the sum.
 * The remainder is the difference. This is important.
 * If the DIFFERENCE exists within the boolean array this implies that the sum can be found.
 * So just check if booleanArray [ difference ] == true.
 * If so, then the pair is the element in the array: arr[ i ] and DIFFERENCE.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class KeyPairMap 
{

	private static final int MAX = 200; // Max size of Hashmap
	
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			int t = scanner.nextInt();																//get number of test cases
			
			while( t > 0 )																			//So long as there are more test cases
			{		
				int n = scanner.nextInt();															//get the size of the array
				int x = scanner.nextInt();															//get the sum to look for
				int[] arr = new int[n];																//container for input
				for( int i = 0; i < n; ++i )														//loop to populate array
				{
					arr[i] = scanner.nextInt();														//populate array
				}
				
				System.out.println( findPair( arr, x )? "Yes" : "No");								//print result
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
 
	/**
	 * This method will find the pair of elements in the array that add to the specified sum.
	 * 
	 * @param arr the array of integers to check elements for a given sum
	 * @param sum the sum to be found by adding elements from arr
	 * @return true if the sum was found, false if not
	 */
    static boolean findPair( int arr[], int sum )
    {        
        boolean[] binmap = new boolean[ MAX ];														//Container of possible elements. False means the element does not exist, true it does
		boolean found = false;																		//flag for when a pair of elements is found to sum to x
 
        for ( int i = 0; i < arr.length; ++i )														//loop through all the elements in the array
        {
            int temp = sum - arr[ i ];																//find the difference between this sought after sum and this array element
 
            if (temp >= 0 && binmap[ temp ] )														//temp is now the REMAINDER of what is needed to add to SUM. if the boolean for that element is true, then that element exists, therefore, the sum is found.
            {
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", "+temp+")");//from the original solution this prints the pairs that make up the sum to x
				found = true;																		//set the flag - could be used to break the loop when looking for a single pair
            }
            binmap[ arr[ i ] ] = true;																//this says that this element exists.
        }
		return found;																				//return the result
    }	
}