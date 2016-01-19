# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import division
from itertools import product
K_lists , M_val = raw_input().split()
total = 0
current_list=[]
for i in range(0,int(K_lists)):
    current_list.append(map(lambda x: int(x)**2,raw_input().split()[1:]))
MAX = 0
for comb in product(*current_list):
        MAX = max(sum(list(comb))%int(M_val),MAX)
print MAX
    
