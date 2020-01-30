package oops.poly;

public class Test {
	
	//method overloading changing data type of arguments
	public void display(String fullname) {
		System.out.println(fullname);
	}
	public void display(int age,int sal) {
		System.out.println(age +" "+sal);
	}
	
	public long display() {
		return 9870134036l;
	}
	
	//method overloading changing numbers of arguments
	public void addSal(int hra, int da) {
		System.out.println(hra+da);
	}
	
	public void addSal(int bs, int hra, int da) {
		System.out.println(bs+hra+da);
	}
	public static void main(String[] args) {
		
		new Test().display("Sanjeev Kumar Saini");
		new Test().display(25, 2500000);
		System.out.println(new Test().display());
		
		new Test().addSal(10000,15000);
		new Test().addSal(10000,15000,20000);
	}

}
