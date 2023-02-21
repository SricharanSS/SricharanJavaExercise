package Exercise4;

interface A {
	void Method1();
	void Method2();
}
interface B {
	void Method3();
	void Method4();
}
interface C {
	void Method5();
	void Method6();
}

interface D extends A,B,C {
	void Method7();
}

class Sample implements D {
	void met1(A a) {
		System.out.println("met1()...");
	}
	
	void met2(A a) {
		System.out.println("met2()...");
	}

	void met3(A a) {
		System.out.println("met3()...");
	}

	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1().....");
		
	}

	@Override
	public void Method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2().....");
	}

	@Override
	public void Method3() {
		// TODO Auto-generated method stub
		System.out.println("Method3().....");
	}

	@Override
	public void Method4() {
		// TODO Auto-generated method stub
		System.out.println("Method4().....");
	}

	@Override
	public void Method5() {
		// TODO Auto-generated method stub
		System.out.println("Method5().....");
	}

	@Override
	public void Method6() {
		// TODO Auto-generated method stub
		System.out.println("Method6().....");
	}

	@Override
	public void Method7() {
		// TODO Auto-generated method stub
		System.out.println("Method7().....");
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		Sample S = new Sample();
		S.met1(S);
		S.met2(S);
		S.met3(S);

	}
}
