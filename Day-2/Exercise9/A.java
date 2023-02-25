package Exercise9;

class A {
	private int priVariable = 10;
	private void priMethod() {
		System.out.println("Private Method....");
	}
	
	protected int proVariable = 10;
	protected void proMethod() {
		System.out.println("Protected Method....");
	}
	
	public int pubVariable = 10;
	public void pubMethod() {
		System.out.println("Public Method....");
	}
	
    int defaultVariable = 10;
	void defaultMethod() {
		System.out.println("Default Method....");
	}
}
