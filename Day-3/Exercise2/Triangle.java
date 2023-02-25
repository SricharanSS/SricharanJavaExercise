package Exercise2;

class Triangle implements CalcArea {
	int a,b,c;
	public double area;
	
	Triangle(int A, int B, int C) {
		a = A;
		b = B;
		c = C;
	}
	
	public void Area() {
		int s = (a+b+c)/2;
		int t = s*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(t);
	}
}
