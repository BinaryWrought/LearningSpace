#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/binary-representation-of-next-number/0" target="_blank">GeeksForGeeks Basic Binary Representation of Next Number</a>
#
# To summarize the practice:
# Given the binary representation of an integer print the binary representation of the next integer (n+1).
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    binStr = str( input() )             #get the input for this test case
    n = int(binStr, 2)
    n += 1
    nextStr = "{0:b}".format(n)
    print(nextStr)
    