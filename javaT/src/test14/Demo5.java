package test14;

public class Demo5 {

	public static void main(String[] args) {
		try {
			//creating exception
			ArithmeticException ae= new ArithmeticException("divide zero");
			//set the cause of an exception
			ae.initCause(new NullPointerException("actual cause"));
			//throwing the exception
			throw ae;
		} catch (Exception e) {
			System.out.println(e);
			//getting the actual cause of the exception
			System.out.println(e.getCause());
		}
	}
}
