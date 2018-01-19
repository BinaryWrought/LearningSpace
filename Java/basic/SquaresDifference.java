/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/squares-difference/0" target="_blank">GeeksForGeeks Basic Squares Difference</a>
 * 
 * To summarize the practice:
 * Given a positive integer find the difference between the sum of the squares of the first n natural numbers and the square of the sum of the first n natural numbers.
 * For example: the input 5. The first part is the square of the sum of the natural numbers, so: 1 + 2 + 3 + 4 + 5 = 15. 15*15 = 225.
 * The second part is the sum of the squares of the first natural numbers, so: 1 + 4 + 9 + 16 + 25 = 55.
 * The absolute difference is (225 - 55 ) = 170.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SquaresDifference 
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
			scanner.nextLine();
			while( t > 0 )																			//So long as there are more test cases
			{		
				BigInteger n = scanner.nextBigInteger();                                            //get the input N
                BigInteger partOne = new BigInteger("0", 10);
                BigInteger partTwo = new BigInteger("0", 10);
                for( int i = 1; i <= n.intValue(); ++i )
                {             
                    BigInteger j = new BigInteger( String.valueOf( i ), 10 );
                    partOne = partOne.add( j );
                    partTwo = partTwo.add( j.multiply( j ) );   //i*i
                }
                partOne = partOne.multiply( partOne );
                
                System.out.println( partOne.subtract( partTwo ).abs() );

				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}