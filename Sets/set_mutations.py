# Enter your code here. Read input from STDIN. Print output to STDOUT

n_seta = input()
seta = set(map(int, raw_input().split()))
number_sets = input()
for i in range(0,number_sets):
    command = raw_input().split()
    new_set = set(map(int, raw_input().split()))
    if command[0] == 'update':
        seta.update(new_set)
    elif command[0] == 'intersection_update':
        seta.intersection_update(new_set)
    elif command[0] == 'difference_update':
        seta.difference_update(new_set)
    elif command[0] == 'symmetric_difference_update':
        seta.symmetric_difference_update(new_set)
        
print sum(seta)
