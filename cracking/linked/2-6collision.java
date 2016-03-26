import java.util.Set;
import java.util.HashSet;


public class TestPad {

    Node head = null;
    Node third = null;


    public static void main(String[] args) {

        TestPad test = new TestPad();
        test.appendToTail(1);
        test.appendToTail(2);
        test.appendToTail(3);
        test.appendToTail(4);
        test.appendToTail(5);
        test.appendToTail(6);
        test.appendToTail(7);
        test.appendToTail(8);
        


        test.parse();
        System.out.println(test.checkForLoop());
        test.findTheMeetingPoint();

    }


    public void findTheMeetingPoint() {
        Node faster = head;
        Node slower = head;
        int k = 0;

        while (slower.next != null && faster.next != null && faster !=null && faster.next.next != null) {
            slower = slower.next;
            faster = faster.next.next;
            
            if (slower == faster) {
                System.out.println("Collision");
                break;
            }


        }

        slower = head;
        while (slower != faster) {
            slower = slower.next;
            faster = faster.next;
        }

        System.out.println("THE HOPS vales IS " + slower.data);
    }


    public int checkForLoop() {

        Node n = head;
        Node runner = head;

        while (n.next != null && runner != null && runner.next != null && runner.next.next != null) {
            runner = runner.next.next;
            n = n.next;
            if (runner == n) {
                System.out.println("There is a loop");
                break;
            }
        }
        return -1;
    }

    public void appendToTail(int d) {
        Node last = new Node(d);
        Node n = head;

        if (head == null) {
            head = last;
            return;
        }

        while (n.next != null) {
            n = n.next;
        }

        if (length() == 3) {
            third = last; // This will have reference to the third node;
        } 

        if (length() == 7) {
            n.next = last;
            last.next = third;
            return;
        } 

        n.next = last;





    }

    public int length() {
        Node n = head;
        int count = 0;
        while (n != null) {
            count += 1;
            n = n.next;
        }
        return count;
    }


    public void parse() {
        Node n = head;
        int max = 10;

        while (n != null && max > 0) {
            System.out.print(n.data + " ");
            n = n.next;
            max -=1;
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

Lets think about it


*/
