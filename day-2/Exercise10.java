package Exercise10;

class A {
	A() {
		System.out.println("A Constructor....");
	}
}

class B {
	B() {
		System.out.println("B Constructor...");
	}
}

class C extends A {
	B b = new B();
}

public class Exercise10 {
	public static void main(String[] args) {
		C c = new C();
	}
}
