/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/maximum-triplet-sum-in-array/0" target="_blank">GeeksForGeeks Basic Maximum Triplet Sum in the Array</a>
 * 
 * To summarize the practice:
 * Given an array of integers determine what is the largest number that could be made from the sum of three elements.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class MaximumTriplet 
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
				int n = scanner.nextInt();                                                          //get the int that is the length of the array               
                int low = 0, mid = 0, high = 0;                                                     //keep track of three highest ints
                
                for( int i = 0; i < n; ++i )                                                        //loop to get all of the inputs
                {
                    int temp = scanner.nextInt();                                                   //the curren tinput
                    if( temp >= high )                                                              //compare to the current highest input
                    {
                        low = mid;                                                                  //trickle down each stored number
                        mid = high;
                        high = temp;
                    }
                    else if( temp >= mid )                                                          //if not greater than the highest, but still greater than or equal to mid
                    {
                        low = mid;                                                                  //trickle down values
                        mid = temp;
                    }
                    else if( temp >= low )                                                          //compare to lowest number
                    {
                        low = temp;                                                                 //trickle down
                    }
                }
                
                System.out.println( low + mid + high );                                             //print the sum of the three highest numbers

				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}