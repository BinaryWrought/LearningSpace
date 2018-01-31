/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/weak-maths/0" target="_blank">GeeksForGeeks Basic Weak Maths.</a>
 * 
 * To summarize the challenge:
 * Given an array of integers print the least common multiple of the min and max of the array.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class LeastCommonMultiple 
{
    
    /**
     * This method will return the greatest common divisor (GCD) of two given integers
     * @param a first integer
     * @param b second integer
     * @return the greatest common divisor
     */
    public static int gcd( int a, int b )
    {
        if( a == 0 )
            return b;
        
        return gcd(b%a, a);
    }
    
    /**
     * This method will return the lowest common multiple (LCM) of the two given integers
     * @param a first integer
     * @param b second integer
     * @return the lowest common multiple
     */
    public static int lcm( int a, int b )
    {
        //lcm can be found with the algorith:
        //lcm(a,b) = ab/gcd(a,b)
        int lcm = (a*b) / gcd( a, b );
        return lcm;
    }

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch an exception caused by invalid input
		{
			int t = scanner.nextInt();																//get number of test cases
			
			while( t > 0 )																			//So long as there are more test cases
			{	
				int n = scanner.nextInt();                                                          //container for the given integer
                
                int min = Integer.MAX_VALUE;                                                        //initialize the min as the max value to ensure it will be set
                int max = Integer.MIN_VALUE;                                                        //initialize the max as the min value to ensure it will be set
                
                for( int i = 0; i < n; ++i )                                                        //loop through the natural numbers stopping when the sum surpasses the given input
                {
                    int temp = scanner.nextInt();                                                   //get the next element of the array
                    if( temp > max )                                                                //if this element is greater than the max
                        max = temp;                                                                 //save it as the max
                    if( temp < min )                                                                //if this element is less than the min
                        min = temp;                                                                 //save it as the min
                }
                
				System.out.println( lcm(min, max) );                                                //print the result which is the LCM of min, max
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}