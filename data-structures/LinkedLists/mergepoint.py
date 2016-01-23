"""
 Find the node at which both lists merge and return the data of that node.
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 
"""

def FindMergeNode(headA, headB):
    myset = set()
    
    while headA != None or headB !=None:
        if headA != None:
            if headA not in myset:
                myset.add(headA)
                headA = headA.next
            else:
                return headA.data
        if headB != None:
            if headB not in myset:
                myset.add(headB)
                headB = headB.next
            else:
                return headB.data
        
