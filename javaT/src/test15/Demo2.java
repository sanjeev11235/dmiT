package test15;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Demo> demo= new ArrayList<>();
		Demo d= new Demo(1,"A");
		Demo d2= new Demo(2,"B");
		Demo d3= new Demo(3,"C");
		Demo d4= new Demo(4,"D");
		Demo d5= new Demo(5,"E");
		Demo d6= new Demo(6,"F");
		
		demo.add(d);
		demo.add(d2);
		demo.add(d3);
		demo.add(d4);
		demo.add(d5);
		demo.add(d6);
		
		Iterator<Demo> it= demo.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for(Demo d1:demo) {
			System.out.println(d1.getX()+" "+d1.getSt());
		}
		if(demo.contains(d2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		Demo d22= new Demo(2,"B");
		if(demo.contains(d22)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
