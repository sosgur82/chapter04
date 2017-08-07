package util;


import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우넛");
		queue.offer("길동");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.isEmpty());
		
		//비어있으면 null이 리턴된다.
		System.out.println(queue.poll());
	}

}
