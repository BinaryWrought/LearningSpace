#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/reversing-the-vowels/0" target="_blank">GeeksForGeeks School Reverse the Vowels.</a>
#
# To summarize the practice:
# Given a string, print it with the vowels reversed.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

def isVowel( c ):
    return c == 'a' or c == 'A' or c == 'e' or c == 'E' or c == 'i' or c == 'I' or c == 'o' or c == 'O' or c == 'u' or c == 'U';

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    n = list(str( input() ) )                 #get the input for this test case
    front = 0
    back = len(n)-1
    while front < back:
        if not isVowel(n[front]):
            front += 1
        elif not isVowel(n[back]):
            back -= 1
        else:
            temp = n[front]
            n[front] = n[back]
            n[back] = temp
            front += 1
            back -= 1
    print(''.join(n))
        