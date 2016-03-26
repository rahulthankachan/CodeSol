import java.util.Set;
import java.util.HashSet;


public class TestPad {

    Node head1 = null;
    Node head2 = null;

    public static void main(String[] args) {

        TestPad test = new TestPad();
        test.appendToTailA(7);
        test.appendToTailA(1);
        test.appendToTailA(6);

        test.appendToTailB(5);
        test.appendToTailB(9);
        test.appendToTailB(2);

        test.parseA();
        test.parseB();
        System.out.println("The sume of the above 2 numbers is " + test.add());
        System.out.println("The sume of the above 2 numbers is " + test.addProper());




    }


    public int add() {
        int valueA = 0;
        int valueB = 0;
        Node n = head1;
        int power = 0;

        while (n != null) {
            valueA += n.data * Math.pow(10, power); 
            n = n.next;
            power += 1;

        }

        n = head2;
        power = 0;

        while (n != null) {
            valueB += n.data * Math.pow(10, power);
            n = n.next;
            power += 1;
        }

        return valueA + valueB;



    }


    public int length(Node head) {

        int length = 0;
        Node n = head;
        while (n != null) {
            length += 1;
            n = n.next;
        }
        return length;

    }


        public int addProper() {
        int valueA = 0;
        int valueB = 0;
        Node n1 = head1;
        Node n2 = head2;

        int length1 = length(n1) - 1;
        int length2 = length(n2) - 1;

        while (length1 >= 0) {
            valueA += n1.data * Math.pow(10, length1); 
            n1 = n1.next;
            length1 -= 1;

        }


    

        while (length2 >= 0) {
            valueB += n2.data * Math.pow(10, length2);
            n2 = n2.next;
            length2 -= 1;
        }

        return valueA + valueB;



    }


    public void appendToTailA(int d) {
        Node last = new Node(d);

        if (head1 == null) {
            head1 = last;
            return;
        }

        Node n = head1;

        while (n.next != null) {
            n = n.next;
        }
        n.next = last;


    }

        public void appendToTailB(int d) {
        Node last = new Node(d);

        if (head2 == null) {
            head2 = last;
            return;
        }

        Node n = head2;

        while (n.next != null) {
            n = n.next;
        }
        n.next = last;


    }

    public void appendToTail(int d) {

    }



    public void parseA() {
        Node n = head1;

        while (n != null) {
            System.out.print(n.data + "\t");
            n = n.next;
        }
        System.out.println();
    }

    public void parseB() {
        Node n = head2;

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

Lets think about it


*
