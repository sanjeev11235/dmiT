package RobinAliAssig;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemDupEleArraylist {

	public static void main(String[] args) {
		
		ArrayList< String> al= new ArrayList<>();
		al.add("Ashish");
		al.add("Aniket");
		al.add("Deepak");
		al.add("Sanjeev");
		al.add("Shrikanth");
		al.add("Ashish");
		al.add("Aniket");
		System.out.println("Elements in list are: ");
		System.out.println(al);
		Set st= new HashSet<String>(al);
		System.out.println("Elements after removing duplicates: ");
		System.out.println(st);
		
		
	}
}
