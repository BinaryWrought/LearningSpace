#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/find-the-fine/0" target="_blank">GeeksForGeeks Basic Find the Fine.</a>
#
# To summarize the practice:
# Given a date, and array of car numbers, and an array of fines, report the total fine collected.
# Even car numbers are collected on odds dates. Odd car numbers are collected on even dates.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

def is_even(x):
    """A simple method to return true or false is the given argument is even or not"""
    if x %2 == 0:
        return True
    else:
        return False

def total_fine(date, cars, fines):
    """This method takes the given information and calculates then returns the total fine."""
    total = 0
    for car, fine in zip(cars, fines):
        if is_even(date):
            if is_even(car):
                pass
            else:
                total += fine
        else:
            if is_even(car):
                total += fine
    return total

t = int( input() )                                  #get number of test cases
for _ in range( t ):                                #loop for each test case
    n, date = map(int, input().split())             #n is the number of car license plates, date is the given date for the test case
    cars = list(map(int, input().split()))
    fines = list(map(int, input().split()))
    print(total_fine(date, cars, fines))
    