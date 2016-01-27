##Trees Solutions


###Binary Tree:

A binary tree is a tree which is characterized by any one of the following properties:

*  It can be an empty (null).
*  It contains a root node and two subtrees, left subtree and right subtree. 
*  These subtrees are also binary tree.

**Traversal**

1. Visit the left Node 
2. Visit the root Node
3. Visit the Right Node

**Depth**
We define depth of a node as follow:

*  Root node is at depth 1.
*  If the depth of parent node is d, then the depth of current node wll be d+1.

###Trees

*  The top of the tree is called the **root**.
*  Other nodes are called the **branches**
*  The nodes at the tips are called **leaves**


*  Node at the top is called the **parent**
*  Others are called the **children**
*  Children at the same level are called **siblings**(?)

*  **Nodes that are at the same distance from the root make up the level**


####Preorder Traversal or Prefix

When the contents of the root appear before the children. It is called **preorder** traversal.

````
def print_tree(tree):
    if tree == None: return
    print (tree.data, end = ' ')
    print_tree(tree.left)
    print_tree(tree.right)


````

















