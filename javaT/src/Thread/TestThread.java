package Thread;

public class TestThread extends Thread{

	public void run() {
		System.out.println("run");
		new Result();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Result res = new Result();
		TestThread t= new TestThread();
		TestThread t2= new TestThread();
		
		System.out.println(t.getName());
		System.out.println(t2.getName());
		
		t.setName("First Thread");
		t2.setName("Second Thread");

		t.start();
		t2.start();
		
		System.out.println("After changing name of t: "+t.getName());
		System.out.println("After changing name of t2: "+t2.getName());
		

		
	}
}
