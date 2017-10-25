#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/fighting-the-darkness/0" target="_blank">GeeksForGeeks School Fighting the Darkness.</a>
#
# To summarize the practice:
# This challenge was to simply find the largest element in the array.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

t = int( input() )                          #get number of test cases
for _ in range( t ):                        #loop for each test case
    n = int(input())                        #number of elements in the array
    arr = list(map(int, input().split()))   #create a list with the inputs mapped to it
    arr.sort()                              #sort the array in ascending order
    print(arr[n-1])                         #print the last element in the array as it is the largest
