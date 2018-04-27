/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/lucky-ishaan/0" target="_blank">GeeksForGeeks Easy Lucky Ishaan</a>
 * 
 * To summarize the challenge:
 * Given an array of IDs, sum the digits of each ID and count the number of unique IDs.
 * This is a gross simplification of the actual problem statement, but that is really what it is asking for.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class LuckyIshaan 
{
    /**
     * This method will sum the individual digits of the given long
     * @param n - the long for which the digits need to be summed
     * @return - the sum of all the digits of n
     */
    public static long sumDigits( long n )
    {
        long sum = 0;
        while ( n > 0 )
        {
            sum += n%10;
            n /= 10;
        }
        
        return sum;
    }
    
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
				int n = scanner.nextInt();															//get the number of digits of A   
                float loadFactor = 0.75f;                                                           //load factor for hash set
                int initialCapacity = (int)(n/loadFactor) + 1;                                      //initial capacity of hash set
                HashSet<Long> sumSet = new HashSet<>( initialCapacity, loadFactor );                //container for sum of IDs
                
                for( int i = 0; i < n; ++i )                                                        //loop to get all the inputs
                {
                    sumSet.add( sumDigits( scanner.nextLong()) );                                   //add the sum of the given input's digits to the hash set
                }
                
                System.out.println( sumSet.size() );                                                //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{

		}
	}
}