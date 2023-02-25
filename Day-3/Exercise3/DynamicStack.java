package Exercise3;

import Exercise3.DynamicStack.Node;

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
