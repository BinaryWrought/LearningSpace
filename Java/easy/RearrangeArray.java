/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.HashSet;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/rearrange-an-array-such-that-arri-i/0" target="_blank">GeeksForGeeks Easy Rearrange an Array Such That Arr[i] = i</a>
 * 
 * To summarize the challenge:
 * Given an array of integers rearrange the array such that Arr[i] = i
 * If the element is not present, set it to -1.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class RearrangeArray 
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
                
                float load = 0.75f;                                                                 //load factor for set
                int initial = (int)( n / load ) + 1;                                                //initial capacity for set
                
                HashSet<Integer> set = new HashSet<>( initial, load );                              //container for input
                for( int i = 0; i < n; ++i )                                                        //loop to populate set
                    set.add( scanner.nextInt() );                                                   //add the element to the set
                
                for( int i = 0; i < n; ++i )                                                        //loop to look for elements in the set                
                    System.out.print( ( set.contains( i ) )? i + " " : "-1 " );                     //if the set contains "i" then print "i" otherwise print "-1"
                
                System.out.println();                                                               //add a line between test cases                
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}