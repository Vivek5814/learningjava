using System;

public class Node {
	public int data;
	public Node next;
}

public class CircularLinkedList {
	private Node head;

	public CircularLinkedList() {
		head = null;
	}

	public void Insert(int data) {
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

	public void Print() {
		if (head == null) {
			Console.WriteLine("List is empty");
		} else {
			Node temp = head;
			do {
				Console.Write(temp.data + " ");
				temp = temp.next;
			} while (temp != head);
			Console.WriteLine();
		}
	}
}

public class Program {
	public static void Main() {
		CircularLinkedList cll = new CircularLinkedList();
		cll.Insert(1);
		cll.Insert(2);
		cll.Insert(3);
		cll.Print();
	}
}
