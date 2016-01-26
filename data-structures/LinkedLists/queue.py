class Node(object):
    def __init__(self, data = None, next_node = None):
        self.data = data
        self.next = next_node
    def __str__(self):
        return str(self.data)


class Queue(object):
    def __init__(self):
        self.head = None
        self.length = 0

    def insert(self, item):
        new_node = Node(item, None)
        new_node.next = None
        
        if self.head == None:
            #First element
            self.head = new_node
        else:
            last = self.head
            while last.next:
                last = last.next
            print(last.data)
            last.next = new_node

    def __str__(self):
        s = ''
        temp = self.head
        
        while temp:
            s += str(temp)
            temp = temp.next
        return s


            
    def remove(self):

        if self.head != None:
            temp = self.head
            self.head = self.head.next
            return temp
        else:
            return None

    def is_empty(self):
        return str(self.head == None)
    

class ImprovedQueue(Queue):
    def __init__(self):
        self.head = None
        self.last = None
        self.length = 0

    def remove(self):

        if self.head != None:
            temp = self.head
            self.head = self.head.next
            if not self.head:
                self.last = None
            return temp
        else:
            return None
        
    def insert(self, item):
        new_node = Node(item, None)
        new_node.next = None
        
        if self.head == None:
            #First element
            self.head = self.last = new_node
        else:
            last = self.last
            last.next = new_node
            self.last = new_node

        
        
    

        
        
q = ImprovedQueue()
q.insert(1)
print(q)
q.insert(2)
print(q)
q.remove()
print(q)
q.remove()
print(q)



