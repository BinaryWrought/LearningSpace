/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.basic;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/earthquake-and-the-paint-shop/0" target="_blank">GeeksForGeeks Basic Earthquake and the Paint Shop</a>
 * 
 * To summarize the challenge:
 * Given an array of strings sort them and print in order with the number of times they appear.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class EarthquakePaintShop 
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
				int n = scanner.nextInt();                                                          //get the string to be converted for this test case
                scanner.nextLine();
                TreeMap< String, Integer > map = new TreeMap<>();
                
                for( int i = 0; i < n; ++i )
                {
                    String s = scanner.nextLine();
                    if( map.containsKey( s ) )
                        map.put( s, map.get( s ) + 1 );
                    else
                        map.put( s, 1 );
                }
                
                for( Map.Entry<String, Integer> m : map.entrySet() )
                    System.out.println( m.getKey() + " " + m.getValue() );
                
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}