/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/sorting-all-array-elements-except-one/0" target="_blank">GeeksForGeeks Basic Sorting All Array Elements Except One</a>
 * 
 * To summarize the challenge:
 * Given an array of positive integers, sort the array in ascending order leaving the Kth element in place.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SortAllButOne 
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
                ArrayList<Integer> arr = new ArrayList<>();                                         //container for input

                for( int i = 0; i < n; ++i )                                                        //loop to get all elements
                {
                    arr.add( scanner.nextInt() );                                                   //add the element to the array
                }
                
                int k = scanner.nextInt();                                                          //index to skip when sorting
                int x = arr.get( k );                                                               //save off the "skipped" element for later                
                arr.remove( k );                                                                    //remove the skipped element so it won't affect the sort
                
                Collections.sort( arr );                                                            //sort the array
                arr.add( k, x );                                                                    //add the removed element back in its original location

                for( Integer i: arr )                                                               //loop to print array contents
                {
                    System.out.print( i + " " );                                                    //print the element
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