class Golfer:
    def __init__(self, name, score):
        self.name = name
        self.score = score
    def __str__(self):
        return 'Name '+ self.name + ' Score ' + str(self.score)
    def __gt__(self, other):
        if self.score > other.score:
            return True
        else:
            return False
    def __eq__(self, other):
        if self.score == other.score:
            return 1
        else:
            return 0

class Priority(object):
    def __init__(self):
        self.items = []
        self.length = 0
    def is_empty(self):
        return (len(self.items) == 0)
    def insert(self, name, score):
        new_golfer = Golfer(name, score)
        self.items.append(new_golfer)

    def remove(self):
        maxi = 0
        for i in range(1, len(self.items)):
            if self.items[i] < self.items[maxi]:
                maxi = i
        item = self.items[maxi]
        self.items.remove(item)
        return item
    def __str__(self):
        s = ''
        for item in self.items:
            s += str(item) + '\n'
        return s
            
q = Priority()
q.insert('Rahul', 1)
q.insert('Teena', 2)
q.insert('Meena', 0)
q.insert('Rahul', 1)

while not q.is_empty():
    print(q)
    q.remove()

            

