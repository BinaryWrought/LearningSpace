/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/strange-sort/0" target="_blank">GeeksForGeeks Basic Strange Sort</a>
 * 
 * To summarize the challenge:
 * Given an array of positive integers, sort the array in ascending order leaving the Kth element in place.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class StrangeSort 
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
                int k = scanner.nextInt() - 1;                                                          //get the K index of element to leave in place
                
                ArrayList<Integer> arr = new ArrayList<>();                                         //container for elements
                for( int i = 0; i < n; ++i )                                                        //loop to populate array
                {
                    arr.add( scanner.nextInt() );                                                   //add the element to the array
                }
                
                int x = arr.get( k );                                                               //get the Kth element
                arr.remove( k );                                                                    //remove the Kth element from the array
                
                Collections.sort( arr );                                                            //sort the array
                arr.add( k, x );                                                                    //add the removed element back in its original location
                
                for( Integer i: arr )                                                               //loop to print array contents
                {
                    System.out.print(i + " ");                                                      //Print the results
                }
                
                System.out.println();                                                               //add a line between test cases
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}