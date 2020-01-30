package test5;

import test5.Parent;

public class Child extends Parent {

	public void show() {
		System.out.println("In Child");
	}

	
	public static void main(String[] args) {
		Parent p = new Child();
		p.show();
		p.showAll();
		Child c = new Child();
		c.show();
		c.showAll();
		
//		Child c2= (Child) new Parent();
//		c2.show();
//		c2.showAll();
	}
}
