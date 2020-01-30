package Thread;

public class Result {
	
	protected volatile int k;
	static int count=0;
	public Result() {
		this.k = ++count;	
		System.out.println(k);
	}

		
}
