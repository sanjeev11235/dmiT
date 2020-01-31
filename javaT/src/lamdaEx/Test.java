package lamdaEx;


public class Test {

	public static void main(String[] args) {
		//using lambda expression
		
		FunInterface f= (int x)->System.out.println(2*x);
		f.abstractFun(5);
		
	}
}
