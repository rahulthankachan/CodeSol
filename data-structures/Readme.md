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


**Merge- Sorted**

Simple Method

````
def MergeLists(headA, headB):
    
    if headA == None and headB == None:
        return None
    if headA == None:
        return headB
    if headB == None:
        return headA
    if headA.data <= headB.data:
        headA.next = MergeLists(headA.next, headB)
        return headA
    else:
        headB.next = MergeLists(headA, headB.next)
        return headB

````


**Other**:

````

class Node(object):

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






````

####Reverse printing at a position

Process

*  Traverse using a fast pointer starting from head
*  Traverse using another pointer called slow
*  Stop or delay the Slow pointer till the some index is greater than position

````
def GetNode(head, position):
    fast = head
    slow = head
    index = 0
    while fast.next != None:
        fast = fast.next
        index += 1
        if index > position:
            slow= slow.next
    return slow.data





````


####Delete Duplicate


This can be done using 2 pointers

**2 cases**

*   Next is also same: In this case current = current.next
*   Only IMP 1111 Case: check if current == None, return temp
*   Else Not equal, Old = Current Pointer


####Finding a cycle

*  Put the node in a set
*  Check if it's already avalable in the set
  

####Finding a merge point

*  One IMP Point: The is a case when the pther cycle is very small


####Reverse Doubly

Again, be very careful in the order of traversal

````
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
            




````



















