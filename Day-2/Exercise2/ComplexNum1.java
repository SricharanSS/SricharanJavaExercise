package Exercise2;

class ComplexNum1 {
	static int a1,b1;
	
	public ComplexNum1(int a, int b) {
		a1 = a;
		b1 = b;
	}
	
	public void Add(int a, int b) {
		this.a1 = this.a1 + a;
		this.b1 = this.b1 + b;
	}
	
	public void PrintNum() {
		System.out.print(a1+"+i"+b1);
	}
}