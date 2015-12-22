# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import print_function
def print_the_letter(x):
    if x.isalpha() == True:
        if x.islower():
            print(x.upper(), end="")
        else:
            print(x.lower(), end="")
    else:
        print(x,end="")
map(lambda x: print_the_letter(x), raw_input())
