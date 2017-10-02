/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/find-k-th-character-in-string/0" target="_blank">GeeksForGeeks Basic Find k-th character in string.</a>
 * 
 * To summarize the practice:
 * Given a decimal number 'm', convert it to binary, perform 'n' iterations, then return the 'k' character.
 * One iteration is: for every 0 in the binary string make it 01. For every 1 in the binary string make it 10.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FindKCharacter 
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
				int m = scanner.nextInt();
				int k = scanner.nextInt();
				int n = scanner.nextInt();
				String binary = Integer.toBinaryString( m );
				
				for( int i = 0; i < n; i++ )
				{
					String temp = "";
					
					for( int j = 0; j < binary.length(); j++ )
					{
						if( binary.charAt( j ) == '0' )
							temp += "01";
						else
							temp += "10";
					}
					binary = temp;
				}
				
				System.out.println( binary.charAt( k ) );				
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}