package Exercise6;

public class Exercise6 {
	
	
	static int num = m1();
	
	
	
	static {
		System.out.println("First Static Block");
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
	static int m1() {
		System.out.println("From m1");
		return 10;
	}

}
