# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
from __future__ import division
from cmath import polar

import math
a=raw_input()
b=raw_input()
complex_number = a+'+'+b

print str(90-int(round(math.degrees(math.atan2(int(b),int(a))))))+'°'
print tr(90-int(round(math.degrees(polar(complex_number)[1]))))+'°'
