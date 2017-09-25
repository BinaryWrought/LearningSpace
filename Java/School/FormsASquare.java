/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.school;

import java.awt.Point;
import java.util.Scanner;

/**
 * This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/check-if-given-four-points-form-a-square/0" target="_blank">GeeksForGeeks School Four Points Form A Square.</a>
 * 
 * To summarize the practice:
 * Given four points, determine if they form a square.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class FormsASquare 
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
				Point a = new Point( scanner.nextInt(), scanner.nextInt() );						//get the first point
				Point b = new Point( scanner.nextInt(), scanner.nextInt() );						//get the second point
				Point c = new Point( scanner.nextInt(), scanner.nextInt() );						//get the third point
				Point d = new Point( scanner.nextInt(), scanner.nextInt() );						//get the fourth point
				
				System.out.println( isSquare( a, b, c, d ) ? "1" : "0" );							//print the result
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch the inevitable exception thrown by the user
		{
			
		}
    }
	
	/**
	 * This method takes four points and determines mathematically if they form a square
	 * 
	 * @param a the first point
	 * @param b the second point
	 * @param c the third point
	 * @param d the fourth point
	 * @return true if the points form a square
	 */
	public static boolean isSquare( Point a, Point b, Point c, Point d )
	{
		
		if( a.equals( b ) || a.equals( c ) || a.equals( d ) ||
			b.equals( c ) || b.equals( d) || c.equals( d ) )
			return false;
		
		int dist1 = dist( a, b );																	//get the distance between the first and second point
		int dist2 = dist( a, c );																	//get the distance between the first and third point
		int dist3 = dist( a, d );																	//get the distance between the first and fourth point

		if( dist1 == dist2 && 2*dist1 == dist3 )													//if the dist between the two is equal and the long dist is twice as long...
		{
			int dist4 = dist( b, d );																//get the dist between these points to make sure they're the same
			return ( dist4 == dist( c, d ) && dist4 == dist1 );										//return if this is a square or not
		}
		if( dist2 == dist3 && 2*dist2 == dist1 )
		{
			int dist4 = dist( b, c );
			return ( dist4 == dist( b, d ) && dist4 == dist2 );
		}
		if( dist1 == dist3 && 2*dist1 == dist2 )
		{
			int dist4 = dist( b, c );
			return ( dist4 == dist( c, d ) && dist4 == dist1 );
		}
		return false;
	}
	
	/**
	 * This method will get the distance between two points.
	 * 
	 * @param one the first point
	 * @param two the second point
	 * @return the distance between both points
	 */
	public static int dist( Point one, Point two )
	{
		return ( one.x - two.x ) * ( one.x - two.x ) + ( one.y - two.y ) * ( one.y - two.y );		//return the distance between the points
	}
}