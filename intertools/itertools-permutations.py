from itertools import permutations
word, value = raw_input().split()
for item in permutations(sorted(word),int(value)):
    print ''.join(item)
    
