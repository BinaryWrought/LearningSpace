/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/withdrawing-money/0" target="_blank">GeeksForGeeks Easy Withdrawing Money</a>
 * 
 * To summarize the challenge:
 * Given an integer representing an amount of money, determine how many withdraws need to be made to get the amount to zero
 * IF you are only allowed to withdraw a factor of the total amount excluding itself. Unless there is just 1 left then that can be withdrawn.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class WithdrawingMoneyWithoutAllFactors 
{

    /**
     * This method will return the largest factor that is not the number itself
     * @param n the number to factor
     * @return the largest factor
     */
    public static Long largestFactor( long n )
    {
        for( long i = 2; i <= Math.sqrt( n ); ++i )                                                 //loop to find largest factor, start at 2 to skip n itself
        {
            if( n % i == 0 )                                                                        //if this evenly divides it is a factor
                return n/i;
        }
        return (long)1;                                                                             //no factor was found, so return 1
    }
    
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
				long balance = scanner.nextLong();                                                  //get the account balance        
                int withdrawls = 0;                                                                 //container for total number of withdrawls needed                
                
                while( balance != 0 )                                                               //while there is still money in the acount...
                {
                    withdrawls++;                                                                   //increase the number of withdrawls count
                    balance -= largestFactor(balance);                                              //withdrawl the largest factor
                }

                System.out.println( withdrawls );                                                   //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}