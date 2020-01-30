package test14;

public class Demo3 {

	public static void main(String[] args) {
		Demo3 d= new Demo3();
		d.show();
	}

	private void show() {
		try {
			int res =10/0;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;// rethrowing the exception 
		}
	}
}
