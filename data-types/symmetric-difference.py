# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import print_function
n_seta = int (raw_input())
seta = set(map(int,raw_input().split(" ")))
n_setb = int(raw_input())
setb = set(map(int, raw_input().split(" ")))
set_ans = set()
mylist= sorted(seta.union(setb).difference(seta.intersection(setb)))
mylist.sort()
map(lambda x: print(x), mylist)
