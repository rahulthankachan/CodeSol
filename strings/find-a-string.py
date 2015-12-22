# Enter your code here. Read input from STDIN. Print output to STDOUT
s_input = raw_input()
sub_input = raw_input()

index = -1
count = 0
for i in range(0,len(s_input)):
    if i > index:
        index = s_input.find(sub_input,i,len(s_input))
        if index != -1:
            count += 1
print count
