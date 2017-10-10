/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/red-or-green/0" target="_blank">GeeksForGeeks Basic Red or Green.</a>
 * 
 * To summarize the practice:
 * Given a string of R's and G's, print the amount of the char which shows up the least.
 * I really simplified that problem statement...
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class RedOrGreen 
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
				int whyIsNneeded = scanner.nextInt();												//I don't see the point of N in the problem statement
				String redsAndGreens = scanner.next();												//get the string of Rs and Gs
				int rs = 0;																			//container for the number of Rs
				int gs = 0;																			//container for the number of Gs
				
				for( int i = 0; i < redsAndGreens.length(); ++i )									//loop through the string of Rs and Gs
				{
					if( redsAndGreens.charAt( i ) == 'R' )											//if the char at the index is an R...
						rs++;																		//increment the Rs container
					if( redsAndGreens.charAt( i ) == 'G' )											//if the char at the index is a G
						gs++;																		//increment the Gs container
				}
				
				System.out.println( (rs < gs ) ? rs : gs );											//print the result
				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}