#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/numbers-with-0-as-a-digit/0" target="_blank">GeeksForGeeks School Numbers with 0 as a digit.</a>
#
# To summarize the practice:
# Given a string, if the first character is capitalized, then capitalize the entire string.
# If the first character of the given string is lower case, then make all characters in the string lower case.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    n = int( input() )                  #get the input for this test case
    total = 0
    for i in range(1, n+1):
        if str(i).count("0") > 0:
            total += 1
    print(total)
