package Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s= new HashSet<>();
		s.add("apple");
		s.add("mango");
		s.add("kiwi");
		s.add("date");
		
		s.add("mango"); //repetition not allowed
		
		Set<Integer> i = new HashSet<>();
		i.add(1);
		i.add(5);
		i.add(3);
		
		Set<String> x= new HashSet<>();
		x.add("bengan");
		x.add("torai");
		x.add("phali");
		x.add("mango");
		x.add("kiwi");
		
		System.out.println(s);  //unordered set that is HashSet
		
		System.out.println(i);
		
		System.out.println(x);
		
		s.retainAll(x);
		System.out.println(s);
		
		System.out.println(s.containsAll(x));
		
		s.addAll(x);
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove("kiwi"));
		
		System.out.println(s.removeAll(x));
		
		System.out.println(s);
		
		System.out.println(s.size());
		
	//	s.clear();
		
	//	System.out.println(s);
		
		System.out.println(x.contains("apple"));
		System.out.println(x.contains("kiwi"));
		 
		String temp[]= new String[x.size()];
		x.toArray(temp);
		for(int j=0;j<temp.length;j++) {
			System.out.println(temp[j]);
		}
	}

}
