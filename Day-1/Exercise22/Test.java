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