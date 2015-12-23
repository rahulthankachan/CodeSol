from __future__ import print_function

number = int(raw_input())
my_list = [x for x in range(1,number+1)]
size = len(str(bin(x))[2:])
map(lambda x: print(str(x).rjust(size) + str(oct(x))[1:].rjust(size+1) + str(hex(x))[2:].upper().rjust(size+1) + str(bin(x))[2:].rjust(size+1)),my_list)
