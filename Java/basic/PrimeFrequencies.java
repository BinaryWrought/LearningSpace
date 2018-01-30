/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/numbers-with-prime-frequencies-greater-than-or-equal-to-k/0" target="_blank">GeeksForGeeks Basic Numbers with prime frequencies greater than or equal to k</a>
 * 
 * To summarize the challenge:
 * Given an array of integers, print the numbers with an odd frequency greater than or equal to input K.
 * The output should be in sorted order. Print -1 if no inputs satisfy.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class PrimeFrequencies 
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
				int n = scanner.nextInt();                                                          //get the integer that is the size of the array 
                int k = scanner.nextInt();                                                          //get the integer that is the requested frequency 
                
                TreeMap<Integer, Integer> map = new TreeMap<>();                                    //container for integers
                for( int i = 0; i < n; ++i )                                                        //loop to the get the array of integers
                {
                    int a = scanner.nextInt();                                                      //get the integer
                    
                    if( !map.containsKey( a ) )                                                     //if the map doesn't already have this key
                        map.put( a, 1);                                                             //add the key with the initial value of 1
                    else
                        map.put( a, map.get( a ) + 1 );                                             //otherwise just add 1 to the key
                }
                boolean found = false;                                                              //flag to check if something satisfied the requirement
                for( Map.Entry<Integer, Integer> m : map.entrySet() )                               //loop through the map 
                {
                    if( m.getValue() >= k && isPrime( m.getValue() ) )                              //check if the frequency is greater than or equal to K and that the frequency is prime
                    {
                        System.out.print( m.getKey() + " " );                                       //if so, print the number
                        found = true;                                                               //set the flag indicating that something was found
                    }
                }

                System.out.println( ( found )? "" : "-1");                                          //if nothing was found print a -1, else just end the line for the next test case
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}