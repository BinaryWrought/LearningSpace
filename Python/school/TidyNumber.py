#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/tidy-number/0" target="_blank">GeeksForGeeks School Tidy Number.</a>
#
# To summarize the practice:
# A tidy number is a number whose digits are in ascending order.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                          #get number of test cases
for _ in range( t ):                        #loop for each test case
    n = list( input() )                      #get the input for this test case
    s = sorted(n)
    print( "1" if n == s else "0")
    