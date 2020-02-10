package RobinAliAssig;

public class ClassDemoMain {

	public static void main(String[] args) {
		ClassDemoSet s= new ClassDemoSet(101,"Himanshu");
		ClassDemoSet s2= new ClassDemoSet(102,"Akshay");
		
		System.out.println(s2.getStName());
		System.out.println(s2.getStID());
		s2.setStID(105);
		s2.setStName("Ajay");
		System.out.println(s2.getStName());
		System.out.println(s2.getStID());
	}
}
