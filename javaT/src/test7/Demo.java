package test7;

public class Demo {
	
	public Demo() {
		
	}
	public Demo(String aa) {
		System.out.println(aa);
	}

	public static void main(String[] args) {
		new Demo("Hello");
		new Demo();
	}
}
