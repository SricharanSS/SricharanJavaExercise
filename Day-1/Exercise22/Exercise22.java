package Exercise22;

public class Exercise22 {
	public static void main(String[] args) {
		Test test = new Test();
		
//		System.out.println("Private...");
//		System.out.println(test.priVariable);  // Error
//		test.priMethod();					   // Error
		
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
