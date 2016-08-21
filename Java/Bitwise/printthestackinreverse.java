// Print the stack in reverse



public class TestPad {

	public static void main(String[] args) {

		Stack  myStack = new Stack();
		TestPad test = new TestPad();

		for (int i = 0; i < 5; i ++) {
			myStack.push(i);
		}

		test.printReverse(myStack);


	}

	public void printReverse(Stack myStack) {
		if (myStack.isEmpty()) {
			return ;
		}
		int popped = myStack.pop();
		printReverse(myStack);
		System.out.println(popped);
		
	}
}



class Stack {

	Node head;
	int count = 0;

	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		count += 1;
	}

	public int pop() {
		if (head == null) {
			return -1;
		} 

		int data = head.data;
		head = head.next;
		count -= 1;
		return data;
	}

	public int peek() {
		if (head == null) {
			return -1;
		}

		return head.data;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}

		return false;
	}
}


class Node {

	Node next;
	int data;

	protected Node(int data) {
		this.data = data;
	}

}
