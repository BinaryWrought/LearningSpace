/*
 * This is free to use as it was only made for practice.
 */

package googlepractice;

import java.util.*;

/**
 * This is an implementation of a graph using an adjacency matrix for edges.
 * 
 * @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
 * <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
 * @param <E> The type of object stored in the graph
 */
public class GraphWithAdjacencyMatrix<E> implements Cloneable
{
    private boolean[][] edges;
    private E[] labels;
    
    /**
     * Default constructor for GenericGraph
     * @param n the capacity of this graph
     */
    public GraphWithAdjacencyMatrix( int n )
    {
        edges = new boolean[ n ][ n ];      //all values initially false
        labels = ( E[] ) new Object[ n ];   //all values initially null
    }
    
    /**
     * Method to add an edge to the graph
     * @param src the from vertex
     * @param dest the to vertex
     */
    public void addEdge( int src, int dest )
    {
        edges[src][dest] = true;
        //edges[dest][src] = true;  //uncomment this to make this an undirected graph
    }
    
    /**
     * Method to clone the graph
     * @return a copy of this graph
     */
    public GraphWithAdjacencyMatrix<E> clone()
    {
        GraphWithAdjacencyMatrix<E> c;
        
        try
        {
            c = ( GraphWithAdjacencyMatrix<E> ) super.clone();
        }
        catch( CloneNotSupportedException e )
        {
            throw new RuntimeException( "This class does not implement Cloneable" );
        }
        
        c.edges = edges.clone();
        c.labels = labels.clone();
        
        return c;        
    }
    
    /**
     * Method to get a label from the graph
     * @param vertex the node for which a label is sought
     * @return the label - or data - for the specified vertex
     */
    public E getLabel( int vertex )
    {
        return labels[ vertex ];
    }

    /**
     * Method to check if there is an edge between the two specified vertices
     * @param src vertex to check for a neighbor
     * @param dest vertex to check if it is a neighbor
     * @return true if the two vertices are neighbors, false if not
     */
    public boolean isEdge( int src, int dest )
    {
        return edges[ src ][ dest ];
    }
    
    /**
     * Method to get a list of all adjacent vertices for the specified vertex
     * @param vertex the index for which neighbors is sought
     * @return a list of all the indexes that are neighbors of this vertex 
     */
    public int[] neighbors( int vertex )
    {
        int count = 0;
        int[] result;
        
        for( int i = 0; i < labels.length; ++i )
        {
            if( edges[ vertex ][ i ] )
                count++;
        }
        
        result = new int[ count ];
        
        count = 0;
        for( int i = 0; i < labels.length; ++i )
        {
            if( edges[ vertex ][ i ] )
                result[ count++ ] = i;
        }
        
        return result;
    }
    
    /**
     * Method to remove an edge from the graph
     * @param src source vertex to remove
     * @param dest destination vertex to remove
     */
    public void removeEdge( int src, int dest )
    {
        edges[ src ][ dest ] = false;
        //edges[ dest ][ src ] = false; //uncomment this if this is an undirected graph
    }
    
    /**
     * Method to set a new vertex in the graph
     * @param vertex index for new vertex 
     * @param newLabel label for vertex - the "data"
     */
    public void setLabel( int vertex, E newLabel )
    {
        labels[ vertex ] = newLabel;
    }
    
    /**
     * Method to get the total size of the graph
     * @return the total capacity of this graph
     */
    public int size()
    {
        return labels.length;
    }
    
    /**
     * Method to recursively print all the vertices of this graph
     * @param <E>
     * @param v the node being processed
     * @param marked an array of already processed nodes
     */
    private <E> void depthFirstPrint( int v, boolean[] marked )
    {
        int[] connections = neighbors( v );
        marked[v] = true;
        System.out.print( getLabel( v ) + " " );
        
        //Traverse all the neighbors looking for unmarked vertices
        for( int next: connections )
        {
            if( !marked[ next ] )
                depthFirstPrint( next, marked );
        }
    }
    
    /**
     * Method to traverse the graph depth-first
     * @param <E>
     * @param start the starting node
     */
    public <E> void depthFirstTraversal( int start )
    {
        boolean[] marked = new boolean[ size() ];
        depthFirstPrint( start, marked );
    }
    
    /**
     * Method to traverse the graph breadth-first
     * @param <E>
     * @param start the starting vertex
     */
    public <E> void breadthFirstTraversal( int start )
    {
        //all vertices start as "not visited"
        boolean[] visited = new boolean[ size() ];
        Queue<Integer> queue = new LinkedList<>();
        
        //Mark the current node as visited and queue it
        visited[ start ] = true;
        queue.add( start );
        
        while( queue.size() != 0 )
        {
            //dequeue a vertex and print it
            start = queue.poll();
            System.out.print( getLabel( start ) + " " );
            
            //Get adjacent vertices of dequeued vertex
            //if adjacent has not been visited then mark it as visited
            int[] n = neighbors( start );
            for( int i : n )
            {
                int next = i;
                if( !visited[ next ] )
                {
                    visited[ next ] = true;
                    queue.add( next );
                }
            }
        }
    }
    
    /**
     * This method returns a String containing every vertex's directed neighbors comma separated with each vertex on its own line.
     * 
     * @return the string as described above
     */
    @Override
    public String toString()
    {
        String result = "";
        
        for( int i = 0; i < size(); ++i )
        {
            boolean multiple = false;
            for( int j = 0; j < size(); j++ )
            {
                if( edges[ i ][ j ] )
                {
                    if( multiple )
                        result += ", ";

                    multiple = true;
                    result += getLabel( i ) + " --> " + getLabel( j );
                }
            }
            result += "\n";
        }        
        return result;
    }
    
}
