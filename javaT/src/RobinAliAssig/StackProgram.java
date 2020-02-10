package RobinAliAssig;

public class StackProgram extends Exception{

	int size;
	int arr[] = new int[10];
	
	public StackProgram() {}	
	public StackProgram(String ex) {
		
	}
	public boolean isEmpty() {
		return size==0;
	}
		
	public int size() {
		return size;
	}
	
	public void push(int x) throws StackProgram {
		if(size == 0) {
			throw new StackProgram("Stack Full Exception");
		}
		else {
			arr[size++]=x;
		}
	}
	
	public int pop() throws StackProgram{
		if(size == 0) {
			throw new StackProgram("Stack Empty Exception");
		}
		else {
			int m=arr[size - 1];
			size--;
			return m;
		}
	}
	
}
