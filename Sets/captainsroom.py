# Enter your code here. Read input from STDIN. Print output to STDOUT
k = input()
all_list = map(int,raw_input().split())
dictionary_count = {}
for room in all_list:
    if room in dictionary_count:
        dictionary_count[room] +=1
    else:
        dictionary_count[room] = 1
    
    
for room in dictionary_count:
    if dictionary_count[room] != k:
        print room
        break

