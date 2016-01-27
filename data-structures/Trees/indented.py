class Tree(object):
    def __init__(self, data = None, left = None, right = None):
        self.data = data
        self.left = left
        self.right = right

    def __str__(self):
        return str(self.data)

    def total(self):
        tree = self
        if not tree:
            return 0
        else:
            if not tree.right and not tree.left:
                return self.data
            elif not tree.right:
                return self.data + tree.left.total()
            elif not tree.left:
                return self.data + tree.right.total()
            else:
                return self.data + tree.right.total() + tree.left.total()

## Outside implementation
            
def total(root):
    if root == None:
        return 0
    else:
        return total(root.left) + total(root.right) + root.data

def print_tree(tree):
    if tree == None: return
    print (tree.data, end = '\n')
    print_tree(tree.left)
    print_tree(tree.right)

def print_tree_postorder(tree):
    if tree == None: return
    print_tree_postorder(tree.left)
    print_tree_postorder(tree.right)
    print(tree.data, end= ' ')

def print_in_order(root):
    if not root:
        return
    else:
        print_in_order(root.left)
        print(root.data, end ='')
        print_in_order(root.right)




def print_tree_indented(tree, level=0):
    if tree == None: return
    print_tree_indented(tree.right, level+1)
    print('  ' * level + str(tree.data))
    print_tree_indented(tree.left, level+1)
        


            




tree = Tree('+', Tree(1), Tree('*', Tree(2), Tree(3)))

print_tree_indented(tree)

