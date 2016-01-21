# Enter your code here. Read input from STDIN. Print output to STDOUT
from math import sqrt
from math import acos
import cmath
import math
class Vector(object):
    x = 0
    y = 0
    z = 0
    
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z
        
    def __sub__(self, other):
        self.x - other.x
        self.y - other.y
        self.z - other.z
    
    def dot(self,other):
        return self.x * other.x + self.y * other.y + self.z * other.z
    
    def cross(self,other):
        x1 = (self.y *other.z) - (other.y * self.z)
        y1 = (self.x *other.z) - (other.x * self.z)
        z1 = (self.x *other.y) - (other.x * self.y)
        return Vector(x1,y1,z1)
        
        
    def mod(self):
        return sqrt(self.x**2 + self.y**2 + self.z**2)
        

        
    def __str__(self):
        return "%f %f %f" %(self.x,self.y,self.z)
        


from itertools import product
a = map(float, raw_input().split())
b = map(float, raw_input().split())
c = map(float, raw_input().split())
d = map(float, raw_input().split())

ab = map(lambda x,y: x-y, b,a)
ac = map(lambda x,y: x-y, c,a)
cb = map(lambda x,y: x-y,b,c)

bc = map(lambda x,y: x-y, c,b)
cd = map(lambda x,y: x-y, d,c)



AB = Vector(ab[0],ab[1],ab[2])
AC = Vector(ac[0],ac[1],ac[2])



BC = Vector(bc[0],bc[1],bc[2])
CD = Vector(cd[0],cd[1],cd[2])

X = AB.cross(BC)
Y = BC.cross(CD)

NUM = X.dot(Y)/ float((X.mod()*Y.mod()))
print "%0.2f" %(round(math.degrees(acos(NUM)),2))






