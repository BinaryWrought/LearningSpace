#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/repeated-character/0" target="_blank">GeeksForGeeks Basic Repeated Character.</a>
#
# To summarize the practice:
# Given a string, find the first character that is repeated.
# Print the repeated char if found, -1 if not.
# Note that in the string "geeksforgeeks" 'g' is the first repeated character, not 'e'.
# This is because 'g' DOES repeats and it appears in the string before 'e'
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

def first_repeat(s):
    for i in range(len(s)):             #loop through each char in the string by index
        if s.find(s[i], i+1) > -1:      #check if the char found at this index is found somewhere else in the string...
            return s[i]                 #char was found to repeat, return this char
    return "-1"                         #no repeat was found, return -1 as per the requirements

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    s = str( input() )                  #get the input for this test case
    print(first_repeat(s))              #print the first repeating char
