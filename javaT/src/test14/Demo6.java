package test14;

public class Demo6 {

	public Demo6(int x, int i) {
		System.out.println(x * i);
	}
	public Demo6(int x) {
		this(x,10);
		System.out.println(x);
	}
	
	public Demo6() {
		this(5);
		System.out.println("default constructor");
	}	

	public static void main(String[] args) {
		new Demo6();
	}
}
