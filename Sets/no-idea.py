numberof_inputs = map(int,raw_input().split())
total_n = numberof_inputs[0]
total_m = numberof_inputs[1]
all_numbers = map(int, raw_input().split())
set_a = set(map(int, raw_input().split()))
set_b = set(map(int, raw_input().split()))

total_feeling = 0
for number in all_numbers:
    if number in set_a:
        total_feeling += 1
    elif number in set_b:
        total_feeling += -1

print total_feeling

#The split function does not have any splitting variable

