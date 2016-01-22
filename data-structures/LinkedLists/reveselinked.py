"""
 Reverse a linked list
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""

def Reverse(head):
    temp = head
    if head != None:
        temp1 = temp.next
        temp.next = None
        while temp1 != None:
            old = temp
            temp = temp1 
            temp1 = temp1.next
            temp.next = old
        head = temp 
    return head


  
  
  
  
  
  

