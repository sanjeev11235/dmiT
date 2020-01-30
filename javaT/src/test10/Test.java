package test10;

public class Test {

	public static void main(String[] args) {
		String st="hello";
		try {
			if(st.length() <=5) {
				throw new  Demo("DemoException");
			}
			else {
				System.out.println("N");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
