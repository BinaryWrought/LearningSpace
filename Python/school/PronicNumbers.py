#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/pronic-number/0" target="_blank">GeeksForGeeks School Pronic Numbers.</a>
#
# To summarize the practice:
# A pronic number is the product of two consecutive integers. Such as: x = n( n + 1 )
# Print all the pronic numbers from 0 to n (input)
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    n = int( input() )                  #get the input for this test case
    pronic = 0
    for i in range(0, n+1):
        pronic = i * (i+1)
        if pronic > n:
            break
        else:
            print(pronic, end="")
    print()
