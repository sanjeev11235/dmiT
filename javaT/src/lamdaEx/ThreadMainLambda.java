package lamdaEx;

import java.lang.Runnable;

public class ThreadMainLambda {

	public static void main(String[] args) {
		
		 
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In Runnable r1");
			}
		};
		Thread t1= new Thread(r1);
		t1.start();
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In Runnable r2");
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
