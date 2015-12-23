# Enter your code here. Read input from STDIN. Print output to STDOUT
word = raw_input()
vowel = {'A','E','I','O','U'}
ss=0
sk=0
size = len(word)
for i in xrange(0,len(word),1):
    if word[i] in vowel:
        sk += size - i
    else:
        ss += size - i
        
if ss> sk:
    print 'Stuart ' + str(ss)
elif sk>ss:
    print 'Kevin ' + str(sk)
else:
    print 'Draw'


