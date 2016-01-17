# Enter your code here. Read input from STDIN. Print output to STDOUT
number_a = input()
a = set(map(int, raw_input().split()))
number_b = input()
b = map(int, raw_input().split())

print len(a.union(set(b)))
