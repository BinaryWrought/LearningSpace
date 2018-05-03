/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/the-even-array/0" target="_blank">GeeksForGeeks Easy The Even Array</a>
 * 
 * To summarize the challenge:
 * Given an string of Es and Os representing even or odd integers determine the minimum number of 1s needed to convert all the odd numbers to even.
 * Whenever an element is converted from odd to even all neighboring odd numbers also become even.
 * This works in a chain effect, so the string "OOOO" only requires a single 1 because when you add 1 to the first O the next then becomes even, then the next, and so on.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class EvenArray 
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
                String arr = scanner.next();                                                        //get the input string
                int totalOnes = 0;                                                                  //container for the results
                
                for( int i = 0; i < arr.length(); ++i )                                             //loop through all the characters in the input string
                {
                    if( arr.charAt( i ) == 'O' )                                                    //if this element is odd
                    {
                        totalOnes++;                                                                //increase the total count by one

                        while( i < arr.length() && arr.charAt( i ) == 'O' )                         //loop through the rest of the string to find neighboring odd elements
                        {
                            i++;                                                                    //so long as there is a neighboring odd element, move the index
                        }
                    }
                }
                
                System.out.println( totalOnes );                                                    //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}