/*
 * This is free to use as it was only made for practice.
 */

package googlepractice;

import java.util.*;

/**
 * This class is an implementation of a directed graph.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 */
public class Digraph
{
    private HashMap< String, HashSet<String> > graph;
    
    /**
     * Default constructor
     */
    Digraph()
    {
        graph = new HashMap<>();        
    }
    
    /**
     * Method to add an out-going edge from the source vertex to the destination vertex.
     * Will also automatically add the source and destination vertices to the graph if they do not yet exist.
     * @param src from where the edge is coming from
     * @param dest to where the edge is going
     */
    public void addEdge( String src, String dest )
    {
        if( !graph.containsKey( src ) )
            addVertex( src );
        if( !graph.containsKey( dest ) )
            addVertex( dest );
        graph.get( src ).add( dest );
    }
    
    /**
     * Method to add a new vertex to the graph with no edges.
     * @param v 
     */
    public void addVertex( String v )
    {
        if( !graph.containsKey( v ) )
            graph.put( v, new HashSet<String>());
    }
    
    /**
     * Method to get the total number of edges connected to the specified vertex.
     * @param v
     * @return 
     */
    public int degree( String v )
    {
        if( !graph.containsKey( v ) )
            return  0;
        else
            return graph.get( v ).size();
    }
    
    /**
     * Method to get an iterable set of all vertices connected to the specified vertex
     * @param v
     * @return 
     */
    public Iterable<String> adjacentTo( String v )
    {
        if( !graph.containsKey( v ) )
            return new HashSet<String>();
        else
            return graph.get( v );
    }
    
        /**
     * Method to get an iterable set of all vertices connected to the specified vertex
     * @param v
     * @return 
     */
    public HashSet<String> neighbors( String v )
    {
        if( !graph.containsKey( v ) )
            return new HashSet<String>();
        else
            return graph.get( v );
    }
    
    /**
     * Method to get a string representation of this directed graph
     * @return the string of this graph
     */
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for( String v: graph.keySet() )
        {
            s.append( v + ": " );
            for( String w: graph.get( v ) )
            {
                s.append( w + " " );
            }
            s.append( "\n" );
        }
        return s.toString();
    }
    
        /**
     * Method to recursively print all the vertices of this graph
     * @param v the node being processed
     * @param marked an array of already processed nodes
     */
    private void depthFirstPrint( String v, HashMap<String, Boolean> marked )
    {
        HashSet<String> connections = neighbors( v );
        marked.put( v, Boolean.TRUE );
        System.out.print( v + " " );
        
        //Traverse all the neighbors looking for unmarked vertices
        for( String next: connections )
        {
            if( !marked.containsKey( next ) )
                depthFirstPrint( next, marked );
        }
    }
    
    /**
     * Method to traverse the graph depth-first
     * @param start the starting node
     */
    public void depthFirstTraversal( String start )
    {
        HashMap<String, Boolean> marked = new HashMap<>( graph.size() );
        depthFirstPrint( start, marked );
    }
    
        /**
     * Method to traverse the graph breadth-first
     * @param start the starting vertex
     */
    public void breadthFirstTraversal( String start )
    {
        //all vertices start as "not visited"
        HashMap< String, Boolean > visited = new HashMap<>( graph.size() );
        Queue<String> queue = new LinkedList<>();
        
        //Mark the current node as visited and queue it
        visited.put( start, Boolean.TRUE );        
        queue.add( start );
        
        while( !queue.isEmpty() )
        {
            //dequeue a vertex and print it
            start = queue.poll();
            System.out.print( start + " " );
            
            //Get adjacent vertices of dequeued vertex
            //if adjacent has not been visited then mark it as visited
            HashSet<String> connections = neighbors( start );
            for( String s : connections )
            {
                String next = s;
                if( !visited.containsKey( next ) )
                {
                    visited.put( next, Boolean.TRUE );
                    queue.add( next );
                }
            }
        }
    }
}
