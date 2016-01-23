"""
 Check if linked list has cycle
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return 0 if no cycle else return 1
"""

def HasCycle(head):
    temp = head
    myset = set()
    while temp != None:
        if temp in myset:
            return 1
        else:
            myset.add(temp)
            temp = temp.next
            
    return 0
            
  
  
  
  
  
  
  

