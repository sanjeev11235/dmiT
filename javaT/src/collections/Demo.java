package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("A");
		li.add("B");
		for(String x:li ) {
			System.out.print(x);
		}
		System.out.println();
		li.stream().forEach(s -> System.out.println(s));
		List<String>col= li.stream().map(s -> s+"World").collect(Collectors.toList());
		System.out.println(col);
	}
}
