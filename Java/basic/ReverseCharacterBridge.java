/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/pattern-for-reverse-character-bridge/0" target="_blank">GeeksForGeeks Basic Pattern for Reverse Character Bridge</a>
 * 
 * To summarize the practice:
 * Given an integer denoting the number of characters starting from A, print the character bridge pattern.
 * For example, 3 would look like: ABCBA, AB BA, A  A (new lines between each of those, and 1 space for each character removed)
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ReverseCharacterBridge 
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
				int n = scanner.nextInt();                                                          //get the int that is the input    
                int temp = n;
                
                for( int i = 0; i < n; ++i )
                {
                    char c = 'A';
                    for( int j = 0; j < temp; ++j )
                        System.out.print( c++ );
                    for( int j = 0; j < ( ( n - temp ) * 2 ) - 1; ++j )
                       System.out.print( " " ); 
                    
                    if( n == temp )
                        c--;
                    c--;
                    
                    for( int j = 0; j < temp; ++j )
                    {
                        if( c < 'A' )
                            continue;
                        else
                            System.out.print( c-- );
                    }

                    temp--;
                    System.out.println();
                }                
                
                System.out.println();
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}