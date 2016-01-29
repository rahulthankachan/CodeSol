import hashlib
import random

def hash_password(password):
    val = random.randrange(1,5)
    hash_p = hashlib.md5(str(password).encode() + str(val).encode()).hexdigest() + ':' + str(val)
    return hash_p

def check_password(password, old):
    oldp, oldsalt = old.split(':')
    return oldp == hashlib.md5(str(password).encode() + str(oldsalt).encode()).hexdigest()
    
    
password = 'Rahul'
encode_sha1 = hashlib.sha1(password.encode())
print(encode_sha1)

encode_md5 = hashlib.md5(password.encode())
print(encode_md5)
old = hash_password('Rahul')

print(check_password('Tena', old))
print(check_password('Rahul', old))




