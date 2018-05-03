/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/shoot-reload-repeat/0" target="_blank">GeeksForGeeks Easy Shoot Reload Repeat</a>
 * 
 * To summarize the challenge:
 * Given a string of Ss and Rs where S is shoot 1 bullet and R is reload to capacity N determine if the string is valid or not (cannot shoot more than capacity.)
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class ShootReload 
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
                scanner.nextLine();                                                                 
                
                char[] s = scanner.nextLine().toCharArray();                                        //string representing shoot activity
				int n = scanner.nextInt();															//get capacity of the gun       
                int mag = n;                                                                        //current number of bullets in gun
                boolean valid = true;                                                               //flag to indicate if the activiy is valid or not
                
                for( int i = 0; i < s.length && valid; ++i )                                        //loop to check validity of activity
                {
                    if( s[ i ] == 'S' )                                                             //if this character represents shoot
                        mag--;                                                                      //subtract 1 from the magazine
                    else if( s[ i ] == 'R' )                                                        //else if this character represents reload
                        mag = n;                                                                    //set mag back to the capacity
                    
                    if( mag < 0 )                                                                   //if the mag goes below 0
                        valid = false;                                                              //this activity is invalid
                }
                
                System.out.println( valid ? "1" : "0" );                                            //print the result              
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}