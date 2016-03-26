import java.util.Set;
import java.util.HashSet;


public class TestPad {

    Node head = null;

    public static void main(String[] args) {

        TestPad test = new TestPad();
        test.appendToTail(1);
        test.appendToTail(2);
        test.appendToTail(1);
        test.appendToTail(4);

        for (int i = 0; i < 10; i++) {
            test.appendToTail(i%7);
        }

        test.removeDuplicates2();
        test.parse();

        test.deleteFromMiddle(2);

        test.parse();




    }

    public void deleteFromMiddle(int d) {
        Node n = head;
        while (n.data != d) {
            n = n.next;
        }
        
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;


    }




    public int kthFromEnd(int k) {
        int data;
        Node runner  = head;
        Node n = head;
        int distance = 1;
        while (runner.next != null) {

            if (distance < k) {
                runner = runner.next;
                distance += 1;
            } else {
                runner = runner.next;
                n = n.next;
            }
        }

        data = n.data;
        return data;


    }


    public void appendToTail(int d) {
        Node last = new Node(d);
        if (head == null) {
            head = last;
            return;
        } 

        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = last;

    }

    public void parse() {
        Node n = head;

        while (n != null) {
            System.out.print(n.data + "\t");
            n = n.next;
        }
        System.out.println();
    }

    public void removeDuplicates() {

        Set<Integer> sample = new HashSet<Integer>();
        Node n = head;
        if (head == null) {
            return;
        }

        sample.add(head.data);

        while (n.next != null) {
            if (sample.contains(n.next.data)) {
                n.next = n.next.next;
            } else {
                sample.add(n.next.data);
                n = n.next;
            }
        }

    }


    public void removeDuplicates2() {

        Node n = head;
        if (n == null) {
            return;
        }

        while (n != null) {
            Node runner = n;

            while (runner.next != null) {
                if (n.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
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

    public Node(int data) {
        this.data = data;
    }
}



/*




*/
