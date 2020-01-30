package collections;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMapRl {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(100, "Amar");
		hm.put(101, "Vinay");
		hm.put(102, "Rahul");
		System.out.println("Initial list of elements: ");
		for(Map.Entry m2: hm.entrySet() ) {
			System.out.println("Keys : "+m2.getKey()+" Values : "+m2.getValue());
		}
		System.out.println("Replacing key 102 and values : ");
		hm.replace(102, "Ram");
		for(Map.Entry m3:hm.entrySet()) {
			System.out.println("Keys : "+m3.getKey()+" Values : "+m3.getValue());
		}
		System.out.println("Replacing key 101 and values : ");
		hm.replace(101, "Vikas");
		for(Map.Entry m4:hm.entrySet()) {
			System.out.println("Keys : "+m4.getKey()+" Values : "+m4.getValue());
		}
		System.out.println("Using replaceAll");
		hm.replaceAll((k,v) -> "Ajay");
		for(Map.Entry m5: hm.entrySet()) {
			System.out.println("Keys : "+m5.getKey()+" Values : "+m5.getValue());
		}
		
	}
}
