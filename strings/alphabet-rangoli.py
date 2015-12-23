# Enter your code here. Read input from STDIN. Print output to STDOUT
number = int (raw_input())
list_alpha = []
#for i in xrange(number):

if number ==1:
    print 'a'
else:
    
    for i in xrange(0,number,1):
        list_alpha = map(lambda x: chr(ord('a') + x), [x for x in xrange(number-1,number-i-1,-1)])
        #print list_alpha
        #print list(reversed(list_alpha))

        print  (('-').join(list_alpha)+ '-' + chr( number-1-i + ord('a')) + '-' + ('-').join(list(reversed(list_alpha))) ).center(number*2*2-3,'-')
    
    for i in xrange(number-2,-1, -1):
        list_alpha = map(lambda x: chr(ord('a') + x), [x for x in xrange(number-1,number-i-1,-1)])
    #print list_alpha
    #print list(reversed(list_alpha))

        print  (('-').join(list_alpha)+ '-' + chr( number-1-i + ord('a')) + '-' + ('-').join(list(reversed(list_alpha))) ).center(number*2*2-3,'-')
    
