# Enter your code here. Read input from STDIN. Print output to STDOUT
number = int(raw_input())
set_stamps = set()
for i in range(0,number):
    set_stamps.add(raw_input().lower())
    
print len(set_stamps)
