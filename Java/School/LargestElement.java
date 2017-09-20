/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.practice;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/fighting-the-darkness/0" target="_blank">GeeksForGeeks School Fighting the Darkness.</a>
 * 
 * To summarize the practice:
 * This challenge was to simply find the largest element in the array.
 * The actual problem was worded all weirdly so it was difficult to discern what exactly it wanted.
 * But it really is as simple as finding the smallest element.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class LargestElement 
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
				int days = 0;																		//number of days until dark
				int n = scanner.nextInt();
				for( int i = 0; i < n; i++ )
				{
					int value = scanner.nextInt();
					if( value > days )
						days = value;
				}
				
				System.out.println( days );
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
}