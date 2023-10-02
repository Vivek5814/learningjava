class Node {
	public int data;
	public Node next;
}

class CircularLinkedList {
	private Node head;

	public CircularLinkedList() {
		head = null;
	}

	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
			head.next = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
			System.out.println();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.insert(1);
		cll.insert(2);
		cll.insert(3);
		cll.print();
	}
}
