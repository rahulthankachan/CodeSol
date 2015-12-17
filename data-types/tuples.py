number = int(raw_input())
my_tuple = tuple(map(lambda x: int(x), raw_input().split(" ")))
print hash(my_tuple)
