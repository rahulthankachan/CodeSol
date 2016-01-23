"""
 Reverse a doubly linked list
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None, prev_node = None):
       self.data = data
       self.next = next_node
       self.prev = prev_node

 return the head node of the updated list 
"""
def Reverse(head):
    
    if head == None:
        return None
    elif head.next == None:
        return head
    else:
        temp = head
        prev = None
        while temp != None:
            check = temp
            temp = temp.next
            
            check.next = prev
            if prev:
                prev.prev = check
            prev = check
            
        head = prev
        return head
            
