
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
            
