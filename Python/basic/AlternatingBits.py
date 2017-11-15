#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/product-of-digits/0" target="_blank">GeeksForGeeks Basic Numbers having alternate bits</a>
#
# To summarize the practice:
# Given an integer, determine if its binary representation has alternating zeros and ones.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    n = int( input() )                  #get the input for this test case
    binString = "{0:b}".format(n)       #the integer as a binary string
    if binString[0] =='1':              #check if the string starts with a 1
        ns = '0' + binString            #if so, add a 0. will be used to construct a repeating string for comparison
                     
    rem = len(ns)%2
    len1 = len(ns)//2
    nstr = '01' * len1 + '0' * rem
    print( 1 if ns == nstr else 0 )
    