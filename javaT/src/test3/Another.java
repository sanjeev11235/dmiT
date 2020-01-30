package test3;

public class Another extends Test {

	String  st;

	public Another() {
		super();
	}

	public Another(int x, int y,String st) {
		super(x, y);
		this.st=st;
	}
	
	public static void main(String[] args) {
		Another a= new Another(10,20,"Hello");
		System.out.println(a.x+" "+a.y+" "+a.st);
	}
	
}
