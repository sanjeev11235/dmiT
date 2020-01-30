package test16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public abstract class Demo {

	public static void main(String[] args) {
		HashMap<String ,String > map = new HashMap<>();//does not maintain insertion order
		map.put("a","b");
		map.put("c","d");
		map.put("e","f");
		map.put("g","h");
		
		LinkedHashMap<String ,String > map2 = new LinkedHashMap<>();//maintain insertion order
		map2.put("a","b");
		map2.put("c","d");
		map2.put("e","f");
		map2.put("g","h");
		
		TreeMap<Person, String> treem= new TreeMap<>();//maintain sorting order of keys
		Person p= new Person(1,"xbd");
		Person p2= new Person(3,"deg");				//treemap and treeset are same
		Person p3= new Person(2,"kjf");
		
		treem.put(p, "p");
		treem.put(p2, "p2");
		treem.put(p3, "p3");
		
		System.out.println("HashMap is: ");
		for(Map.Entry<String, String> m:map.entrySet()) {
			System.out.println(" Get Key: "+m.getKey()+" Get value: "+m.getValue());
		}
		System.out.println();
		
		System.out.println("LinkedHashMap is: ");
		for(Map.Entry<String, String> m2:map2.entrySet()) {
			System.out.println(" Get Key: "+m2.getKey()+" Get value: "+m2.getValue());
		}
		System.out.println();
		
		System.out.println("TreeMap is: ");
		for(Entry<Person, String> m3:treem.entrySet()) {
			System.out.println(" Get Key: "+m3.getKey().getName()+" Get value: "+m3.getValue());
		}
	}


}
