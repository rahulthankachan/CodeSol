class Tree(object):
    def __init__(self, data =None, left = None, right = None):
        self.data = data
        self.right = right
        self.left = left

    def __str__(self):

        return str(self.data)

def yes(text):
    if text[0] == 'y' or text[0] == 'Y':
        return True
    else:
        return False


def animal():
    root = Tree('Tiger')

    while True:

        ans = yes(input('Are we talking about an animal here? '))

        tree = root
        if not ans:
            break
        else:
            while tree.left !=None:
                if yes(input(tree.data)):
                    tree = tree.right
                else:
                    tree = tree.left


        ##Evaluate

        guess = tree.data
        question = 'Is it %s ' %(str(tree.data)) 
        if yes(input(question)):
            print('I am so cool !!')
            continue
        else:
            animal = input('What is the animal then? ')
            question = input('Give a question to distinguish %s from %s ' %(animal, guess))
            ans = input('You ans for %s is ' %(animal))

            tree.data = question
            if yes(ans):
                tree.left = Tree(guess)
                tree.right = Tree(animal)
            else:
                tree.left = Tree(animal)
                tree.right = Tree(guess)

        
                

animal()

            
            

