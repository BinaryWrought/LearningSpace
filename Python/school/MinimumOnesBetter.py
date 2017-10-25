#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/row-with-minimum-number-of-1s/0" target="_blank">GeeksForGeeks School Row with minimum number of 1's.</a>
#
# To summarize the practice:
# Print the index of the row of the matrix that has the least number of 1's in it.
# If no rows have a 1 then print -1.
# If more than one row has the same number of minimum 1s the print the lowest index.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

def make_matrix_from_array(values, col):
    mat = [ values[ i : i + col ] for i in range( 0, len( values ), col ) ]
    return mat


t = int( input() )                                                                  #get number of test cases
for _ in range( t ):                                                                #loop for each test case
    row, col = [int(i) for i in input().split(' ')]                                 #set the inputs to each of the variables
    values = list(map(int, input().split()))                                        #get the array of inputs
    if values.count(1) == 0:                                                        #the input does not contain any 1's, so...
        print(-1)                                                                   #just print -1 and end this test case
    else:                                                                           #if the input does contain 1's...
        mat = make_matrix_from_array(values, col)                                   #create a n*m matrix from the elements of the array
        min_count = col                                                             #container for the minimum count of ones - initialized to what the highest possible amount could be
        index = col                                                                 #container for the index of the row with the least number of ones
        for i in range(row):                                                        #loop through just the rows
            if mat[i].count(1) > 0 and mat[i].count(1) < min_count:                 #count the number of ones that appear in the row and check if its less than previous least amount
                min_count = mat[i].count(1)                                         #this row has less ones, so set the container to this row's count
                index = i                                                           #set the index container for later reference
        print(index)                                                                #print the index of the row containing the least number of ones as per the requirements