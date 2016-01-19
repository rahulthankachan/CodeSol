# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import print_function
from itertools import groupby

input_s = raw_input()
for k,group in groupby(input_s):
    print((len(list(group)),int(k)), end=" ")
