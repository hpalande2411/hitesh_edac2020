package ds.assignment2;

public class Stack_Demo {

	int[] stack = new int[5];
	int top = 0;

	public void push(int item) {
		if (top == 5 - 1) {
			System.out.println("Error: Stack overflow");
		} else {
			stack[top++] = item;
		}
	}

	public int pop() {
		if (top <= 0) {
			System.out.println("Error: Stack empty");
			return -1;
		} else
			return stack[--top];
	}

	public boolean empty() {
		return top == 0;
	}

	public int top() {
		if (empty()) {
			System.out.println("Error: top on empty stack");
			return -1;
		}
		return stack[top - 1];
	}

	public static void main(String[] args) {

		Stack_Demo ms = new Stack_Demo();
		ms.push(10);
		ms.push(7);
		ms.push(12);
		ms.push(4);
		ms.push(12);
	ms.push(11);
	System.out.println(ms.pop());
	System.out.println(ms.pop());
	}
}
