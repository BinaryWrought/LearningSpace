/*
 * This is free to use as it was only made for practice.
 */

package com.jhazelle.gfg.easy;

import java.util.*;

/**
 * This is a solution to the <a href="https://practice.geeksforgeeks.org/problems/the-buggy-robot/0" target="_blank">GeeksForGeeks Easy Buggy Robot</a>
 * 
 * To summarize the challenge:
 * A robot is buggy such that it moves N steps forward then M steps back.
 * Calculate the total distance it will move in order to reach some distance K.
 * The robot is guaranteed to reach K (which implies that M is less than N)
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class BuggyRobot 
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
				long forward = scanner.nextInt();													//get the forward steps
                long backward = scanner.nextInt();                                                  //get the backward steps
                long distance = scanner.nextInt();                                                  //get the distance to travel
                
                long total = 0;                                                                     //container for total distance that has been travelled (forward + backward)
                long location = 0;                                                                  //container for current positive distance traveled (forward - backward)
                
                while( location < distance )                                                        //so long as the robot has not yet reached the desired location
                {
                    if( location + forward < distance )                                             //if adding a full stpe won't get the robot to the end goal...
                    {
                        location += forward;                                                        //add a full step
                        total += forward;                                                           //add the step to the total as well
                    }                        
                    else if( location + forward >= distance )                                       //if a full step gets the robot to its goal...
                    {
                        total += ( distance - location );                                           //only add the difference between its current location and its goal
                        break;                                                                      //end the loop because the goal was achieved
                    }
                    total += backward;                                                              //if not at the goal, then add the backwards step to the total
                    location -= backward;                                                           //subtract the backwards step from the current location
                }
                
                System.out.println( total );                                                        //print the results           
    			t--;																				//get next test case
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}