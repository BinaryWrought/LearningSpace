/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/the-light-problem/0" target="_blank">GeeksForGeeks Easy The Light Problem</a>
 * 
 * To summarize the challenge:
 * Given an array of size N containing 1s and 0s where 1 represents a room with a light bulb and 0 a room without a light bulb, 
 * determine if the given number of light bulbs can illuminate all adjacent rooms when the bulbs illumination distance is given by K.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class LightProblem 
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
                int n = scanner.nextInt();                                                          //size of the array
                int k = scanner.nextInt();                                                          //rooms that can be lit by a bulb                
                boolean lights[] = new boolean[n];                                                  //container for rooms with bulbs, false = no bulb
                int lastBulb = -1;
                for( int i = 0; i < n; ++i )                                                        //loop to populate array of lit and unlit rooms
                {
                    if( scanner.nextInt() == 1 )                                                    //check if this room is lit
                    {
                        lights[ i ] = true;                                                         //set to true
                        if( lastBulb == -1 )                                                        //the first bulb that is seen
                            lastBulb = i;                                                           //store this for reference later
                    }
                }
                
                boolean isLit = true;                                                               //flag for all rooms being lit
                if( lastBulb == -1 )                                                                //never loop if there is no light
                    isLit = false;
                
                for( int i = 0; i < n && isLit; ++i )                                               //loop through the rooms to check for bulbs
                {
                    if( !lights[ i ] && Math.abs( i - lastBulb ) > k )                              //this room does not contain a bulb
                    {
                        boolean notLit = true;                                                      //flag for an unlit room
                        for( int j = i + 1; j <= i + k && j < n && notLit; ++j )                     //loop as far as the previous bulb will illuminate to check for a bulb
                        {
                            if( lights[ j ] )                                                       //this room is lit
                            {
                                i = j;                                                              //jump to the bulb in the loop
                                lastBulb = i;
                                notLit = false;                                                     //break the loop by setting this flag
                            }                            
                        }
                        if( notLit )                                                                //no bulb was found with in the illumination range
                            isLit = false;                                                          //set the flag to break the loop
                    }
                    else if( lights[ i ] )                                                          //this room has a bulb
                        lastBulb = i;                                                               //save the index for reference
                }
               
                System.out.println( isLit ? "1" : "0" );                                            //print the results           
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}