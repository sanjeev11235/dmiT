package lamdaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLambdaMain {

	public static void main(String[] args) {
		List<ComparatorLambdaDemo> al= new ArrayList<ComparatorLambdaDemo>();
		al.add(new ComparatorLambdaDemo(1, "HP", 25000f));
		al.add(new ComparatorLambdaDemo(2, "lenovo", 22000f));
		al.add(new ComparatorLambdaDemo(3, "Dell", 20000f));
		System.out.println("Elements in list are: ");
		
		System.out.println("Sorting on the basis of name... ");
		//implementing lambda expression	??
		Collections.sort(al, (p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(ComparatorLambdaDemo c:al) {
			System.out.println("Id is "+c.id+" Name is "+c.name+" Price is "+c.price);
		}
	}
}
