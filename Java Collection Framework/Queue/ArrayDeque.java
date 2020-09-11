package Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(23);
		ad.addFirst(45);
		ad.addFirst(89);
		ad.addLast(90);
		ad.addLast(3);
		System.out.println(ad);
		
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeLast());
		
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		//return null/false
		
		ad.offerFirst(5);
		ad.offerLast(56);
		
		System.out.println(ad);
		
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		
		//deque as a stack
		
		ad.push(67);
		ad.push(8);
		
		System.out.println(ad);
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		
		System.out.println(ad.peek());
		
		//deque as queue
		
		ad.add(879);
		ad.offer(456);
		ad.offer(869);
		
		System.out.println(ad);
		
		System.out.println(ad.remove());
		System.out.println(ad.poll());
		System.out.println(ad.element());
		System.out.println(ad.peek());
	}
}
