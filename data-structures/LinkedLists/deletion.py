"""
 Delete Node at a given position in a linked list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method. 
"""

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
        
        
  
