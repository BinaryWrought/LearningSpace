/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/find-smallest-values-of-x-and-y-such-that-ax-by-0/0" target="_blank">GeeksForGeeks Basic Find Smallest Values of X and Y such that Ax - By = 0</a>
 * 
 * To summarize the challenge:
 * Given A and B find x and y such that Ax - By = 0
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SmallestXandY 
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
				int a = scanner.nextInt();                                                          //container for the given integer
                int b = scanner.nextInt();                                                          //container for the given integer
                
                int l = lcm( a, b );                                                                //find the lowest common multiple
                int x = l/a;                                                                        //x is lcm/a
                int y = l/b;                                                                        //y is lcm/b
                
				System.out.println( x + " " + y );                                                  //print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}