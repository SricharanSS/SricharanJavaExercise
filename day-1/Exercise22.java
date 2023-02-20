package Exercise22;

class Test {
	private int priVariable = 10;
	private void priMethod() {
		System.out.println("Private Method");
	}
	
	public int pubVariable = 10;
	public void pubMethod() {
		System.out.println("Public Method");
	}
	
	protected int proVariable = 10;
	protected void proMethod() {
		System.out.println("Protected Method");
	}
	
	int Variable = 10;
	void Method() {
		System.out.println("Default Method");
	}
}

public class Exercise22 {
	public static void main(String[] args) {
		Test test = new Test();
		
		System.out.println("Private...");
		System.out.println(test.priVariable);  // Error
		test.priMethod();					   // Error
		
		System.out.println("Public...");
		System.out.println(test.pubVariable);
		test.pubMethod();
		
		System.out.println("Protected...");
		System.out.println(test.proVariable);
		test.proMethod();
		
		System.out.println("Default...");
		System.out.println(test.Variable);
		test.Method();
		
	}

}
