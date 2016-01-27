class Tree(object):
    def __init__(self, data = None, left = None, right = None):
        self.data = data
        self.left = left
        self.right = right

    def __str__(self):
        return str(self.data)

def traversal(root):
    if not root:
        return
    else:
        traversal(root.left)
        traversal(root.right)
        print(root, end = '')
        


def get_number(token_list):
    if get_token(token_list, '('):
        a = get_sum(token_list)
        get_token(token_list, ')')
        return a
    else:
        a = token_list[0]
        if type(a) == type(0):
            del token_list[0]
            return Tree(a)
        else:
            return 0

def get_token(token_list, token):
    a = token_list[0]
    if a == token:
        del token_list[0]
        return True
    else:
        return False

def get_sum(token_list):
    a = get_product(token_list)
    if get_token(token_list, '+'):
        b = get_sum(token_list)
        return Tree('+', a, b)
    else:
        return a

def get_product(token_list):
    a = get_number(token_list)
    if get_token(token_list, '*'):
        b = get_product(token_list)
        return Tree('*', a, b)
    else:
        return a

def pretty(root, level = 0):
    if not root:
        return
    else:
        pretty(root.right, level + 1)
        print('\t'*level + str(root))
        pretty(root.left, level + 1)
    
    





import re
exp = '2*(3+4)'
mylist = re.findall('[-+//*()]|\d+',exp)
print(mylist)

copy = mylist


for i in range(0, len(copy)):
    if re.findall('[0-9]', copy[i]):
        mylist[i] = int(copy[i])
mylist.append('end')

tree = get_sum(mylist)
traversal(tree)
print('\n\n\n')
pretty(tree)




