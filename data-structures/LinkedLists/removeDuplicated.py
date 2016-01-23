def RemoveDuplicates(head):
    current = head
    old = head
    while current != None:
        if current.data == old.data:
            temp = current
            current = current.next
            if current == None:
                return temp
        else:
            old.next = current
            old = current
            current = current.next
            
    return head
            
            
