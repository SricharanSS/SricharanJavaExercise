package Exercise23;

class Test {
	static int num;
	static {
		num = 10;
	}
}

public class Exercise23 {
	public static void main(String[] args) {
		Test test = new Test();
		ChangeValue(test,20);
		
		System.out.println("Value of num is "+test.num);
	}
	
	static void ChangeValue(Test t, int val) {
		t.num = val;
	}

}
