from __future__ import print_function
number = int(raw_input())
mark_list = []

for i in range(number):
    name = raw_input()
    mark = float(raw_input())
    mark_list.append([name,mark])
    
    
# finds the second lowest number in the list 

lowest = 999999
second = 999999
for i in range(number):
    value = mark_list[i][1]
    if value <= lowest:
        if lowest!=value:
            second = lowest
            lowest = value
    elif value < second and value > lowest:
        second = value
       
student_list = []

for i in range(number):
    value = mark_list[i][1]
    if value == second:
        student_list.append(mark_list[i][0])
    
map(lambda x: print(x),sorted(student_list))
    
