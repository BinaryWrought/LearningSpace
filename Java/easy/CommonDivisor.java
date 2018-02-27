/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.HashSet;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/common-divisor/0" target="_blank">GeeksForGeeks Easy Common Divisor</a>
 * 
 * To summarize the challenge:
 * Given two integers find the number of common divisors.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class CommonDivisor 
{
    
    /**
     * This method will return all of the factors of a given integer as a tree
     * @param n the integer to factor
     * @return an array list of integers that are factors of n
     */
    public static HashSet<Integer> factorsAsHashSet( int n )
    {
        HashSet<Integer> result = new HashSet<>();                                                  //container for the result
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                result.add( i );                                                                    //add this factor to the result
                result.add( n / i );                                                                //add this factor to the result (note the check for sameness wasn't needed as this is a tree set)
            } 
        }
        
        return result;                                                                              //return the result
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
                int p = scanner.nextInt();                                                          //get the first input
                int q = scanner.nextInt();                                                          //get the second input
                
                HashSet<Integer> pFactors = factorsAsHashSet( p );                                  //get a set of all the factors of p
                HashSet<Integer> qFactors = factorsAsHashSet( q );                                  //get a set of all the factors of q
                
                pFactors.retainAll( qFactors );                                                     //intersection of the two sets is all elements in both sets
                
                System.out.println( pFactors.size() );                                              //challenge is to find the number of common divisors - hence the size of the intersection
                        
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}