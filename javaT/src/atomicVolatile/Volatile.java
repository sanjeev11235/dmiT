package atomicVolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class Volatile {

	public static void main(String args[]) {

		// Initially value as 0
		AtomicInteger val = new AtomicInteger(0);

		// Adds 7 and gets the previous value
		int res = val.getAndAdd(7);

		// Prints the updated value
		System.out.println("Previous value: " + res);

		System.out.println("Current value: " + val);
	}
}
