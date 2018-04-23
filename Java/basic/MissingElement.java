/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/k-th-missing-element/0" target="_blank">GeeksForGeeks Basic Kth Missing Element</a>
 * 
 * To summarize the challenge:
 * Given an increasing sequence of numbers, print the missing contiguous element. If nothing missing print -1.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MissingElement 
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
                int n = scanner.nextInt();                                                          //get the size of the array
                int k = scanner.nextInt();                                                          //missing element to find
                int prev = scanner.nextInt();                                                       //container for previous element
                int out = -1;                                                                       //container for output
                int missing = 0;                                                                    //count the missing elements to get to the Kth element
                boolean found = false;
                for( int i = 1; i < n && !found; ++i )                                                        //loop through elements in the array
                {
                    int current = scanner.nextInt();                                                //the current array element
                    if ( current - prev != 1 )                                                      //elements should be contiguous so if the difference is not 1 then there is a missing element
                    {
                        for( int j = prev; j < current-1; j++ )
                        {
                            missing++;                                                                  //increasing the missing count to get to K
                            if( missing == k )                                                          //missing count is equal to K
                            {
                                out = j + 1;                                                         //set the output
                                found = true;
                                break;                                                                  //break the loop, element was found
                            }
                        }
                    }
                    prev = current;                                                                 //save current element as previous element for next loop
                }
                
				System.out.println( out );                                                          //print the output
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}