package test2;

public class Test extends Demo {

	public void show() {
		System.out.println("in test package test2");
	}
	
	public Test() {
		super();
		System.out.println("In cons package test2");
	}

	public static void main(String[] args) {
		new Test();
	}
}
