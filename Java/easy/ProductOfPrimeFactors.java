/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/product-of-prime-factors/0" target="_blank">GeeksForGeeks Easy Product of Prime Factors</a>
 * 
 * To summarize the challenge:
 * Given an integer, print the product of its prime factors.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ProductOfPrimeFactors 
{

    /**
     * This method will return all of the prime factors of a given integer in an array list
     * @param n the integer to factor
     * @return an array list of integers that are factors of n
     */
    public static ArrayList<Integer> primeFactors( int n )
    {
        ArrayList<Integer> result = new ArrayList<>();                                              //container for the result
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                if( isPrime( i ) )                                                                  //check if the factor is prime before adding to the result
                    result.add( i );                                                                //add this factor to the result
                
                if ( i != ( n / i ) )                                                               //if n/i is not the same number as i then include it in the result
                {
                    if( isPrime( n / i ) )                                                          //check if the factor is prime before adding to the result
                        result.add( n / i );                                                        //add this factor to the result
                }
            } 
        }
        
        return result;                                                                              //return the result
    }
    
    /**
     * This method will determine if the given integer is a prime number.
     * @param n the integer to check if it is prime or not
     * @return true if n is prime, else false
     */
    public static boolean isPrime( int n )
    {
        if( n <= 1 )
            return false;
        
        for( int i = 2; i <= Math.sqrt( n ); ++i )
        {
            if( n % i == 0 )
                return false;
        }
        return true;
    }
    
    /**
     * This method takes the list of prime factors and calculates the product
     * @param a an array list of prime factors
     * @return the product of the prime factors
     */
    public static int productOfPrimeFactors( ArrayList<Integer> a )
    {
        if( a.isEmpty() )
            return 0;
        else
        {
            int product = a.get( 0 );
            for( int i = 1; i < a.size(); i++ )
            {
                product *= a.get( i );
            }
            return product;
        }
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
				int n = scanner.nextInt();															//get the number to find the prime factors of             
                
                System.out.println( productOfPrimeFactors( primeFactors( n ) ) );                   //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}