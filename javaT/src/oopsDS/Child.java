package oopsDS;

public class Child extends Parent {

	void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.property(); // parent class method executed
		c.m1(); // child class method executed
	}
}
