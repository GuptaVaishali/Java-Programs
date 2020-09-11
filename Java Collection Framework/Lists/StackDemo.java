package Lists;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<>();
		s.push(12);
		s.push(20);
		s.push(24);
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		
		System.out.println(s.peek());
		
	//	System.out.println(s.pop());
	//	System.out.println(s.pop());
	//	System.out.println(s.pop()); //empty StackException will be thow out
		
		System.out.println(s);
		System.out.println(s.search(12));
		
		System.out.println(s.empty());
		
	}

}
