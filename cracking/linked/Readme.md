##Linked Lists

In an **Interview** we need to understand if it is a singly or a doubly linkedList

###Deletion
1. Check for the Head condition
2. Check for the Null Condition

###Runner Technique

1. Fixed Distance
2. Or hop multiople node for every single



```````
    public void removeDuplicates3 () {
        Node n = head;
        while (n != null) {
            Node runner = n;
            while (runner.next != null) {
                if (n.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    /// This important else // if not in else this will give NULL pointer error
                    runner = runner.next;
                }
                

                
            }

            n = n.next;
        }

    }





```````


### Kth from the end


``````
    public Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
        }

        n = n.next;

        return head;
    }




``````