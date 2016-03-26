import java.util.Set;
import java.util.HashSet;


public class TestPad {

    Node head = null;
    Node element = null;
    Node tail = null;

    public static void main(String[] args) {

        TestPad test = new TestPad();
        test.appendBook(1);
        test.appendBook(2);
        test.appendBook(-2);
        test.appendBook(-5);



        test.parse();


        test.parse();




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
            element = last;
            return;
        } 

        if (d >= element.data) {
            last.next = element.next;
            element.next = last;

        } else {

            last.next = head;
            head= last;

        }

    }



    public void appendBook(int d) {
        Node last = new Node(d);

        if (tail == null || head == null) {
            tail = head = last;
            return;
        }

        if (d >= tail.data) {
            tail.next = last;
            tail = last;
        } else {
            last.next = head;
            head = last;
        }


    }

    public void parse() {
        Node n = head;

        while (n != null) {
            System.out.print(n.data + "\t");
            n = n.next;
        }
        System.out.println();
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
