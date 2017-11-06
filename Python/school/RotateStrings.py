#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/reversing-the-vowels/0" target="_blank">GeeksForGeeks School Reverse the Vowels.</a>
#
# To summarize the practice:
# Given a string, print it with the vowels reversed.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                          #get number of test cases
for _ in range( t ):                        #loop for each test case
    a = list(str( input() ) )               #get the input for this test case
    b = list(str( input() ) )               #get the input for this test case
    f2ofa = a[0] + a[1]                     #get the first two chars of a
    l2ofa = a[len(a)-2] + a[len(a)-1]       #get the last two chars of a
    f2ofb = b[0] + b[1]                     #get the first two chars of b
    l2ofb = b[len(b)-2] + b[len(b)-1]       #get the last two chars of b
    if f2ofa == l2ofb or l2ofa == f2ofb:    #if the first two of a are the same as the last two of b or vice versa then...
        print(1)                            #print 1
    else:                                   #otherwise rotation does not work for given strings
        print(0)                            #print 0
    