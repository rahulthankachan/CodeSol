# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import division
from itertools import combinations
n = input()
number_n = raw_input().split()
k = input()
count =0
total = 0
for i in combinations(number_n, int(k)):
    if 'a' in list(i):
        count +=1
    total +=1
    
print count/total  
