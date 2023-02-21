package Exercise4;
import java.util.Scanner;

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

public class Exercise4 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.push(40);
		s.PrintStack();
	}

}
