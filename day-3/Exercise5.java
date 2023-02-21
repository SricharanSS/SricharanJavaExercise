package Exercise5;
import SamplePackage.*;

class Sample implements SampleInterface {
	public void Method1() {
		System.out.println("Method1()....");
	}
	
	public void Method2() {
		System.out.println("Method1()....");
	}

	public void Method3() {
		System.out.println("Method1()....");
	}
}

public class Exercise5 {
	public static void main(String[] args) {
		Sample S = new Sample();
		S.Method1();
		S.Method2();
		S.Method3();
	}
}
