/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/check-if-the-number-is-balanced/0" target="_blank">GeeksForGeeks Basic Check if the number is balanced</a>
 * 
 * To summarize the practice:
 * Given an odd digit number sum all the digits to the left of the middle digit and compare to the sum of the digits to the right of the middle digit.
 * Print 0 if not balanced, 1 if so.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class BalancedNumber 
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
			scanner.nextLine();
			while( t > 0 )																			//So long as there are more test cases
			{		
				String s = scanner.nextLine();                                                      //get the string that is the input sentence
                int front = 0;
                int rear = s.length()-1;
                int frontSum = 0;
                int rearSum = 0;
                for( int i = 0; i < s.length()/2; ++i )
                {
                    frontSum += Integer.parseInt( String.valueOf( s.charAt( front ) ) );
                    rearSum += Integer.parseInt( String.valueOf( s.charAt( rear ) ) );
                    front++;
                    rear--;
                }
                
                System.out.println( ( frontSum == rearSum )? "1" : "0" );                           //print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}