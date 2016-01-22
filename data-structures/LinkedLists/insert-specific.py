"""
 Insert Node at the end of a linked list
 head input could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method. 
"""
#This is a "method-only" submission.
#You only need to complete this method.
def InsertNth(head, data, position):
    temp = head
    if head == None:
        head = Node(data, Node)
    else:
        if position == 0:
            head = Node(data, temp)
        else:
            for i in range(0, position-1):
                temp = temp.next
            new_temp = Node(data, temp.next)
            temp.next = new_temp
            
    return head 
            
    
  
  
  
