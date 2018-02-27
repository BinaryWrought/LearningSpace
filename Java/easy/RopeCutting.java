/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/rope-cutting/0" target="_blank">GeeksForGeeks Easy Rope Cutting</a>
 * 
 * To summarize the challenge:
 * Given an array of ropes, cut each rope by the length of the shortest rope until the length of each rope is zero.
 * Print the number of ropes remaining after each cut. If no ropes remain, print 0.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class RopeCutting 
{

    public static void cutTheRope( ArrayList<Integer> r )
    {    
        if( r.size() > 0 )
        {            
            int cut = r.get( 0 );
            ArrayList<Integer> rTwo = new ArrayList<>();
            for( int i = 0; i < r.size(); ++i )
            {
                if( r.get( i ) - cut > 0 )
                    rTwo.add( r.get( i ) - cut );
            }     
            
            if( rTwo.size() > 0 )
            {
                System.out.print( rTwo.size() + " " );
                cutTheRope( rTwo );
            }
        } 
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
				int n = scanner.nextInt();                                                          //get the number of ropes
                ArrayList<Integer> ropes = new ArrayList<>();
                
                for( int i = 0; i < n; ++i )
                {
                    ropes.add( scanner.nextInt() );
                }
                
                Collections.sort( ropes );
                cutTheRope( ropes );
                System.out.println();
                
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}