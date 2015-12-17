# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import division
number = int(raw_input())
all_values = {}
for i in range(0,number):
    value = raw_input().split(' ')
    all_values[value[0]] = value[1:]

name_search = raw_input()
sum_total = 0
totalelements = 0
for val in all_values[name_search]:
    sum_total += float(val)
    totalelements +=1
print "%.2f" % float(sum_total/totalelements)
