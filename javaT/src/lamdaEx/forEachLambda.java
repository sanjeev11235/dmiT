package lamdaEx;

import java.util.ArrayList;
import java.util.List;

public class forEachLambda {

	public static void main(String[] args) {
		List<String> al= new ArrayList<>();
		al.add("Mango");
		al.add("Banana");
		al.add("Grapes");
		al.add("Avacado");
		
		al.forEach((a)->System.out.println(a));
	}
}
