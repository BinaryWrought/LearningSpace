/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-two-arrays/0" target="_blank">GeeksForGeeks Easy Add two numbers represented by two arrays</a>
 * 
 * To summarize the challenge:
 * Given two arrays of integers whose elements represent digits of an integer, sum the two integers.
 * 
 * For example A = [ 1, 2, 3 ] and B = [ 2, 3, 4 ] then the answer is 123 + 234 = 357
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class AddTwoNumbers 
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
				int n = scanner.nextInt();															//get the number of digits of A                
                String a = "";                                                                      //container for the first number
                for( int i = 0; i < n; ++i )                                                        //loop to get the digits
                    a += scanner.next();                                                            //add the next digit to the string
                
                scanner.nextLine();                                                                 //consume the line
                
                int m = scanner.nextInt();                                                          //get the number of digits of B
                String b = "";                                                                      //container for the second number
                for( int i = 0; i < m; ++i )                                                        //loop to get the digits
                    b += scanner.next();                                                            //add the next digit to the string

                scanner.nextLine();                                                                 //consume the line
                
                int A = Integer.parseInt( a );                                                      //get A from the string a
                int B = Integer.parseInt( b );                                                      //get B from the string b
                
                System.out.println( ( A + B ) );                                                    //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}