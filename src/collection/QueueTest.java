package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();

		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우넛");
		queue.offer("희동이");
		
		System.out.println(queue.isEmpty());	// 비어있는가?
		System.out.println(queue.poll());		// 꺼내기! 선입선출
		System.out.println(queue.poll());
		System.out.println(queue.peek());		// 맨 위에 뭐가 있는가?
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.isEmpty());
		
		System.out.println(queue.poll());	
		// 비어있는 경우에는 예외가 발생하지 않고 null을 리턴한다.
	}

}
