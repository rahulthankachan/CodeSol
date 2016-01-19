# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations_with_replacement
word, val = raw_input().split()

for w in combinations_with_replacement(sorted(word),int(val)):
    print ('').join(w)
        
