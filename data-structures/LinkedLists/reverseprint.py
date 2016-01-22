"""
 Print elements of a linked list in reverse order as standard output
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 
"""

def reverse(head):
    temp = head
    if head == None:
        pass
    else:
        temp1 = temp.next
        temp.next = None
        while temp1!= None:
            old  = temp
            temp= temp1
            temp1 = temp1.next
            temp.next = old 
        head = temp
    return head

        
def printing(head):
    temp = head
    if temp == None:
        pass
    else:
        while temp!= None:
            print temp.data
            temp = temp.next
            
            
    
    
    
def ReversePrint(head):
    printing(reverse(head))
    reverse(head)
    
    
    


  
  
  
  

