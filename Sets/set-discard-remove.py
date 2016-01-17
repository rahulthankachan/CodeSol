number = int(input())
set_total = set(map(int, raw_input().split())) 
n_commands = int(input())

for i in range(0,n_commands):
    command = raw_input().split(' ')
    true_command = command[0]
    if true_command == 'pop':
        set_total.pop()
    elif true_command == 'discard':
        set_total.discard(int(command[1]))
    elif true_command == 'remove':
         if int(command[1]) in set_total:
            set_total.remove(int(command[1]))
print sum(set_total)
