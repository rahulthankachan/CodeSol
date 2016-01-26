class Stack(object):
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        
        return self.items.pop() if len(self.items)>0 else 0

    def is_empty(self):
        return (self.items == [])
    
    def __str__(self):

        s = ''
        copy = reversed(self.items)
        for item in copy:
            s += str(item)
        return s

class Posix:
    def __init__(self, posix = None):
        self.posix = posix
        self.stack = Stack()

    def evaluate(self):
        import re
        values = re.split("([^0-9])", self.posix)
        for value in values:
            if value =='' or value ==' ':
                continue
            elif value == '*':
                sum = self.stack.pop() * self.stack.pop()
                self.stack.push(sum)
            elif value == '+':
                sum = self.stack.pop() + self.stack.pop()
                self.stack.push(sum)
            else:
                self.stack.push(int(value))
        return self.stack.pop()
                
        
        
            
        
mine = Posix("56 47 + 2 *")
print(mine.evaluate())




