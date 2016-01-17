# Enter your code here. Read input from STDIN. Print output to STDOUT
n_english = input()
set_english = set(map(int, raw_input().split()))
n_french = input()
set_french = set(map(int, raw_input().split()))
print len(set_english.difference(set_french))
