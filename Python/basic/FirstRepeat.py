#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/find-first-repeated-character/0" target="_blank">GeeksForGeeks Basic First Repeated Character.</a>
#
# To summarize the practice:
# Given a string, find the first character that repeats.
# Print the repeated char if found, -1 if not.
# This is similar to "FirstRepeatedCharacter" but this the goal here is to find the first occurance of a repeated character.
# Note that in the string "geeksforgeeks" 'e' is the first repeated character, not 'g'.
# This is because 'e' repeats before 'g' does.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

def first_repeat(s):
    repeat_index = len(s)+1                 #container for the index of the repeating char
    repeat_char = "-1"                      #container for the char found to repeat
    for i in range(len(s)):                 #loop through each char in the string by index
        ri = s.find(s[i], i+1)              #find the index where this char repeats again
        if ri > -1 and ri < repeat_index:   #check if the char found at this index is found somewhere else in the string...
            repeat_char = s[ri]             #char was found to repeat, set this char as a candidate for first repeat
            repeat_index = ri               #char was found, remember the index for comparison
        if repeat_index <= i:               #a repeat was already found below the current index, no need to search the whole string
            break
    return repeat_char                      #return the repeated char, will be -1 if no repeats were found

t = int( input() )                          #get number of test cases
for _ in range( t ):                        #loop for each test case
    s = str( input() )                      #get the input for this test case
    print(first_repeat(s))                  #print the first repeating char
