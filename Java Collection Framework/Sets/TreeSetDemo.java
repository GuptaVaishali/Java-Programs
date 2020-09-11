package Sets;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s= new TreeSet<>();
		s.add("apple");
		s.add("mango");
		s.add("kiwi");
		s.add("date");
		
		s.add("mango"); //repetition not allowed
		
		System.out.println(s);  //Sorted set that is TreeSet
		
		Set<Integer> s1= new TreeSet<>();
		s1.add(7);
		s1.add(3);
		s1.add(9);
		s1.add(4);
		
		s1.add(3); //repetition not allowed
		
		System.out.println(s1);  //Sorted set that is TreeSet
	}

}
