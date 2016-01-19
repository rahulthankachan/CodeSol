# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations
word, val = raw_input().split()
for i in range(1,int(val)+1):
    for w in combinations(sorted(word), i):
        print ('').join(w) 
    
