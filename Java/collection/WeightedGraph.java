/*
 * This is free to use as it was only made for practice.
 */

package googlepractice;

import java.util.*;

/**
 * This is an implementation of a weighted graph.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 * @param <E>
 */
public class WeightedGraph<E> 
{
    private LinkedList< LinkedList< Edge > > adjacencyList;
    private LinkedList< E > labels;
    
    WeightedGraph()
    {
        adjacencyList = new LinkedList<>();
        labels = new LinkedList<>();
    }        
    
    public void addEdge( int src, int dest, int wt ) throws ArrayIndexOutOfBoundsException
    {
        if( src >= labels.size() || dest >= labels.size() )
            throw new ArrayIndexOutOfBoundsException( "Given vertex does not exist." );
        else
        {
            Edge edge = new Edge( src, dest, wt );
            adjacencyList.get( src ).add(edge);
        }
    }

    public void addVertex( E e )
    {
        labels.add( e );
        adjacencyList.add( new LinkedList<>() );
    }

    public void printGraph()
    {
        for( int i = 0; i < labels.size(); ++i )
        {
            LinkedList<Edge> list = adjacencyList.get( i );
            for( int j = 0; j < list.size(); ++j )
            {
                System.out.println( labels.get( i ) + " is connected to " + labels.get( list.get( j ).destination ) + " with weight " + list.get( j ).weight );
            }
        }
    }
    
    public void removeEdge( int src, int dest ) throws ArrayIndexOutOfBoundsException
    {
        if( src >= labels.size() || dest >= labels.size() )
            throw new ArrayIndexOutOfBoundsException( "Given vertex does not exist." );
        else
        {
            for( int i = 0; i < adjacencyList.get( src ).size(); ++i )
            {
                if( adjacencyList.get( src ).get( i ).destination == dest )
                    adjacencyList.get( src ).remove( i );
            }
        }
    }
    
    private static class Edge
    {
        int destination;
        int source;
        int weight;
        
        Edge( int src, int dest, int wt )
        {
            source = src;
            destination = dest;
            weight = wt;
        }
    }
}
