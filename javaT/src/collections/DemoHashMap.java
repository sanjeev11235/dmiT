package collections;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		System.out.println("Initial element in HashMap"+hm);
		hm.put(100, "Aman");
		hm.put(101, "Chetan");
		hm.put(102, "Gaurav");
		System.out.println("After invoking put method:");
	
		for(Map.Entry m:hm.entrySet()) {
			System.out.println("Keys : "+m.getKey()+" Values : "+m.getValue());			
		}
		hm.putIfAbsent(103, "Raman");
		System.out.println("After invoking putIfAbsent() method ");
		
		for(Map.Entry m2:hm.entrySet()) {
			System.out.println("Keys : "+m2.getKey()+" Values : "+m2.getValue());			
		}
		
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();
		hMap.put(104,"Ravi");
		hMap.putAll(hm);
		System.out.println("After invoking putAll() method: ");
		for(Map.Entry m3: hMap.entrySet()) {
			System.out.println("Keys : "+m3.getKey()+" Values : "+m3.getValue());
		}
	
	}
}
