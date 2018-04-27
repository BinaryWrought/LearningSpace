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
public class WithdrawingMoney 
{

    /**
     * This method will return all of the factors of a given number in a tree set
     * @param n the number to factor
     * @return tree set of longs that are factors of n
     */
    public static TreeSet<Long> factorsAsArray( long n )
    {
        TreeSet<Long> result = new TreeSet<>( Collections.reverseOrder() );                         //container for the result
        double limit = Math.sqrt( n );                                                              //limit the algorithm for speed and efficiency
        
        for( int i = 1; i <= limit; ++i )                                                           //loop to find all of the factors
        {
            if( n % i == 0 )                                                                        //if the given number is divisible by i then this is a factor
            {
                if( i != n )
                    result.add( (long)i );                                                          //add this factor to the result
                
                if ( i != ( n / i ) && ( n/i != n ) )                                               //if n/i is not the same number as i then include it in the result
                    result.add( n / i );                                                            //add this factor to the result
            } 
        }

        return result;                                                                              //return the result
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
                
                while( balance > 0 )                                                                //while there is still money in the acount...
                {
                    TreeSet<Long> factors = factorsAsArray( balance );                              //get the factors of the current amount
                    withdrawls++;                                                                   //increase the number of withdrawls count
                    
                    if( factors.size() > 1 )                                                        //if there are more than 1 factors
                          balance -= factors.first();                                               //get the highest factor
                    else
                        balance -= 1;                                                               //otherwise the only factor is 1 so withdrawl that
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