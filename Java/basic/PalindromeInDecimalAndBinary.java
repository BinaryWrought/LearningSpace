/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/palindrome-in-both-decimal-and-binary/0" target="_blank">GeeksForGeeks Basic Palindrome in both Decimal and Binary</a>
 * 
 * To summarize the challenge:
 * Given an integer, determine if it is a palindrome in both its decimal and binary representations
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class PalindromeInDecimalAndBinary 
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
                int n = scanner.nextInt();                                                          //get the input
                String d = Integer.toString( n );                                                   //convert the input to a string
                String b = Integer.toBinaryString( n );                                             //convert the input to a binary string
                
                boolean isPalindrome = true;                                                        //flag to keep track of if this is a palindrome or not
                
                if( d.length() > 1 )                                                                //first check the decimal number as it ought to have a shorter length than the binary one
                {
                    int rear = d.length() - 1;                                                      //set the rear index to the last char in the string
                    for( int i = 0; i < d.length()/2 && isPalindrome; ++i )                         //loop through the string to check if it is a palindrome
                    {
                        if( d.charAt( i ) != d.charAt( rear ) )                                     //if the character at the front index (i) is not the same as the rear index then...
                            isPalindrome = false;                                                   //this is not a palindrome, set the flag
                        rear--;                                                                     //decrement the rear index
                    }
                }
                
                if( b.length() > 1 && isPalindrome )                                                //based on a test case, consider a string of length 1 to be a palindrome (I don't think actual palindromes are defined this way, but whatever.)
                {    
                    int rear = b.length() - 1;                                                      //set the rear index to the last char in the string
                    for( int i = 0; i < b.length()/2 && isPalindrome; ++i )                         //loop through the string to check if it is a palindrome
                    {
                        if( b.charAt( i ) != b.charAt( rear ) )                                     //if the character at the front index (i) is not the same as the rear index then...
                            isPalindrome = false;                                                   //this is not a palindrome, set the flag
                        rear--;                                                                     //decrement the rear index
                    }
                }
				
                System.out.println( ( isPalindrome )? "Yes" : "No" );                               //print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{

		}
	}
}