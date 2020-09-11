package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m= new HashMap<>();
		m.put("apple",1);
		m.put("kiwi",2);
		m.put("banana",3);
		m.put("date",4);
		
		System.out.println(m);
		
		m.put("date",5); //if key already present replaces the old value with new value
		
		System.out.println(m);
		
		Map<String,Integer> m2=new HashMap<>();
		m2.put("vaishali", 1);
		m2.put("tanya",10);
		m2.put("ritika",9);
		
		m.putAll(m2);
		
		System.out.println(m);
		
		m.putIfAbsent("banana", 3);  // already exists
		
		m.putIfAbsent("banana", 67); // banana already exists, only unique keys allowed
		
		m.putIfAbsent("sumit", 78);  // this key- value pair does not exist already
		
		m.putIfAbsent("shikha", 2);  // value exists before but key is unique 
		
		System.out.println(m);
		
		System.out.println(m.get("kiwi"));
		System.out.println(m.get("banana"));
		
		System.out.println(m.getOrDefault("date",45)); //45 and 74 are default values , key already exists
		System.out.println(m.getOrDefault("nidhi",74)); //key already doesn't exist
		
		System.out.println(m.containsKey("vaishali"));
		System.out.println(m.containsKey("nidhi"));
		
		System.out.println(m.containsValue(2));
		System.out.println(m.containsValue(90));
		
		m.replace("tanya", 56);
		
		System.out.println(m);
		
		System.out.println(m.replace("ritika",9,97));
		System.out.println(m.replace("ritika", 8, 54));
		
		System.out.println(m);
		
		System.out.println(m.remove("sumit"));
		System.out.println(m);
		
		System.out.println(m.remove("banana",3));
		System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.entrySet());
		Set<Entry<String,Integer>> entries = m.entrySet();
		for(Entry <String,Integer> entry : entries) {
			entry.setValue(entry.getValue()*100);
		}
		
		System.out.println(m.values());
		
	}

}
