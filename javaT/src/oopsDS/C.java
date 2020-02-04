package oopsDS;

public class C extends B {

	void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();

		B b = new B();
		b.m1();
		b.m2();

		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}
}
