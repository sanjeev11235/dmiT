package test4;

public class Child extends Parent {
	
	public void show() {
		System.out.println("In Child");
	}

	public void showAll() {
		System.out.println("In child showAll");
	}
	public static void main(String[] args) {
		Parent p = new Child();
		p.show();
//		p.showAll();// Not visible 
		Child c= new Child();
		c.showAll();
		Parent p2 =new Child();
		((Child) p2).showAll();
		
		
	}
}
