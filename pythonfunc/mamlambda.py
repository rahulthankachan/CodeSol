# Enter your code here. Read input from STDIN. Print output to STDOUT

def fibo(prev, beforeprev):
    return sum([prev, beforeprev])

number = input()
fibo_list = []
for i in range(0,number):
    if len(fibo_list) == 0:
        fibo_list.append(0)
    elif len(fibo_list) ==1:
        fibo_list.append(1)
    else:
        fibo_list.append(fibo(fibo_list[i-2], fibo_list[i-1]))

print map(lambda x: x**3, fibo_list)

