package day14_Queue;

interface Iqueue<T> {
	void push(T data);

	T peek();

	T poll();

	boolean isEmpty();

	boolean isFull();
}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

class Queue<T> implements Iqueue<T> {
	int maxSize, size;
	Node<T> head, tail;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.head = null;
		this.tail = null;

	}

	public void push(T data) {
		if (isFull()) {
			System.out.println("Queue is full");

		}
		if (isEmpty()) {
			head = tail = new Node<T>(data);
			System.out.println(head.data);
		} else {
			Node<T> newNode = new Node<>(data);
			tail.next = newNode;
			tail = tail.next;
			System.out.println(tail.data);
		}
		size++;
	}

	public T poll() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		Node<T> tmp = head;
		head = head.next;
		size--;
		return tmp.data;
	}

	public T peek() {
		return head.data;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == maxSize;
	}

}
