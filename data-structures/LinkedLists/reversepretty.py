class Node(object):
    def __init__(self, data = None, next_node = None):
        self.data = data
        self.next = next_node
    def __str__(self):
        return str(self.data)
    def reverse(self):
        if self.next != None:
            self.next.reverse()
        print(self, end =' ')
    def pop(self):
        print('The data' + str(self.data))
        prev = None
        temp = self
        if temp==None:
            return 0
        if temp.next == None:
            self = None
            return temp
            
        
        while temp.next != None:
            print('yay')
            prev = temp
            temp = temp.next
        prev.next = None
        
        return temp
            
            
        

class LinkedList(object):
    def __init__(self):
        self.head = None
        self.length = 0
        
    def insert(self,values):
        for value in values:
            temp = Node(value)
            temp.next = None
            
            if not self.head:
                self.head = temp
            else:
                counter = self.head
                while counter.next:
                    counter = counter.next
                counter.next = temp
            self.length += 1
            
            
    def __str__(self):
        temp = self.head
        s = ''
        while temp:
            s += str(temp)
            temp = temp.next
        return s
    def rpretty(self):
        temp = self.head
        print('[', end='')
        if temp:
            self.head.reverse()
        print(']', end ='')

    def pop(self):

        if self.head != None:
            value = self.head.pop()
            if value == self.head:
                self.head = None
            if value:
                print('Popped '+ str(value))
        else:
            print('All values Popped')
            
        



