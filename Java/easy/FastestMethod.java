/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/the-fastest-method/0" target="_blank">GeeksForGeeks Easy The Fastest Method</a>
 * 
 * To summarize the challenge:
 * Given a floor, and three methods of descending the floors (elevator, stairs, or escalator), determine which method is fastest.
 * In the event the methods take the same amount of time give preference to elevator, then stairs, then escalator.
 * Print 1 for elevator, 2 for stairs, 3 for escalator.
 * 
 * GFG gave the formula for elevator: N/V
 * And for stairs and escalator: (N*sqrt(2))/V
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FastestMethod 
{

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
                int n = scanner.nextInt();                                                          //get the number of floors to traverse
                int v1 = scanner.nextInt();                                                         //get the speed of the elevator
                int v2 = scanner.nextInt();                                                         //get the speed of the stairs
                int v3 = scanner.nextInt();                                                         //get the speed of the escalator
                
                double t1 = (double)n/v1;                                                           //cast to double because remember that an int/int returns an int in java but I need those decimal points!
                double t2 = ( n * Math.sqrt( 2 ) ) / v2;                                            //formula as given by GFG for speed of stairs
                double t3 = ( n * Math.sqrt( 2 ) ) / v3;                                            //formula as given by GFG for speed of escalators 
                
                System.out.println( ( t1 < t2 && t1 < t3 ) ? 1 : ( t2 < t1 && t2 < t3 ) ? 2 : 3 );  //check out that nested ternary. kind of ugly at first glance, but better than three if then statements
                                             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}