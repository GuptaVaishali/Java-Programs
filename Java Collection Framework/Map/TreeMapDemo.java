package maps;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m= new TreeMap<>(); //TreeMap does sorting
		m.put("apple",1);
		m.put("kiwi",2);
		m.put("banana",3);
		m.put("date",4);
		
		System.out.println(m);
		
		m.put("date",5); //if key already present replaces the old value with new value
		
		System.out.println(m);
	}
}
