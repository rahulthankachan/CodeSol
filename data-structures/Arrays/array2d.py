#!/bin/python

import sys


arr = []
MAX = -1000
for arr_i in xrange(6):
    arr_temp = map(int,raw_input().strip().split(' '))
    arr.append(arr_temp)
    
    
for x in range(0,6):
    for y in range(0,6):
        if x < 4 and y < 4:
            MAX = max(arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2], MAX)
            
print MAX
