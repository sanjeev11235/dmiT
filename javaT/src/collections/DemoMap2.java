package collections;

import java.util.HashMap;
import java.util.Map;

public class DemoMap2 {

	public static void main(String[] args) {
		//using Generics here
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Rohan");
		map.put(2, "Ravi");
		map.put(3, "Rahul");
		
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
