/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/swap-every-two-bits-in-bytes/0" target="_blank">GeeksForGeeks Easy Swap every two bits in bytes</a>
 * 
 * To summarize the challenge:
 * Given an integer, convert it to binary, and swap every two bits. Print the resulting integer.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SwapBitPairs 
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
                String s = Integer.toBinaryString( scanner.nextInt() );                             //get the input as a binary string
                
                if( s.length() % 2 == 1 )                                                           //if the length is odd, then a leading zero must be added
                    s = "0" + s;                                                                    //add a zero to the front of the binary string
                
                char[] n = s.toCharArray();                                                         //convert the binary string to a char array
                
                for( int i = 0; i < n.length; i += 2 )                                              //loop through the binary string
                {
                    char temp = n[i];                                                               //get the char at the index
                    n[i] = n[i+1];                                                                  //swap the char
                    n[i+1] = temp;                                                                  //set the char
                }
                
                System.out.println( Integer.parseInt( new String( n ), 2) );                        //print the result                
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}