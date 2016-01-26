class Priority(object):
    def __init__(self):
        self.items = []
        self.length = 0
    def is_empty(self):
        return (len(self.items) == 0)
    def insert(self, data):
        self.items.append(data)

    def remove(self):
        maxi = 0
        for i in range(1, len(self.items)):
            if self.items[i] > self.items[maxi]:
                maxi = i
        item = self.items[maxi]
        self.items.remove(item)
        return item
    def __str__(self):
        s = ''
        for item in self.items:
            s += str(item) + ' '
        return s
            
q = Priority()
q.insert(1)
q.insert(2)
q.insert(3)
q.insert(4)
q.insert(25)
q.insert(4)
q.insert(1)
q.insert(2)
q.insert(3)
q.insert(4)


while not q.is_empty():
    print('Removed '+ str(q.remove()))
    print(q)

            

