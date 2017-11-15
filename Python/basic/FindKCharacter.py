#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/find-k-th-character-in-string/0" target="_blank">GeeksForGeeks Basic Find k-th character in string.</a>
#
# To summarize the practice:
# Given a decimal number 'm', convert it to binary, perform 'n' iterations, then return the 'k' character.
# One iteration is: for every 0 in the binary string make it 01. For every 1 in the binary string make it 10.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                      #get number of test cases
for _ in range( t ):                    #loop for each test case
    m, k, n = [int(i) for i in input().split(' ')]
    binStr = "{0:b}".format(m)
    while n > 0:
        temp = ""
        for i in range(len(binStr)):
            if binStr[i] == "0":
                temp += "01"
            else:
                temp += "10"  
        binStr = temp
        n -= 1
    print(binStr[k])
        