package Exercise17;

class Test {
	static int num;
	Test(int n) {
		num = n;
	}
}

public class Exercise17 {
	
	static void m1() {
		System.out.println("from m1()...");
		m2(); // Error
	}
	public void m2() {
		System.out.println("from m2()...");
	}
	
	public static void main(String[] args) {
		Test test = new Test(); //Error as no argument was given
		const int a = 10; // 'const' is not a keyword
		System,out,println(a);
	}
}
