# Enter your code here. Read input from STDIN. Print output to STDOUT
n_a = input()
a = set(map(int,raw_input().split(" ")))
n_b = input()
b = set(map(int,raw_input().split(" ")))

print len(a ^ b)
