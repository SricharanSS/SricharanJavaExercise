package Exercise4;

class Stack {
	static int stack[] = new int[100];
	static int top = -1;
	public void push(int num) {
		top++;
		stack[top] = num;
	}
	
	public void pop() {
		int temp = stack[top];
		top--;
		System.out.println(temp+" deleted.");
	}
	
	public void PrintStack() {
		int temp = top;
		
		while(temp >= 0) {
			System.out.print(stack[temp--]+" ");
		}
	}
	
}