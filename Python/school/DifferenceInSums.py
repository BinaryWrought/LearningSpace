#
#This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/difference-between-sums-of-odd-and-even-digits/0" target="_blank">GeeksForGeeks School Difference between sums of odd and even digits.</a>
#
# To summarize the practice:
# Given a long integer, determine if the difference between the sum of digits present at the odd positions and sum of digits present at even positions is 0 or not.
# Print Yes if difference is zero, No if not.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                                                  #get the number of test cases
for _ in range( t ):                                                #loop for each test case
    n = [ int( i ) for i in list( input() ) if i.isdigit() ]        #this complex line populates an array of integers where each element is one integer from an given input so long as each character in the input is a digit
    if sum( n[ 0::2 ] ) - sum( n[ 1::2 ] ) == 0:                    #this line check if the even numbers (0::2 -> starting from first index with a step of 2) minus odd numbers (1::2 -> start from second index with a step of 2) is equal to zero
        print( "Yes" )                                              #if so, print yes
    else:
        print( "No" )                                               #otherwise print no
