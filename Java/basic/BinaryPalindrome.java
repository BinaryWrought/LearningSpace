/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/check-if-actual-binary-representation-of-a-number-is-palindrome/0" target="_blank">GeeksForGeeks Basic Check if actual binary representation of a number is a palindrome</a>
 * 
 * To summarize the challenge:
 * Given an integer, determine if it is a palindrome. Ignore leading zeros. Print 1 if it is a palindrome, else 0.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class BinaryPalindrome 
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
                BigInteger b = scanner.nextBigInteger();                                            //need to use BigInteger due to constraints of input
                String n = b.toString( 2 );                                                         //convert the input to a binary string
                int idx = n.indexOf( "1" );                                                         //find the first "1" in order to ignore leading 0s
                int rear = n.length() - 1;                                                          //set the rear index to the last char in the string
                boolean isPalindrome = true;                                                        //flag to keep track of if this is a palindrome or not
                
                if( n.length() > 1 )                                                                //based on a test case, consider a string of length 1 to be a palindrome (I don't think actual palindromes are defined this way, but whatever.)
                {                
                    for( int i = idx; i < ( n.length() - idx )/2 && isPalindrome; ++i )             //start i at the first instance of 1 and only go for half the length of the string
                    {
                        if( n.charAt( i ) != n.charAt( rear ) )                                     //if the character at the front index (i) is not the same as the rear index then...
                            isPalindrome = false;                                                   //this is not a palindrome, set the flag
                        rear--;                                                                     //decrement the rear index
                    }
                }
				
                System.out.println( ( isPalindrome )? "1" : "0" );                                  //print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{

		}
	}
}