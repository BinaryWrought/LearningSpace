/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/sum-of-digits-prime-non-prime/0" target="_blank">GeeksForGeeks Basic Sum of digits prime or not prime</a>
 * 
 * To summarize the challenge:
 * Given an integer, sum its digits until it is a single digit, then print whether the sum is prime or not.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SumOfDigitsPrime 
{

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
     * This method will recursively sum all the digits of a given integer passed as a string argument
     * @param s a string representing an integer
     * @return a string representing the sum of all digits of the argument until the argument is only 1 digit in length
     */
    public static String sumDigits( String s )
    {
        int sum = 0;                                                                                //container for the sum
        
        for( int i = 0; i < s.length(); ++i )                                                       //loop through the digits of the integer
        {
            sum += Integer.parseInt( String.valueOf( s.charAt( i ) ) );                             //add the digit to the sum
        }
        
        if( Integer.toString( sum ).length() > 1 )                                                  //if the length of the sum is greater than 1 digit
            return sumDigits( Integer.toString( sum ) );                                            //sum the digits of the sum
        else
            return Integer.toString( sum );                                                         //the length of the sum is only 1 digit, return this as the final sum
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
            scanner.nextLine();                                                                     //
            
            while( t > 0 )																			//So long as there are more test cases
			{		
				String n = scanner.nextLine();                                                      //get the integer as a string in order to parse its digits

                System.out.println( ( isPrime( Integer.parseInt( sumDigits( n ) ) ) )? "P" : "NP" );//print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}