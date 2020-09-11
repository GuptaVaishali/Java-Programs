package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new ArrayList<>(); //searching is faster in arraylist
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("banana");
		System.out.println(fruits);
		
		List<String> numbers=new LinkedList<>(); //insertion and deletion faster in linkedlist
		numbers.add("1");
		numbers.add("2");
		numbers.add("15");
		fruits.addAll(numbers);
		
		System.out.println(fruits);
		
		System.out.println(numbers);
		
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
	//	System.out.println(numbers.get(3));  //will throw exception index out of bound
		
		numbers.set(0,"20");
		System.out.println(numbers);
		
		numbers.add(0,"30");
		System.out.println(numbers);
		
		numbers.remove(0);
		System.out.println(numbers);
		
		System.out.println(fruits);
		fruits.removeAll(numbers);
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());
		
		System.out.println(fruits.size());
		System.out.println(numbers.size());
		
		System.out.println(numbers.contains("1"));
		System.out.println(numbers.contains("20"));
		
	//	Object a[]=fruits.toArray();
		String a[]=new String[numbers.size()];
		numbers.toArray(a);
		
		for(int i=0;i<numbers.size();i++) {
			System.out.println(a[i]);
		}
		
	}

}
