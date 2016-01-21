# Enter your code here. Read input from STDIN. Print output to STDOUT

a1,b1 = map(float,raw_input().split())
a2,b2 = map(float,raw_input().split())
complex1 = complex(a1,b1)
complex2 = complex(a2,b2)

def my_output(number):
    
    if number >= 0:
        return "+%0.2fi" % float(str(number).strip('-'))
    else:
        return "%0.2fi" % (number)

#print "%f + %f" % (round((complex1 + complex2)[0],2),round((complex1 + complex2)[1],2))
print "%0.2f%s" %(round((complex1+complex2).real,2), my_output(round((complex1+complex2).imag,2)))

print "%0.2f%s" %(round((complex1-complex2).real,2), my_output(round((complex1-complex2).imag,2)))

print "%0.2f%s" %(round((complex1*complex2).real,2), my_output(round((complex1*complex2).imag,2)))

print "%0.2f%s" %(round((complex1/complex2).real,2), my_output(round((complex1/complex2).imag,2)))

print "%0.2f+%0.2fi" %(round(abs(complex1),2),0)
print "%0.2f+%0.2fi" %(round(abs(complex2),2),0)
