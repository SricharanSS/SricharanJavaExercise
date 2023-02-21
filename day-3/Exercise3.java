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

class DynamicStack {
	
	class Node {
		int data;
		Node next;
	}
	
	Node top;
	
	DynamicStack() {
		this.top = null;
	}
	
	public void push(int num) {
		Node temp = new Node();
		temp.data = num;
		temp.next = top;
		top = temp;
	}
	
	public void pop() {
		if(top == null) {
			System.out.println("Stack Underflow....");
		}
		else {
			Node temp = top;
			top = top.next;
			
			System.out.println(temp.data+" popped....");
		}
	}
	
	public void PrintStack() {
		if(top == null) {
			System.out.println("Stack Empty");
		}
		else {
			Node temp = top;
			
			while(temp != null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.print("null\n");
		}
	}
	
}

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Fixed Stack.....");
		FixedStack S = new FixedStack();
		S.push(10);
		S.push(20);
		S.push(30);
		S.pop();
		S.push(40);
		S.PrintStack();
		
		System.out.println("Dynamic Stack.....");
		DynamicStack D = new DynamicStack();
		D.push(10);
		D.push(20);
		D.push(30);
		D.pop();
		D.push(40);
		D.PrintStack();
		
	}

}
