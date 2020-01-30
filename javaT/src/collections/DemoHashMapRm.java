package collections;

import java.util.HashMap;

public class DemoHashMapRm {

	public static void main(String[] args) {
		HashMap<Integer, String > map= new HashMap<Integer, String>();
		map.put(100,"Amar");
		map.put(101, "Vicky");
		map.put(102, "Rohan");
		map.put(103, "Garvit");
		System.out.println("Initial list of elements: "+map);
		//key based removal
		System.out.println("Removing by Key: ");
		map.remove(100);
		System.out.println("Updated list of elements: "+map);
		System.out.println("Removing by Value: ");
		map.remove("Rohan");
		System.out.println("Updated list of elements: "+map);
		System.out.println("Removing by key-value pair: ");
		map.remove(103, "Garvit");
		System.out.println("Updated list of elements: "+map);
	}
}
