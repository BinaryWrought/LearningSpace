/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/find-the-number-which-contain-the-digit-d/0" target="_blank">GeeksForGeeks Easy Find the Number which contain the digit d</a>
 * 
 * To summarize the challenge:
 * Given two numbers, N and D print every single number from 0 through N that contain the digit D.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class TheDigitD 
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
				int n = scanner.nextInt();															//get the number N 
                String d = Integer.toString( scanner.nextInt() );									//get the digit D 
                
                boolean found = false;
                for( int i = 0; i <= n; ++i )                                                       //loop from 0 through n
                {
                    String num = Integer.toString( i );                                             //get a string of the number i
                    if( num.contains( d ) )                                                         //check if i contains the digit D
                    {
                        System.out.print( num + " " );                                              //print the number containing D
                        found = true;
                    }
                }
                
                System.out.println( (!found) ? "-1" : "" );                                         //print -1 if no digits found            
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}