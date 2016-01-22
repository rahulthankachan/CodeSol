"""
 Merge two linked lists
 head could be None as well for empty list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method.
"""
def MergeLists(headA, headB):
    if headA == None and headB == None:
        return None
    else:
        temp1 = headA
        temp2 = headB
        
        headf = None
        tempf = None
        
        while temp1!= None or temp2!= None:
            
            if temp2 == None:
                    #print '1'
                    new_node = Node(temp1.data, None)
                    if headf == None:
                        tempf = new_node
                        headf = tempf
                    else:
                        tempf.next = new_node
                        tempf = new_node
                    temp1 = temp1.next
                    
            elif temp1 == None:
                   # print '2'
                    new_node = Node(temp2.data, None)
                    if headf == None:
                        tempf = new_node
                        headf = tempf
                    else:
                        tempf.next = new_node
                        tempf = new_node
                    temp2 = temp2.next
                    
            elif temp1.data >= temp2.data:
                #print '3'
                if headf == None:
                    tempf = Node(temp2.data, None)
                    headf = tempf
                    temp2 = temp2.next
                else:
                    new_node = Node(temp2.data, None)
                    tempf.next = new_node
                    tempf = new_node
                    temp2 = temp2.next
                    
            elif temp1.data < temp2.data:
                #print '4'
                if headf == None:
                    tempf = Node(temp1.data, None)
                    headf = tempf
                    temp1 = temp1.next
                else:
                    new_node = Node(temp1.data, None)
                    tempf.next = new_node
                    tempf = new_node
                    temp1 = temp1.next
                    

    return headf

