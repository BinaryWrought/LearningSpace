#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/segregate-0s-and-1s/0" target="_blank">GeeksForGeeks School Segregate 0s and 1s.</a>
#
# To summarize the practice:
# Given an array of 1s and 0s separate them such that 0s are on the left and 1s on the right.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    #n = int( input() )                 #get the input for this test case
    l = list(input())
    zeros = l.count('0')
    ones = l.count('1')
    print('0 '*zeros, '1 '*ones, sep="")
        