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


###Indentation

````
def print_tree_indented(tree, level=0):
    if tree == None: return
    print_tree_indented(tree.right, level+1)
    print('  ' * level + str(tree.data))
    print_tree_indented(tree.left, level+1)
       

````


`OUTPUT:`

`````

    3
  *
    2
+
  1


`````

####re.findall()

Withing the brackects we specify the characters to find []
also OR is done by |

example

`r = re.findall('[+-//()*]|\d',a)`

`['(', '1', '-', '2', '+', '3', ')', '*', '5', '+', '10', '/', '2']`


####type(var)

Can me used to distinguish the types of variables


####IMPORTANT MISTAKE

`print('\t'*level+root)`

root + str is not defines in the operator overloading

but str(root) + 'abcds' is defined by definition of strings class
    


####Tree based expression

*  **Sum** can be a tree with + at the root, a product on the left, and a sum on the right. Or, a sum can be just a product.
*  To raise an expression use

`raise 'BadExpressionError', 'missing parenthesis'` Python 2.7


###Postfix conversion

*  If it is a number then print the number
*  Else if it is an operator then push that operator into the stack
*  1. Check if the operator has the precendence greater than the stack operator
*  2. If it is greater then store that into stack
*  3. Else if it is equal or less than stack then pop the head
*  If it is ( then push that into the stack
*  if it is ) keep removing from the stack until you find the )


###Animal Tree Program
This program can be used to store the knowledge inside the tree 


###indexof 
will return the first index of a charater,

NOTE: for the first element it will give 1 and not 0




























