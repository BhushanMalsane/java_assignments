import java.util.*;
public class QueueImpl<T> {
	private LinkedList<T> ls= new LinkedList<>();
	
	//Adding element in queue
	public void enqueue(T element) {
		ls.addLast(element);
	}
	
	//Removing element in queue
	public T dequeue() {
		if(ls.isEmpty()) {
			System.out.println("Queue is empty");
		}
		return ls.removeFirst();
	}
	//size of queue
	public int size(){
		return ls.size();
	}
	
	//checking whether queue is empty or not
	public boolean Empty() {
		return ls.isEmpty();
	}
	//Returning top element in queue
	public T topElement() {
		if(ls.isEmpty()) {
			System.out.println("Queue is empty");
		}
		return ls.getFirst();
	}
	
	public static void main(String[] args) {
		QueueImpl<Integer> queue= new QueueImpl<>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		System.out.println("Size of queue: "+ queue.size());
		System.out.println("Removing element : "+ queue.dequeue());
		System.out.println("Topmost element : "+ queue.topElement());
	}
}
