
import java.util.HashMap;
import java.util.Map;


public class TestPad {

    Node head;


    public static void main(String[] args) {

        Map <Integer, Integer> storage = new HashMap <Integer,Integer>();
        
        TestPad test = new TestPad();

        for (int i = 0; i < 10; i ++) {
            test.appendToTail(i%3);
        }

        for (int i = 0; i < 3; i++) {
            test.appendToTail(33);
        }
        test.appendToTail(10);

        test.display();
        test.removeDuplicateWithout2();
        test.printSeparator();
        test.display();

        System.out.println("The kth from the last for value 3 is " + test.kToTheLast(1));


    }


    int kToTheLast(int k) {
        Node runner = head;
        Node temp = head;

        for (int i = 0; i < k; i++) {
            if (runner == null) {
                System.out.println("The number of elements are smaller");
                break;
            }
            runner = runner.next;
        }

        while (runner.next != null) {
            runner = runner.next;
            temp = temp.next;
        }

        return temp.data;

    }








    void removeDuplicates() {

        if (head == null) 
            return;
        Map <Integer, Integer> storage = new HashMap <Integer, Integer> ();
        Node temp = head;
        storage.put(head.data,1);

        while (temp.next != null) {
            int key = temp.next.data;

            if (storage.containsKey(key)) {
                temp.next = temp.next.next; // deletion
            } else {
                storage.put(key,1);
                temp = temp.next;
            }

        }
    }


    void removeDuplicateWithout() {

        Node temp = head;
        Node temp2 = head.next;
        Node prev = head;

        while (temp != null) {
            temp2 = temp.next;
            prev = temp;

            while(temp2!= null) {


                if (temp.data == temp2.data) {
                    prev.next = temp2.next;
                    temp2 = temp2.next;
                } else {
                    prev = temp2;
                    temp2 = temp2.next;
                }

            }
            temp = temp.next;
        }

        

    }


    void removeDuplicateWithout2() {

        Node temp = head;

        while (temp.next !=  null) {

            Node temp2 = temp;
            while (temp2.next != null) {

                if (temp.data == temp2.next.data) {
                    temp2.next = temp2.next.next;
                } else {
                    temp2 = temp2.next;
                }
            }

            temp = temp.next;
        }


    }



    ////// Normal Methods  ///////

    void printSeparator(){

        System.out.println("###############################################\n");
    }


    void appendToTail(int data) {
        

        if (head == null) {
            // This is the first element
            Node temp = new Node(data);
            head = temp; 
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Node(data);

        }
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "\t ");
            temp = temp.next;
        }
    }


}


class Node {

    int data;
    Node next;

    public Node(int d) {
        this.data = d;
    }
}

/*

    Create a dictionary
    keep a count of the letters and the number of the elements in the dictionary
    if the key already exists then delete the element and traverse
*/


