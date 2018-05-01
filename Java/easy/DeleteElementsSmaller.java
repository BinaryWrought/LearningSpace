/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/delete-array-elements-which-are-smaller-than-next-or-become-smaller/0" target="_blank">GeeksForGeeks Easy Delete array elements which are smaller than next or become smaller</a>
 * 
 * To summarize the challenge:
 * Given an array delete all elements (up to K elements) that are smaller than the next element, or that become smaller after deleting the next element.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class DeleteElementsSmaller 
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
				int n = scanner.nextInt();															//get the size of the array
                ArrayList<Integer> arr = new ArrayList<>(n);                                        //container for array elements
                for( int i = 0; i < n; ++i )                                                        //loop to populate array
                {
                    arr.add( scanner.nextInt() );                                                   //add the input to the array
                }
                
                int k = scanner.nextInt();                                                          //get the number of elements to remove                
                int i = 0;                                                                          //index of element being examined
                
                while( k > 0 && i < arr.size() )                                                    //loop to modify array
                {
                    boolean removed = false;                                                        //flag if an element was removed
                    if( i + 1 < arr.size() )                                                        //so long as there is a next element
                    {
                        if( arr.get( i ) < arr.get( i + 1 ) )                                       //check if the next element is larger than this element
                        {
                            arr.remove( i );                                                        //remove if this element is smaller
                            k--;                                                                    //decrement k because an element was removed
                            removed = true;                                                         //set the flag to true
                        }
                    }
                    if( !removed )                                                                  //if no element was removed...
                        i++;                                                                        //increment the index
                    else if( removed && i > 0 )                                                     //an element was removed and the index is greater than 0...
                        i--;                                                                        //decrement the index
                }
                
                for( Integer e : arr )                                                              //loop to print the array
                    System.out.print( e + " " );                                                    //print the modified array
                
                System.out.println();                                                               //print a line between test cases             
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}