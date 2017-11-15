#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence/0" target="_blank">GeeksForGeeks Basic Difference between highest and lowest</a>
#
# To summarize the practice:
# Given an array, find the difference in occurrances between the highest and lowest numbers in the array.
# Print the difference.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                          #get number of test cases
for _ in range( t ):                        #loop for each test case
    n = int(input())                        #the number of integers in the list
    a = list(map(int, input("").split()))   #create a list of ints mapped from the input
    s = set(a)                              #create a set from the list
    least = n                               #initialize to n because the least occurring number will be less than n
    most = 0                                #initialize to 0 becuase the most occurring number will be more than 0
    for i in s:                             #loop through the unique elements of the list
        c = a.count(i)                      #see how many times this element appears in the list
        if c < least:                       #if it appears less than the current least amount...
            least = c                       #set it to the current least amount
        if c > most:                        #if it appears more than the current most amount...
            most = c                        #set it to the current most amount
    print( most - least )                   #print the difference between the most occurring number and the least
    