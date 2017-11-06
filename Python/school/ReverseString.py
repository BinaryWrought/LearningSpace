#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/reverse-the-string/0" target="_blank">GeeksForGeeks School Reverse the String.</a>
#
# To summarize the practice:
# Given a string print it in reverse.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>
    
t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    n = str( input() )                  #get the input for this test case
    for i in reversed(n):
        print(i, end="")
    print()