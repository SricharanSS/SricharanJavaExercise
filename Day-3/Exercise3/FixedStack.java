package Exercise3;

class FixedStack {
	int stack[] = new int[100];
	int top = -1;
	public void push(int num) {
		stack[++top] = num;
	}
	
	public void pop() {
		int temp = stack[top];
		--top;
		System.out.println(temp+" deleted.");
	}
	
	public void PrintStack() {
		int temp = top;
		while(temp >= 0) {
			System.out.print(stack[temp--]+" ");
		}
		System.out.println();
	}
}