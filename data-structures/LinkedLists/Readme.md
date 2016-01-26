##Linked lists

One of the reasons that the traversal is a pure function because
want it to work for **None** also


There is a technique where in LinkedList is created as a wrapper class and the Node is created as a helper class

*  Wrapper
*  Helper

`Same highlighted in the reverese pretty`


##Stacks

The interface elements include:

*	**__init__()** This method is used to initialize a stack
*	**push()** This is used to add an element
*	**pop()** This is used to pop and element
*	**is_empty()** To check if the stack is empty

````

class Stack(object):
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        
        return self.items.pop() if len(self.items)>0 else 0

    def is_empty(self):
        return (self.items == [])
    
    def __str__(self):

        s = ''
        copy = reversed(self.items)
        for item in copy:
            s += str(item)
        return s




````

####Regular expresion

import re

`token_list = re.split("([^0-9])", expr)`



##Queues

The interface elements include:

*	**__init__()** This method is used to initialize a stack
*	**insert()** This is used to add an element
*	**remove()** This is used to pop and element
*	**is_empty()** To check if the stack is empty


`Queue will have constant time removal`

`Included in the Queue.py`




