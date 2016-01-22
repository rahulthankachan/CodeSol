#Body
"""
 Compare two linked list
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""

def CompareLists(headA, headB):
    temp1 = headA
    temp2 = headB
    while temp1 != None or temp2 != None:
        if temp1 == None:
            return 0
        if temp2 == None:
            return 0
        if temp1.data == temp2.data:
            temp1 = temp1.next
            temp2 = temp2.next
        else:
            return 0
            
    return 1
        
            
  
  
