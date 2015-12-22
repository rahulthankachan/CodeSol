# Enter your code here. Read input from STDIN. Print output to STDOUT
import textwrap
given_string = raw_input()
number = int(raw_input())
print textwrap.fill(given_string,number)
