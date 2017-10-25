#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/form-largest-number-from-digits/0" target="_blank">GeeksForGeeks School Largest Number from Digits.</a>
#
# To summarize the practice:
# Given an array of natural numbers, form the largest single number.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                          #get number of test cases
for _ in range( t ):                        #loop for each test case
    n = int(input())                        #number of elements in the array
    arr = list(map(int, input().split()))   #create a list with the inputs mapped to it
    arr.sort(reverse=True)                  #sort the array in descending order
    print("".join(map(str, arr)))           #prints the content of the array ... some how...
