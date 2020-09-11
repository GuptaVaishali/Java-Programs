package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s= new LinkedHashSet<>();
		s.add("apple");
		s.add("mango");
		s.add("kiwi");
		s.add("date");
		
		s.add("mango"); //repetition not allowed
		
		System.out.println(s);  //ordered set that is LinkedHashSet
	}

}
