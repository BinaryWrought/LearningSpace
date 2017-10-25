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

t = int( input() )                                      #get number of test cases
for _ in range( t ):                                    #loop for each test case
    row, col = [int(i) for i in input().split(' ')]		#set the inputs to each of the variables, n for number of houses, m for amount of money
    arr = list(map(int, input().strip().split(' ')))    #put all the inputs into an array
    if arr.count(1) == 0:                               #built in method to count occurances of an element within the array
        print( -1 )                                     #no ones were found so print -1 as per the requirements
    else:                                               #if a one was found within the array
        cur_count = row                                 #container for the current count of ones for a row
        index = -1                                      #container for the index of the row where a one was found
        for i in range(row):                            #loop through the rows in the matrix
            row_count = 0                               #container for number of ones found in this row
            for j in range(col):                        #loop through the columns of the matrix
                if arr[ i * col + j] == 1:              #check if the element is a 1
                    row_count += 1                      #if so, add it to the row count
            if row_count > 0 and row_count < cur_count: #after looping through the columns, check if the row contained at least one 1, and that the count is less than the last found count
                cur_count = row_count                   #if so, update the minimum count
                index = i                               #update the index
        print(index)                                    #print the index of the row with the least ones
        
        #shorthand way to print with an if statement
        #print( -1 if arr.count(1) == 0 else arr.count(1)