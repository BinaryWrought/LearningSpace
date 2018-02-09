/*
 * This is free to use as it was only made for practice.
 */

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/full-prime/0" target="_blank">GeeksForGeeks Basic Full Prime</a>
 * 
 * To summarize the challenge:
 * Given an integer N, check if it is "full prime."
 * Full prime is defined as the number itself is prime and all of its digits are also prime.
 * 
 * I'm including this challenge because of the method to determine if a given number is a prime number.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FullPrime 
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
     * Determine if the given string is a full prime number.
     * Full prime is defined as the number is prime and each of its digits are prime.
     * @param s a string representation of the number to check for full prime
     * @return true if the given number is full prime, false if not
     */
    public static boolean isFullPrime( String s )
    {
        int n = Integer.parseInt( s );
        if( !isPrime( n ) )
            return false;
        else
        {
            for( int i = 0; i < s.length(); ++i )
            {
                if( !isPrime( Integer.parseInt( String.valueOf( s.charAt( i ) ) ) ) )
                    return false;
            }
        }
        return true;
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
				String s = scanner.nextLine();                                                      //get the string that is the input 
                System.out.println( isFullPrime( s )? "Yes" : "No" );                               //print the result of the check for full prime
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}