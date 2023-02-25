package Exercise3;

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
