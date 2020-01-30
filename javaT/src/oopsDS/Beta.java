package oopsDS;

public class Beta extends Alfa {

	public void foo(String a) {
		System.out.println("Beta:foo");
	}
	public void bar(String a) {
		System.out.println("Beta:bar");
	}
	
	public static void main(String[] args) {
		Alfa a= new Beta();
		Beta b= (Beta)a;
		a.foo("test");//Alfa:foo
		b.foo("test");//Beta:foo
		a.bar("test");//Beta:bar
		b.bar("test");//Beta:bar
	}
}
