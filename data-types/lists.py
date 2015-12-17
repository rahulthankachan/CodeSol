# Enter your code here. Read input from STDIN. Print output to STDOUT
number_commands = int(raw_input())
#print number_commands
output_array = []
for i in range(0, number_commands):
    command = raw_input().split(' ')
    #print command[0] + "this " + str(i) + str(output_array)
    if command[0] == 'insert':
            output_array.insert(int(command[1]),int(command[2]))
    elif command[0] == "remove":
        for x in range(1, len(command)):
            output_array.remove(int(command[x]))
    elif command[0] == "print":
        print output_array
    elif command[0] == "append":
        for x in range(1, len(command)):
            output_array.append(int(command[x]))
    elif command[0] == "sort":
        output_array.sort()
    elif command[0] == "pop":
        output_array.pop()
    else:
        output_array.reverse()   
