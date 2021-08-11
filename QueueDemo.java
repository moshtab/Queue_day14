package day14_Queue;

public class QueueDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to the Queue Computation Problem");
		System.out.println("The elements of Queue are ");

		Queue<String> queue = new Queue<>(3);
		queue.push("70");
		queue.push("30");
		queue.push("56");

		System.out.println();
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
