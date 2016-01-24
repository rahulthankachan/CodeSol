number  = input()
my_list = []
for i in range(0, number):
    email = raw_input()
    if '@' in email:
        username= email.split('@')[0]
        full_extension = email.split('@')[1]
        if '.' in full_extension:
            extension = full_extension.split('.')[1]
            website = full_extension.split('.')[0]
            if len(list(filter(lambda x: x.isalnum() or x=='_' or x=='-',username)))== len(username) and \
            len(list(filter(lambda x: x.isalnum(), website))) == len(website) and len(extension)<=3\
            and len(extension)>0 and len(website)>0 and len(username):
                my_list.append(email)
print sorted(my_list)
