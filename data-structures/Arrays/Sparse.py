# Enter your code here. Read input from STDIN. Print output to STDOUT
number = int(input())
dictionary_val = {}
for i in range(0, number):
    input_string = raw_input()
    if input_string in dictionary_val:
        dictionary_val[input_string] += 1
    else:
        dictionary_val[input_string] = 1
        
q = input()
q_list  = []
for i in range(0, q):
    q_list.append(raw_input())

for q in q_list:
    if q in dictionary_val:
        print dictionary_val[str(q)]
    else:
        print 0
