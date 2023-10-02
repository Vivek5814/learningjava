class Node {
constructor(value) {
	this.value = value;
	this.next = null;
}
}

class LinkedList {
constructor() {
	this.head = null;
	this.tail = null;
	this.length = 0;
}

append(value) {
	const newNode = new Node(value);

	if (!this.head) {
	this.head = newNode;
	this.tail = newNode;
	} else {
	this.tail.next = newNode;
	this.tail = newNode;
	}

	this.length++;
}

prepend(value) {
	const newNode = new Node(value);

	if (!this.head) {
	this.head = newNode;
	this.tail = newNode;
	} else {
	newNode.next = this.head;
	this.head = newNode;
	}

	this.length++;
}

insert(index, value) {
	if (index >= this.length) {
	this.append(value);
	} else if (index === 0) {
	this.prepend(value);
	} else {
	const newNode = new Node(value);
	let currentNode = this.head;
	let i = 0;

	while (i < index - 1) {
		currentNode = currentNode.next;
		i++;
	}

	newNode.next = currentNode.next;
	currentNode.next = newNode;

	this.length++;
	}
}

remove(index) {
	if (index === 0) {
	this.head = this.head.next;
	} else {
	let currentNode = this.head;
	let i = 0;

	while (i < index - 1) {
		currentNode = currentNode.next;
		i++;
	}

	currentNode.next = currentNode.next.next;

	if (index === this.length - 1) {
		this.tail = currentNode;
	}
	}

	this.length--;
}

toArray() {
	const result = [];
	let currentNode = this.head;

	while (currentNode) {
	result.push(currentNode.value);
	currentNode = currentNode.next;
	}

	return result;
}
}
