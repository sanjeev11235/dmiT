package test7;

public class Test2 extends Test{

	public static void main(String[] args) {
		Test2 t= new Test2();
		System.out.println(t.num);
		System.out.println(t.st);
		
		try {
//			if(t.st.equals("abc")) {//throw null pointer exception
			if("abc".equals(t.st)) {
				System.out.println("abc");
			}
		} catch (Exception e) {
			System.out.println("exception : "+e);
		}
		
	}
}
