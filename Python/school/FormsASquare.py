#
# This is a solution to the <a href="http://practice.geeksforgeeks.org/problems/check-if-given-four-points-form-a-square/0" target="_blank">GeeksForGeeks School Four Points Form A Square.</a>
#
# To summarize the practice:
# Given four points, determine if they form a square.
#
# @author <a href="mailto:jhazelle@asu.edu">Justin Hazelle</a>
# <a href="https://github.com/BinaryWrought" target="_blank">GitHub</a>

import os

def dist(p1, p2):
    return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1])


def equals(p1, p2):
    if p1[0] == p2[0] and p1[1] == p2[1]:
        return True
    else:
        return False


def square(a, b, c, d):
    if equals(a, b) or equals(a, c) or equals(a, d) or equals(b, c) or equals(b, d) or equals(c, d):
        return False

    dist1 = dist((a[0], a[1]), (b[0], b[1]))
    dist2 = dist((a[0], a[1]), (c[0], c[1]))
    dist3 = dist((a[0], a[1]), (d[0], d[1]))

    if dist1 == dist2 and 2*dist1 == dist3:
        dist4 = dist( b, d )
        return dist4 == dist(c, d) and dist4 == dist1
    elif dist2 == dist3 and 2*dist2 == dist1:
        dist4 = dist(b, c)
        return dist4 == dist(b, d) and dist4 == dist2
    elif dist1 == dist3 and 2*dist1 == dist2:
        dist4 = dist(b, c)
        return dist4 == dist(c, d) and dist4 == dist1
    else:
        return False


t = int(input())  # get number of test cases
for x in range(t):  # loop for each test case
    ax, ay, bx, by, cx, cy, dx, dy = [int(i) for i in input().split(' ')]
    print( square( (ax, ay), (bx, by), (cx, cy), (dx, dy) ) )