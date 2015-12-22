# Enter your code here. Read input from STDIN. Print output to STDOUT
my_string =  raw_input()
attr = raw_input().split(" ")
index = int(attr[0])
character = attr[1]
print my_string[:index] + character + my_string[index+1:]

