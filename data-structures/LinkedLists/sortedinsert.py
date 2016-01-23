def SortedInsert(head, data):
    temp = head
    prev = None
    
    if head == None:
        return Node(data, None, None)
    
    while temp.data < data:
        prev = temp
        temp = temp.next
        if temp == None:
            break;
    if prev:
        prev.next = Node(data, temp, prev)
    else:
        head = Node(data, temp, None)
    
    return head
