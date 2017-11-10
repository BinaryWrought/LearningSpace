#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/zero-number/0" target="_blank">GeeksForGeeks School Zero Number.</a>
#
# To summarize the practice:
# Determine if the given input is a zero a number.
# A zero number is any number that contains a zero but does not start with a zero.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                                                      #get number of test cases
for _ in range( t ):                                                    #loop for each test case
    n = [ int( i ) for i in list( input() ) if i.isdigit() ]            #create an array composed of the individual digits of the given number
    print("YES" if n.count(0) > 0 and n[0] != 0 else "NO" )             #print yes if given input is a zero number, else no
    