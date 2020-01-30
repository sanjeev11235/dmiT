package test14;

public class Demo2 extends Exception{

	public Demo2(String st) {
		super(st);
	}
	public Demo2() {}
	//ArithmeticException
	public void show() {
		try {
			if(10>5) {
				throw new Demo2("ArithmeticException From show()");
			}			
		}
		catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}	
	}
	//NullPointerException
	public void showA() {
		try {
			if(true) {
				throw new Demo2("NullPointerException From showA()");
			}
		} catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
	}
	//NumberFormatException
	private void showB() {
		try {
			throw new Demo2("NumberFormatException From showB()");
		} catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
	}
	//ArrayIndexOutOfBoundsException
	private void showC() {
		try {
			throw new Demo2("ArrayIndexOutOfBoundsException From showC()");
		} catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
	}
	//IndexOutOfBoundsException
	private void showD() {
		try {
			throw new Demo2("IndexOutOfBoundsException From showD()");
		} catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
	}
	//StringIndexOutOfBoundsException
	private void showE() {
		try {
			throw new Demo2("StringIndexOutOfBoundsException From showE()");
		} catch (Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
	}
	public static void main(String[] args){
		
		Demo2 d= new Demo2();
		d.show();
		d.showA();
		d.showB();
		d.showC();
		d.showD();
		d.showE();
//		try {			
//			throw new Demo2("ArithmeticException");
//		} catch (Exception e) {
//			System.out.println("Caught: "+e.getMessage());
//		}
		
	}
	
	
	
	
}
