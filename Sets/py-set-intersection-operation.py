# Enter your code here. Read input from STDIN. Print output to STDOUT
n_a = input()
a_french = map(int, raw_input().split())
n_b = input()
b_english = map(int, raw_input().split())

print len(set(a_french) & set(b_english))
