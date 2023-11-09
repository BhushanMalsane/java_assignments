
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueue {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Queue using Linked List");
		Queue<Integer> l1 = new LinkedList<>();
		// add operations in queue
		l1.add(10);
		l1.add(12);
		l1.add(50);
		l1.add(89);
		l1.add(20);

		System.out.println("Size : " + l1.size());
		System.out.println("First element : " + l1.peek());
		System.out.println("Display Queue : " + l1);

		l1.poll();
		System.out.println("Display Queue : " + l1);
		l1.remove(50);
		System.out.println("Display Queue : " + l1);


	}
}
