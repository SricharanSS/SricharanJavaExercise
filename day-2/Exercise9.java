package Exercise8;

class A {
	private int priVariable = 10;
	private void priMethod() {
		System.out.print("Private Method....");
	}
	
	protected int proVariable = 10;
	protected void proMethod() {
		System.out.print("Protected Method....");
	}
	
	public int pubVariable = 10;
	public void pubMethod() {
		System.out.print("Public Method....");
	}
	
    int defaultVariable = 10;
	void defaultMethod() {
		System.out.print("Default Method....");
	}
}

public class Exercise9 extends A{
	
	A obj = new A();
	
	
//	System.out.println(obj.priVariable);
//	obj.priMethod();
	
//	System.out.println(obj.proVariable);
//	obj.proMethod();
	
	System.out.println(obj.pubVariable);
	obj.pubMethod();
	
	System.out.println(obj.priVariable);
	obj.priMethod();

}
