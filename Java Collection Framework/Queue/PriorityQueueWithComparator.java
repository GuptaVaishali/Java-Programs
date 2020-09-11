package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;


class PriorityChange implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
}

public class PriorityQueueWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>(new PriorityChange());
		pq.add(24);
		pq.add(78);
		pq.add(2);
		pq.add(95);
		pq.add(76);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}

}
