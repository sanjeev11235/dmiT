package RobinAliAssig;

public class StackCustom {

	int size;
	int arr[];
	int top;

	StackCustom(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	public int peek() {
		if (!this.isEmpty())
			return arr[top];
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		StackCustom StackCustom = new StackCustom(15);
		StackCustom.pop();
		System.out.println("-----------------");
		StackCustom.push(15);
		StackCustom.push(35);
		StackCustom.push(55);
		StackCustom.push(25);
		System.out.println("-----------------");
		StackCustom.pop();
		StackCustom.pop();
		StackCustom.pop();
		System.out.println("-----------------");
		System.out.println(StackCustom.peek());
	}
}
