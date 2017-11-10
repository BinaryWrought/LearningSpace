#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles/0" target="_blank">GeeksForGeeks School Sum of upper and lower triangles.</a>
#
# To summarize the practice:
# Given a matrix print the sum of the upper and lower triangular elements.
# Upper is the diagonal and elements above it.
# Lower is the diagonal and elements below it.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                                                      #get number of test cases
for _ in range( t ):                                                    #loop for each test case
    n = int(input())
    elements = list( map( int, input().split() ) )
    matrix = [ elements[ i : i + n ] for i in range( 0, len( elements ), n ) ]
    upperSum = 0;																	#container for the sum of the upper triangle
    lowerSum = 0;																	#container for the sum of the lower triangle

    for i in range(0,n):                                                            #outer loop to populate the matrix
        for j in range(0,n):                                                        #inner loop to populate the matrix
            if i <= j:                                                              #Upper triangle is every element where i <= j
                upperSum += matrix[i][j];											#upper sum
            if i >= j:                                                              #Lower triangle is every element where i >= j
                lowerSum += matrix[i][j];											#lower sum

    print(upperSum, lowerSum)
    
    
    