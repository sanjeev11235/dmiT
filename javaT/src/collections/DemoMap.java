package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		//Non Generic
		Map map= new HashMap();
		map.put(1, "Rohit");
		map.put(2, "Rahul");
		map.put(3, "Raj");
		map.put(4, "Ram");
		map.put(4, "Raj");
		
		Set<?> set= map.entrySet();
		Iterator<?> itr =set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println("Get Key: "+entry.getKey()+" Get Value: "+entry.getValue());
		}
	}
}
