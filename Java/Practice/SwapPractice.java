/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.practice;

/**
 *
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class SwapPractice 
{
	int x;
	int y;		

	public SwapPractice( int x, int y )
	{
		this.x = x;
		this.y = y;
	}

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) 
	{
        int x = 10;
		int y = 15;
		
		x = swap( y, y = x );		
		System.out.println( "Swap: x: " + x + " y: " + y );
		
		SwapPractice sp = new SwapPractice( x, y );
		swap2( sp );
		System.out.println( "Swaps: x: " + sp.x + " y: " + sp.y );
		
	}
	
	public static int swap( int a, int b )
	{
		return a;
	}
	
	public static void swap2( SwapPractice sp )
	{
		int temp = sp.x;
		sp.x = sp.y;
		sp.y = temp;
	}
	
}