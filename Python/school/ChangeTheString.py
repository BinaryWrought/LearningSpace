#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/change-the-string/0" target="_blank">GeeksForGeeks School Change the String.</a>
#
# To summarize the practice:
# Given a string, if the first character is capitalized, then capitalize the entire string.
# If the first character of the given string is lower case, then make all characters in the string lower case.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    s = str( input() )                  #get the input for this test case
    if 'Z' >= s[ 0 ] >= 'A':            #check if the first character is between A and Z (inclusive)
        print( s.upper() )              #if so, then the entire string needs to be printed upper case
    else:
        print( s.lower() )              #otherwise print it all lower case