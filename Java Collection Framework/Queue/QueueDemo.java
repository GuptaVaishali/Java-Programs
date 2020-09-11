package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		q.add(12);
		q.add(13);
		q.add(34);
		
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
	//	System.out.println(q.remove());
	//	System.out.println(q.remove());
		
		System.out.println(q.element());
		
		//methods return false/null
		
		q.offer(45);
		q.offer(89);
		q.offer(93);
		
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	//	System.out.println(q.poll());
	//	System.out.println(q.poll());
		
		System.out.println(q.peek());
		
	}

}
