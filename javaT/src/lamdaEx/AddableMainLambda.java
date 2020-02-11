package lamdaEx;

public class AddableMainLambda {

	public static void main(String[] args) {
		//without return keyword
		Addable a1= (a,b)->(a+b);
		System.out.println(a1.add(10, 20));
		
		Addable a2= (a,b)->(a-b);
		System.out.println(a2.add(25, 20));
		
		//with return keyword
		Addable a3= (a,b)->{
			return a*b;
		};
		System.out.println(a3.add(5, 5));
	}
}
