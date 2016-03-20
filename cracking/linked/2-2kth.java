import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class TestPad {

    Node head;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The number is " + n);

        TestPad test = new TestPad();

        for (int i = 0; i < 10 ; i++) {
            test.appendToTail(i % 5);
        }

        test.parseList();
        System.out.println();
        System.out.println(test.findTheElement(n));


        




    }

    public int findTheElement(int k) {
        Node n = head;
        Node runner = head;
        int distance = 0;
        while(runner.next != null) {
            if (distance >= k) {
                runner = runner.next;
                n = n.next;
            } else {
                runner = runner.next;
                distance += 1;
            }
        }

        return n.data;

    }

    public Node deleteNode (int d) {
        Node n = head;
        if (head == null) {
            return null;
        } else if (head.data == d) {
            return head.next;

        } else {

            while (n != null) {
                if (n.next.data == d) {
                    n.next = n.next.next;
                    return head;
                } 
                n = n.next;

            }
        }

        return head;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = head;

        if (head == null) {
            head = end;
            head.next = null;
            return;
        } else {

            while (n.next != null) {
                n = n.next;
            }

        }

        n.next = end;
    }

    public void parseList() {
        if (head == null) {
            System.out.println(-1);
        } else {
            Node n = head;
            while (n!= null) {
                System.out.print(n.data + "\t");
                n = n.next;
            }
        }
    }

    public void removeDuplicates() {
        Node n = head;
        Set<Integer> values = new HashSet<Integer>();

        while (n != null) {
            if (!values.contains(n.data)) {
                values.add(n.data);
            } else {
                head = deleteNode(n.data);
            }
            n = n.next;

        }
    }

    public void removeDuplicates2() {

        Node n = head;
        Set<Integer> values = new HashSet<Integer>();
        Node prev = null;
        while (n != null) {
            if (!values.contains(n.data)) {
                values.add(n.data);
                prev = n;
            } else {
                prev.next = n.next;
            }
            n = n.next;
        }
    }


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
}






class Node {

    int data;
    Node next = null;

    public Node(int d) {
        this.data = d;
    }
}
