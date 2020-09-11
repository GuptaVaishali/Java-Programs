package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>(2);
		pq.add(34);
		pq.add(2);
		pq.add(12);
		pq.add(45);
		
		System.out.println(pq);
		
		System.out.println(pq.element());
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	//	System.out.println(pq.remove());
		
		pq.offer(89);
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		PriorityQueue<String> p= new PriorityQueue<>();
		p.add("vaishali");
		p.add("ritika");
		p.add("shikha");
		p.add("tanya");
		
		System.out.println(p);
		
		System.out.println(p.element());
		
		System.out.println(p.remove());
		System.out.println(p.remove());
		System.out.println(p.remove());
		System.out.println(p.remove());
		
	}

}
