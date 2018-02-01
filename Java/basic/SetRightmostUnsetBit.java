/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/set-the-rightmost-unset-bit/0" target="_blank">GeeksForGeeks Basic Set the rightmost unset bit</a>
 * 
 * To summarize the challenge:
 * Given a number N, and a range from L to R set all the bits in the range in the binary representation of N.
 * Print the modified number as a decimal number.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SetRightmostUnsetBit 
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
                String n = Integer.toBinaryString( scanner.nextInt() );                             //get the input n
                char[] arr = n.toCharArray();                                                       //get the binary string as a char array to facilitate a change
                int unset = n.lastIndexOf( '0' );                                                   //find the index of the last unset bit
                if( unset != -1 )                                                                   //if there is an unset bit
                    arr[ unset ] = '1';                                                             //set it to 1
               
                System.out.println( Integer.parseInt( new String( arr ), 2) );                      //print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{

		}
	}
}