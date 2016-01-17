# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import division
total_number = int(raw_input())
heights = set(map(int,raw_input().split(" ")))
print sum(heights)/len(heights)
