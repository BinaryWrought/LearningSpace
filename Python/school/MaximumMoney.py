#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/maximum-money/0" target="_blank">GeeksForGeeks School Maximum Money.</a>
#
# To summarize the practice:
# Consider a row of houses with money in them and a thief that wants to rob those houses.
# But the thief will not rob any adjacent houses.
# Find the maximum amount of money the thief can get.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )									#get number of test cases
for _ in range( t ):								#loop for each test case
	n, m = [int(i) for i in input().split(' ')]		#set the inputs to each of the variables, n for number of houses, m for amount of money
	total = (n//2) * m
	if n % 2 == 0:									#if there are an even number of houses...
		total = (n//2)*m							#maximum money is simply half the number of houses times money
	else:											#if there is an odd number of houses...
		total = ((n//2)+1)*m						#then maximum money is half plus one times money
	print(total)									#print the total
