#Math Section


We can use the following command to display the contents of the list without the []

````

','.join(map(str,complex_cart))
str(complex_cart).strip('[]')
str(complex_cart)[1:-1]


````

For number = complex(a,b)

*  To get the **complex part** use number.imag
*  To get the **real part** use the number.real





###Polar coordinates
To find the polar

We can use directly a string in the form 2+3**j** 
#####NOTE: It has to be a j

*  **abs()** will gve the modulus value
*  **phase()** from cmath import phase, use phase() to get the phase angle
*  **polar( complex( )  )** will give u the polar coordinates as a tuble


````

from __future__ import division
from cmath import polar

import math
a=raw_input()
b=raw_input()
complex_number = str(a)+'+'+str(b)+'j'

print str(90-int(round(math.degrees(polar(complex(complex_number))[1]))))+'°'


`````

Note: That comeplex is required

Also, 
###atan2 requires perp/base in the direction of positive angle (anti)
So we have change the order of perp and base accordingly
or 90- ans


###Traiangle quest

1

121

12321

1234321

123454321

**is a special sequence and can be found by the**

1 * 1

11 * 11

111 * 111

so on......


*  **reduce()** function is a combination of the map() function followed by the sum()

````
print reduce(lambda x, y: x+ pow(10,y-1), range(0,i+1))**2

````
so initially x= 0 and y=1
then x= result of above.... so on...

Note: x is the cummulative result for every step and y is from the range


###acos() in math 

Can be used to fincd the cos inverse
math.degrees











