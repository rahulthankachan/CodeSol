##Data- Structures

This section is dedicated to the data-section module

###Linked List

**Traversal** As simple traversal

````

 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node
 
 
"""
def print_list(head):
    temp = head
    while temp != None:
        print temp.data
        temp = temp.next


````

**Insert**

*  **Last** go to the last element and then make it point to the new element
*  **First** or Head  (Careful!!!) Make the New node point to HEAD and not HEAD pointer
*  **Between A position** - Come to the node which is just before the postion so use range(0, position-1) As the inside statement will instead take you to **the position** and we will be stuck


**Deletion**

Similar to insertion

*  Careful while deleting the first element
*  Also deletion is like insertion in between

````
def Delete(head, position):
    temp = head
    if position == 0:
        head = head.next
        temp = None
    else:
        for i in range(0, position-1):
            temp = temp.next
        del_temp = temp.next
        temp.next = del_temp.next
        del_temp = None
        
    return head


````

**Reverse Printing**

*  DO NOT store in an array and then show
*  Reverse the linked list and then print
*  Reverse it again

````
def reverse(head):
    temp = head
    if head == None:
        pass
    else:
        temp1 = temp.next
        temp.next = None
        while temp1!= None:
            old  = temp
            temp= temp1////// ORDER IS CRUCIAL
            temp1 = temp1.next
            temp.next = old 
        head = temp
    return head

    
    
def ReversePrint(head):
    printing(reverse(head))
    reverse(head)


````


BEST:

```
def ReversePrint(head):
    if head == None:
        pass
    else:
        ReversePrint(head.next)
        print(head.data)




```











