/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/amicable-pair/0" target="_blank">GeeksForGeeks Easy Amicable Pair</a>
 * 
 * To summarize the challenge:
 * Given two integers, determine if they are amicable.
 * Amicable pairs are numbers where the sum of their proper divisors is equal to the other number.
 * Example: 220 and 284 are an amicable pair.
 * Proper divisors of 220 are: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110. Sum = 284.
 * Proper divisors of 284 are: 1, 2, 4, 71, and 142. Sum = 220
 * Note that proper divisors do not include the number itself.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class AmicablePair 
{
    
    /**
     * This method will return the sum of the proper divisors - which does not include the given integer.
     * @param n the given integer for which to find the proper divisor
     * @return the sum of the proper divisors
     */
    public static int properDivisorSum( int n )
    {
        int sum = 0;                                                                                //container for the sum
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                sum += i;                                                                           //add this factor to the sum
                
                if ( i != ( n / i ) && i != 1 )                                                     //include i != 1 will ignore the factor that is the given integer
                    sum += ( n / i );                                                               //add this factor to the sum
            } 
        }
        
        return sum;                                                                                 //return the result
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
                int x = scanner.nextInt();                                                          //get the first input
                int y = scanner.nextInt();                                                          //get the second input
                
                boolean a = properDivisorSum( x ) == y;
                boolean b = properDivisorSum( y ) == x;
                
                System.out.println( ( a && b )? "1" : "0" );    //print the result
                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}