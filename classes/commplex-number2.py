
# Enter your code here. Read input from STDIN. Print output to STDOUT

import math

class Complex(object):

    real_part = 0 

    complex_part = 0

    

    def __init__(self, real_part, complex_part):

        self.real_part = float(real_part)

        self.complex_part = float(complex_part)

    

    def __add__(self, other):

        if isinstance(other, Complex):

            temp = Complex(self.real_part + other.real_part,self.complex_part + other.complex_part)

            return temp

        else:

            return Complex(self.real_part + other, self.complex_part)

    def __sub__(self, other):

        if isinstance(other, Complex):

            return Complex(self.real_part - other.real_part, self.complex_part - other.complex_part)

            

    def __mul__(self, other):

        var1 = self.real_part * other.real_part

        var2 = self.real_part * other.complex_part

        var3 = self.complex_part * other.real_part

        var4 = self.complex_part * other.complex_part

        return Complex(var1 - var4, var2 + var3)

   

    def __div__(self, other):

        den1 = other.real_part**2

        den2 = other.complex_part**2

        deno = float(den1 + den2)

        y = self* Complex(other.real_part, -other.complex_part)

        return Complex( y.real_part/deno, y.complex_part/deno)



    def __str__(self):

        cp = round(self.complex_part, 2)

        rp = round(self.real_part, 2)

        

        if self.complex_part >= 0:

            return "%0.2f+%0.2fi" %(rp, cp)

        else:

            return "%0.2f%0.2fi" %(rp, cp)

            

        

        

    

    def __abs__(self):

        return "%0.2f+0.00i" % round(abs(complex(self.real_part,self.complex_part)),2)

        

            

       

a1, b1 = map(float, raw_input().split())

a2, b2 = map(float, raw_input().split())



number1 = Complex(a1,b1)

number2 = Complex(a2,b2)



sum_complex = number1 + number2

print sum_complex

print number1 - number2

print number1 * number2

print number1 / number2

print abs(number1)

print abs(number2)


