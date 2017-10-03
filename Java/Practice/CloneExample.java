/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.practice;

class MyClassOne implements Cloneable
{
	int a;
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}	
}

class MyClassTwo implements Cloneable
{
	int x;
	MyClassOne mco = new MyClassOne();
	public Object clone() throws CloneNotSupportedException
	{
		MyClassTwo mct = ( MyClassTwo )super.clone();
		mct.mco = ( MyClassOne )mco.clone();
		return mct;
	}
}

/**
 *
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class CloneExample 
{	
    /**
	 * 
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
    public static void main( String[] args ) throws CloneNotSupportedException
	{
        MyClassTwo m2 = new MyClassTwo();
		m2.x = 10;
		m2.mco.a = 15;
		
		MyClassTwo m2Two = ( MyClassTwo )m2.clone();
		m2Two.x = 30;
		m2Two.mco.a = 45;
		
		System.out.println("m2: x = " + m2.x + " a = " + m2.mco.a );
		System.out.println("m2Two: x = " + m2Two.x + " a = " + m2Two.mco.a );
		
    }

}
