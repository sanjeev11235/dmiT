package RobinAliAssig;

public class DemoNewString {

	public static void main(String[] args) {
		String s=new String("Hello");
		String s2="Hello";
		String s3=s;
		if(s == s2) {
			System.out.println("s == s2");
		}
		else if(s == s3) {
			System.out.println("s == s2");
		}
	}
}
