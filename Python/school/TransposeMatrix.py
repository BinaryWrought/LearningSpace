#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/transpose-of-matrix/0" target="_blank">GeeksForGeeks School Tidy Number.</a>
#
# To summarize the practice:
# Given a square array, transpose the matrix such that rows become columns and columns become rows.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                                                      #get number of test cases
for _ in range( t ):                                                    #loop for each test case
    n = int( input() )                                                  #get the input for this test case
    m = [int(x) for x in input().split()]                               #make a 1D array from a 2D matrix of input
    t = [ m[ j * n + i ] for i in range( n ) for j in range( n ) ]      #transpose the rows and columns with one magical line of python that is unreadable.
    print(*t)                                                           #print the transposed matrix
    