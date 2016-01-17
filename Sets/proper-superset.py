input_set = set(map(int, raw_input().split()))
test_sets_n = input()
is_Super = True
for i in range(0,test_sets_n):
    current_set = set(map(int,raw_input().split()))
    if len(current_set.difference(input_set)) !=0:
        is_Super = False
print is_Super
